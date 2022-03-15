package de.application;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

       Iterator<String> it = new MyConsolenIterator();

       while(it.hasNext()) {
           System.out.println("Echo: " + it.next());
       }

    }
}
