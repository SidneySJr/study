package util;

/**
 * @author sidney
 */
public class CurrencyConverter {

    public static double conversionValue(double price, double amount) {
        return amount * price;
    }

    public static double calculateIof(double value) {
        return value * 0.06;
    }
}
