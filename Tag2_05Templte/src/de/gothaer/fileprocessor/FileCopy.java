package de.gothaer.fileprocessor;

import java.io.FileWriter;
import java.io.IOException;

public class FileCopy extends AbstractFileProcessor{

    private FileWriter out;

    @Override
    public void init() {
        try {
            out = new FileWriter("Ausgabe.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void process(char c) {
        try {
            out.write(c);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void dispose() {
        try {
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
