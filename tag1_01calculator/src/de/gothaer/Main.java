package de.gothaer;

import de.gothaer.client.CalcClient;
import de.gothaer.math.*;

public class Main {
    public static void main(String[] args) {


        CalcClient client = new CalcClient(CalculatorFactory.create());
        client.run();
    }
}
