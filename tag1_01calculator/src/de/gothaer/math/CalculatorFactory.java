package de.gothaer.math;

public class CalculatorFactory {

    private static boolean logger = true;
    private static boolean secure = false;
    public static Calculator create() {
        Calculator calculator = new CalculatorImpl();
        if(logger) calculator = new CalculatorLogger(calculator);
        if (secure) calculator = new CalculatorSecure(calculator);
        return calculator;
    }
}
