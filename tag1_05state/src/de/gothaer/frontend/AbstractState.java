package de.gothaer.frontend;

public abstract class AbstractState implements State{

    private final Front front;

    public AbstractState(Front front) {
        this.front = front;
    }

    public Front getFront() {
        return front;
    }

    @Override
    public void drucken() {
        throw new UnsupportedOperationException("Häh?");
    }

    @Override
    public void changeToA() {
        throw new UnsupportedOperationException("Häh?");
    }

    @Override
    public void changeToB() {
        throw new UnsupportedOperationException("Häh?");
    }
}
