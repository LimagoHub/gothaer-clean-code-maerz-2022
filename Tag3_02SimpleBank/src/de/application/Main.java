package de.application;

import de.composite.AbstractKonto;
import de.composite.Konto;
import de.composite.KontoGruppe;

public class Main {

    public static void main(String[] args) {

        KontoGruppe root = new KontoGruppe("Root");

        KontoGruppe e1_1 = new KontoGruppe("E1_1");
        root.appendChild(e1_1);

        KontoGruppe e1_2 = new KontoGruppe("E1_2");
        root.appendChild(e1_2);

        Konto e_2_1_1 = new Konto("e_2_1_1");
        e1_1.appendChild(e_2_1_1);

        Konto e_2_1_2 = new Konto("e_2_1_2");
        e1_1.appendChild(e_2_1_2);

        root.print();
    }


}
