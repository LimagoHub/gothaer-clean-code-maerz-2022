package de.main;

import de.tiere.PigTooFatListener;
import de.tiere.Schwein;
import de.tiere.Tier;

public class Main {

    private Metzger metzger = new Metzger();
    private Spediteur spediteur = new Spediteur();

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Schwein piggy = new Schwein("Miss Piggy");
        piggy.addPigTooFatListener(new SchweineMetzgerAdapter());
        piggy.addPigTooFatListener(spediteur::fahren);
        for (int i = 0; i < 12; i++) {
            piggy.fressen();
        }
    }
    class SchweineMetzgerAdapter implements PigTooFatListener{

        @Override
        public void pigTooFat(Schwein sender) {
            metzger.schlachten(sender);
        }
    }
}

class Metzger  {


    public void schlachten(Tier sender) {
        System.out.println("Messer wetz");
    }
}

class Spediteur {

    public void fahren(Object sender) {
        System.out.println("Wir fahren auf der Autobahn");
    }
}
