package de.gothaer.mitarbeiter;

import de.gothaer.visitors.MitarbeiterVisitor;

import java.util.UUID;

public abstract class AbstractMitarbeiter {

    private final String personalnr = UUID.randomUUID().toString();
    private final String name;

    protected AbstractMitarbeiter(String name) {
        this.name = name;
    }

    public String getPersonalnr() {
        return personalnr;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(getClass().getSimpleName() + " {");
        sb.append("personalnr='").append(personalnr).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public abstract void accept(MitarbeiterVisitor visitor);
}
