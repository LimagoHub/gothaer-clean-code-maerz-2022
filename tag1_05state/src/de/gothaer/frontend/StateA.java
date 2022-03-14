package de.gothaer.frontend;

import java.nio.channels.NotYetBoundException;

public class StateA extends AbstractState{
    public StateA(Front front) {
        super(front);
    }

    @Override
    public void drucken() {
        System.out.println("Hier druckt A");
    }

    @Override
    public void changeToB() {
        getFront().current = getFront().stateB;
    }
}
