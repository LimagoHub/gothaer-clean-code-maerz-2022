package de.gothaer;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class Main {
    public static void main(String[] args) throws Exception{
//        Singleton.getInstance().foo();
//
//        System.out.println(Singleton.getInstance() == Singleton.getInstance());

        Object o = new Object();
        System.out.println(o);
        WeakReference<Object> wr = new WeakReference<>(o);

        System.gc();

        Thread.sleep(1000);

        o = null;
        o = wr.get();
        System.out.println(o);

    }
}
