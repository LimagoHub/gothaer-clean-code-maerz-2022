package de.gothaer.application;

import de.gothaer.tiere.Schwein;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception{

        // 1. Fall
        Class<?> clazz = Schwein.class;

        // 2. Fall
        Schwein s = new Schwein();
        clazz = s.getClass();

        // 3. Fall
        clazz = Class.forName("de.gothaer.tiere.Schwein");

        System.out.println(clazz.getSimpleName());

        Method [] methods = clazz.getMethods();
        for(Method m : methods) {

            System.out.println(m.getName());
        }
        System.out.println("----------------------------------------");
        methods = clazz.getDeclaredMethods();
        for(Method m : methods) {

            System.out.println(m.getName());
        }

        //Object object = clazz.getConstructor(String.class, int.class).newInstance("Miss Piggy",10);
        Object object = clazz.getConstructor().newInstance();
        System.out.println(object);

        Method m = clazz.getMethod("fressen");
        m.invoke(object);
        System.out.println(object);

        m = clazz.getDeclaredMethod("setGewicht", int.class);
        m.setAccessible(true);
        m.invoke(object, -10);
        System.out.println(object);
    }
}
