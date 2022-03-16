package de.composite;

public class Konto extends AbstractKonto {

    private double saldo = 0.0;
    public Konto() {
    }

    public Konto(String label) {
        super(label);
    }

    public Konto(double saldo) {
        this.saldo = saldo;
    }

    public Konto(String label, double saldo) {
        super(label);
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString());
        sb.append(" saldo=").append(saldo);
        return sb.toString();
    }
}
