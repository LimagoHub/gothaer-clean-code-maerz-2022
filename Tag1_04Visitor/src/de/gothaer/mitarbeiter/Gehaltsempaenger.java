package de.gothaer.mitarbeiter;

import de.gothaer.visitors.MitarbeiterVisitor;

public class Gehaltsempaenger extends AbstractMitarbeiter{

    private double gehalt;

    public Gehaltsempaenger(String name) {
        this(name, 1000);
    }
    public Gehaltsempaenger(String name, double gehalt) {
        super(name);
        setGehalt(gehalt);
    }

    public double getGehalt() {
        return gehalt;
    }

    public final void setGehalt(double gehalt) {
        this.gehalt = gehalt;
    }

    @Override
    public String toString() {
       return super.toString() + " Gehalt="  + getGehalt();
    }

    @Override
    public void accept(MitarbeiterVisitor visitor) {
        visitor.visit(this);
    }
}
