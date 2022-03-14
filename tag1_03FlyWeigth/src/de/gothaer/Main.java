package de.gothaer;

import java.time.Duration;
import java.time.Instant;

public class Main {

    public static void main(String[] args) {
//        AttributedCharater a1 = AttributedCharater.getInstance('A', false);
//        AttributedCharater a2 = AttributedCharater.getInstance('A', false);
//        AttributedCharater a3 = AttributedCharater.getInstance('A', true);
//
//        System.out.println(a1 == a2);
//        System.out.println(a1 == a3);
          StringBuilder sb  = new StringBuilder();

        Instant start = Instant.now();
        for (int i = 0; i < 1_000_000; i++) {
            sb.append("a");
        }
        String s = sb.toString();
        Instant end= Instant.now();

        System.out.println("Duration = " + Duration.between(start,end).toMillis());

    }
}
