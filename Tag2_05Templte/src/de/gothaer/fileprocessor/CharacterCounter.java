package de.gothaer.fileprocessor;

public class CharacterCounter extends AbstractCounter {



    @Override
    public void process(char c) {
        setCounter(getCounter() + 1);
    }


}
