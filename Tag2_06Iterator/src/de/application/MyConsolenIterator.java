package de.application;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.Scanner;

public class MyConsolenIterator implements Iterator<String> {

    private final Scanner scanner = new Scanner(System.in);
    private String zeile;
    @Override
    public boolean hasNext() {
        System.out.print("#>");
        zeile = scanner.nextLine();
        return ! "ende".equalsIgnoreCase(zeile);
    }

    @Override
    public String next() {
        return zeile;
    }
}
