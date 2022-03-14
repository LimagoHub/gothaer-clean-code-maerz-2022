package de.gothaer.visitors;

import de.gothaer.mitarbeiter.AbstractMitarbeiter;
import de.gothaer.mitarbeiter.Gehaltsempaenger;
import de.gothaer.mitarbeiter.Lohnempaenger;

public class PrintVisitor implements MitarbeiterVisitor{
    @Override
    public void visit(Gehaltsempaenger gehaltsempaenger) {
        print(gehaltsempaenger);
    }

    @Override
    public void visit(Lohnempaenger lohnempaenger) {
        print(lohnempaenger);
    }

    private void print(AbstractMitarbeiter mitarbeiter) {
        System.out.println(mitarbeiter);
    }
}
