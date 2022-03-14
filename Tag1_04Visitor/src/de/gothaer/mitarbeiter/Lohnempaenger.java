package de.gothaer.mitarbeiter;

import de.gothaer.visitors.MitarbeiterVisitor;

public class Lohnempaenger extends  AbstractMitarbeiter{
    private double stundenlohn;
    private double arbeitszeit;

    public Lohnempaenger(String name) {
        this(name, 10.5, 40);
    }
    public Lohnempaenger(String name, double stundenlohn, double arbeitszeit) {
        super(name);
        setStundenlohn(stundenlohn);
        setArbeitszeit(arbeitszeit);
    }

    public double getStundenlohn() {
        return stundenlohn;
    }

    public final void setStundenlohn(double stundenlohn) {
        this.stundenlohn = stundenlohn;
    }

    public double getArbeitszeit() {
        return arbeitszeit;
    }

    public final void setArbeitszeit(double arbeitszeit) {
        this.arbeitszeit = arbeitszeit;
    }

    @Override
    public String toString() {
        return super.toString() + " Stundenlohn="  + getStundenlohn() + ". Arbeitszeit=" + getArbeitszeit();
    }

    @Override
    public void accept(MitarbeiterVisitor visitor) {
        visitor.visit(this);
    }
}
