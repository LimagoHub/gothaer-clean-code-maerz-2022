package de.gothaer.frontend;

import java.nio.channels.NotYetBoundException;

public class StateB extends AbstractState{
    public StateB(Front front) {
        super(front);
    }

    @Override
    public void drucken() {
        System.out.println("Hier druckt B");
    }

    @Override
    public void changeToA() {
        getFront().current = getFront().stateA;
    }
}
