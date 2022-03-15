package de.application;

import de.gothaer.fileprocessor.AbstractFileProcessor;
import de.gothaer.fileprocessor.CharacterCounter;
import de.gothaer.fileprocessor.FileCopy;
import de.gothaer.fileprocessor.LineCounter;

public class Main {
    public static void main(String[] args) {
        AbstractFileProcessor fileprocessor = new CharacterCounter();

        fileprocessor.process("demo.txt");
    }
}
