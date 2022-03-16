package de.composite;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public abstract class AbstractKonto {

    private AbstractKonto parent = null;
    private String label;

    public AbstractKonto() {
        this("NoName");
    }

    public AbstractKonto(final String label) {
        this.label = label;
    }

    public AbstractKonto getParent() {
        return parent;
    }

    public void setParent(AbstractKonto parent) {
        this.parent = parent;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(getClass().getSimpleName() +"{");
        sb.append(" label='").append(label).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public List<AbstractKonto> getChildren() {
        return Collections.emptyList();
    }

    public void print() {
        iterator().forEachRemaining(System.out::println);
    }

    public Iterator<AbstractKonto> iterator() {
        final var resultList = new ArrayList<AbstractKonto>();
        iteratorRecursiveImpl(resultList);
        return resultList.iterator();
    }
    private void iteratorRecursiveImpl(List<AbstractKonto> list) {
        list.add(this);
        getChildren().forEach(c->c.iteratorRecursiveImpl(list));
    }
}
