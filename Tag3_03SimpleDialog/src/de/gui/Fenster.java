package de.gui;

import javax.swing.text.FlowView;
import java.awt.*;

public class Fenster extends Frame {

    private Panel centerPanel = null;
    private Panel southPanel = null;

    private TextField euroTxT = null;
    private TextField dollarTxT = null;

    private Button rechnenBtn = null;
    private Button beendenBtn = null;

    public Fenster() throws HeadlessException {
        add(getCenterPanel(), BorderLayout.CENTER);
        add(getSouthPanel(), BorderLayout.SOUTH);
        pack();
    }

    private Panel getCenterPanel() {
        if(centerPanel == null) {
            centerPanel = new Panel(new GridLayout(2,2));
            centerPanel.add(new Label("Euro"));
            centerPanel.add(getEuroTxT());
            centerPanel.add(new Label("Dollar"));
            centerPanel.add(getDollarTxT());
        }
        return centerPanel;
    }

    private Panel getSouthPanel() {
        if(southPanel == null) {
            southPanel = new Panel(new FlowLayout(FlowLayout.CENTER));
            southPanel.add(getRechnenBtn());
            southPanel.add(getBeendenBtn());
        }
        return southPanel;
    }

    private TextField getEuroTxT() {
        if(euroTxT == null) {
            euroTxT = new TextField(10);
            euroTxT.addTextListener(e->rechnen());
        }
        return euroTxT;
    }

    private TextField getDollarTxT() {
        if(dollarTxT == null) {
            dollarTxT = new TextField(10);
            dollarTxT.setEditable(false);
        }
        return dollarTxT;
    }

    private Button getRechnenBtn() {
        if(rechnenBtn == null) {
            rechnenBtn = new Button("Rechnen");
            rechnenBtn.addActionListener(e->rechnen());
        }
        return rechnenBtn;
    }

    private Button getBeendenBtn() {
        if(beendenBtn == null) {
            beendenBtn = new Button("Beenden");
            beendenBtn.addActionListener(e->dispose());
        }
        return beendenBtn;
    }

    private void rechnen() {
        try {
            double euro = Double.valueOf(getEuroTxT().getText());
            double dollar = euro *1.1;
            getDollarTxT().setText("" + dollar);
        } catch (NumberFormatException e) {
            getDollarTxT().setText(e.getMessage());
        }
    }

    public static void main(String[] args) {
        new Fenster().setVisible(true);
    }
}
