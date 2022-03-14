package de.gothaer;

public class Singleton {
    private static Singleton instance = null;

    public synchronized static Singleton getInstance() {
        if(instance == null)
            instance = new Singleton();
        return instance;
    }

    private Singleton(){}

    public void foo() {
        System.out.println("Hier ist foo");
    }
}
