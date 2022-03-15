package application;

import de.tiere.Schwein;
import de.tiere.SchweinMemento;

public class Main {

    public static void main(String[] args) {

        Schwein piggy = new Schwein("Miss Piggy");
        System.out.println(piggy);

        SchweinMemento memento = piggy.getMemento();

        piggy.fressen();



        System.out.println(piggy);

        piggy.setMemento(memento);

        System.out.println(piggy);



    }
}
