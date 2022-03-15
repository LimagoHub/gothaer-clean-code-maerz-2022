package de.gothaer.fileprocessor;

public abstract class AbstractCounter extends AbstractFileProcessor{
    private int counter;

    protected int getCounter() {
        return counter;
    }

    protected void setCounter(int counter) {
        this.counter = counter;
    }

    @Override
    public void init() {
        setCounter(0);
    }

    @Override
    public void dispose() {
        System.out.println(this.getClass().getSimpleName() +": Anzahl = " + getCounter());
    }
}
