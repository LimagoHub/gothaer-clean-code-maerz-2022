package de.gothaer.visitors;

import de.gothaer.mitarbeiter.Gehaltsempaenger;
import de.gothaer.mitarbeiter.Lohnempaenger;

public abstract class AbstractMitarbeiterVisitor implements  MitarbeiterVisitor{
    @Override
    public void visit(Gehaltsempaenger gehaltsempaenger) {
        // Ok
    }

    @Override
    public void visit(Lohnempaenger lohnempaenger) {
        // ok
    }
}
