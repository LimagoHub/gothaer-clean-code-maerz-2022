package de.applocation;

import de.beans.Person;

public class Main {
    public static void main(String[] args) {
        Person p = Person
                .builder()
                .vorname("John")
                .ort("Berlin")
                .build();
        System.out.println(p);

    }
}
