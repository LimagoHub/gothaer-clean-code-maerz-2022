package de.services;

import java.lang.reflect.Method;
import java.util.Scanner;

public class BeanProducer {


    public static final String PROMPT = "Bitte Wert fuer %s eingeben";
    private static final String PREFIX ="set";

    // Rückgabe im Fehlerfall ist null
    public Object createAndFillBean(String fullQualifiedClassName) {

        try(Scanner scanner = new Scanner(System.in)) {
            Object result = Class.forName(fullQualifiedClassName).getConstructor().newInstance();

            for(Method m: result.getClass().getMethods()) {
                if(m.getName().startsWith(PREFIX)) {
                    System.out.println(String.format(PROMPT, m.getName().substring(PREFIX.length())));
                    m.invoke(result, scanner.next());
                }
            }
            return result;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
