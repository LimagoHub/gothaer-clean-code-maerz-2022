package de.gothaer.firma;

import de.gothaer.mitarbeiter.AbstractMitarbeiter;
import de.gothaer.visitors.MitarbeiterVisitor;

import java.util.ArrayList;
import java.util.List;

public class Firma {

    private final List<AbstractMitarbeiter> mitarbeiters = new ArrayList<>();

    public void add(AbstractMitarbeiter mitarbeiter) {
        mitarbeiters.add(mitarbeiter);
    }

    public void print() {
        mitarbeiters.forEach(System.out::println);
    }

    public void iterate(MitarbeiterVisitor visitor) {
        for (AbstractMitarbeiter mitarbeiter: mitarbeiters ) {
            mitarbeiter.accept(visitor);
        }
    }
}
