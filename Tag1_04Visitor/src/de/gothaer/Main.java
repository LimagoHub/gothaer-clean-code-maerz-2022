package de.gothaer;

import de.gothaer.firma.Firma;
import de.gothaer.mitarbeiter.Gehaltsempaenger;
import de.gothaer.mitarbeiter.Lohnempaenger;
import de.gothaer.visitors.PrintVisitor;

public class Main {

    public static void main(String[] args) {
        Firma firma = new Firma();

        firma.add(new Gehaltsempaenger("Schmidt", 2000));
        firma.add(new Lohnempaenger("Hinz", 12,36));
        firma.add(new Lohnempaenger("Kunt", 12,40));
        firma.add(new Gehaltsempaenger("Mayer", 2500));
        firma.add(new Gehaltsempaenger("Schulz", 1500));

        //firma.print();
        firma.iterate(new PrintVisitor());
    }
}
