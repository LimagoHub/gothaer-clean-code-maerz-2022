package de.gothaer;

import de.gothaer.frontend.Front;

public class Client {
    public static void main(String[] args) {

        Front front = new Front();
        front.drucken();

        front.changeToB();
        front.drucken();
        front.changeToB();
    }
}
