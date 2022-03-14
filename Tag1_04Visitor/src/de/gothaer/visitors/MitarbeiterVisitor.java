package de.gothaer.visitors;

import de.gothaer.mitarbeiter.Gehaltsempaenger;
import de.gothaer.mitarbeiter.Lohnempaenger;

public interface MitarbeiterVisitor {

    void visit(Gehaltsempaenger gehaltsempaenger);
    void visit(Lohnempaenger lohnempaenger);

}
