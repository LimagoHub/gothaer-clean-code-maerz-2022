package de.tiere;

import java.util.ArrayList;
import java.util.List;

public class Schwein extends Tier{

    private List<PigTooFatListener> pigTooFatListeners = new ArrayList<>();
    private String name;
    private int gewicht;

    public Schwein() {
        this("Nobody");
    }

    public Schwein(String name) {
        this.name = name;
        gewicht = 10;
    }

    public void addPigTooFatListener(PigTooFatListener listener){
        pigTooFatListeners.add(listener);
    }
    public void removePigTooFatListener(PigTooFatListener listener){
        pigTooFatListeners.remove(listener);
    }

    private void firePigTooFatEvent() {
        pigTooFatListeners.forEach(p->p.pigTooFat(this));
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGewicht() {
        return gewicht;
    }

    private void setGewicht(int gewicht) {
        this.gewicht = gewicht;
        if(gewicht > 20)
            firePigTooFatEvent();
    }

    public void fressen() {
        setGewicht(getGewicht() +1);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Schwein{");
        sb.append("name='").append(name).append('\'');
        sb.append(", gewicht=").append(gewicht);
        sb.append('}');
        return sb.toString();
    }
}
