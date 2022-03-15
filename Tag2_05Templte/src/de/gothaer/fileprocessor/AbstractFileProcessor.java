package de.gothaer.fileprocessor;

import java.io.FileReader;

public abstract class AbstractFileProcessor {

    private static final int END_OF_FILE = -1;
    public final void process(String filename) {
        try (FileReader reader = new FileReader(filename)) {

            init();

            int c;
            while( (c = reader.read()) != END_OF_FILE) {
               process((char) c);
            }
            dispose();


        } catch( Exception e) {
            e.printStackTrace();
        }
    }

    public void init() {
        // Ok
    }

    public abstract void process(char c);

    public void dispose() {
        // Ok
    }
}
