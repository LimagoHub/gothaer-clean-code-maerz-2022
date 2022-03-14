package de.gothaer;

import de.gothaer.client.CalcClient;
import de.gothaer.math.*;

import java.time.Duration;
import java.time.Instant;

public class Main {
    public static void main(String[] args) {

        Instant start = Instant.now();
        CalcClient client = new CalcClient(CalculatorFactory.create());
        client.run();
        Instant ende = Instant.now();

        Duration duration =Duration.between(start, ende);
        System.out.println("Duration = " + duration.toMillis());
    }
}
