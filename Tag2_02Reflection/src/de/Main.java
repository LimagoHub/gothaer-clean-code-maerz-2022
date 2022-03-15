package de;

import de.services.BeanProducer;

public class Main {
    public static void main(String[] args) {

        Object object = new BeanProducer().createAndFillBean("de.gothaer.beans.Person");
        System.out.println(object);
    }
}
