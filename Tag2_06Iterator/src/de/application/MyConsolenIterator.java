package de.application;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.Scanner;

public class MyConsolenIterator implements Iterator<String> {

    private final Scanner scanner = new Scanner(System.in);
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public String next() {
        return null;
    }
}
