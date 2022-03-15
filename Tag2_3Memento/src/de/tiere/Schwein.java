package de.tiere;

public class Schwein {

    private String name;
    private int gewicht;

    public Schwein() {
        this("Nobody");
    }

    public Schwein(String name) {
        this.name = name;
        gewicht = 10;
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
    }
    public void fressen() {
        gewicht ++;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Schwein{");
        sb.append("name='").append(name).append('\'');
        sb.append(", gewicht=").append(gewicht);
        sb.append('}');
        return sb.toString();
    }

    public SchweinMemento getMemento() {
        return new MySchweineMemento(name, gewicht);
    }

    public void setMemento(SchweinMemento schweinMemento) {
        MySchweineMemento memento = (MySchweineMemento) schweinMemento;
        name = memento.getName();
        gewicht = memento.gewicht;
    }

    private static class MySchweineMemento implements SchweinMemento {
        final String name;
        final int gewicht;

        public MySchweineMemento(String name, int gewicht) {
            this.name = name;
            this.gewicht = gewicht;
        }

        public String getName() {
            return name;
        }

        public int getGewicht() {
            return gewicht;
        }
    }
}
