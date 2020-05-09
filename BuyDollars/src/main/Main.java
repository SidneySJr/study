package main;

import java.util.Locale;
import javax.swing.JOptionPane;
import util.CurrencyConverter;

/**
 * @author sidney
 */
public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        var price = Double.parseDouble(JOptionPane.showInputDialog("What is dollar price"));
        var amount = Double.parseDouble(JOptionPane.showInputDialog("How many dollars will be bougth"));
        var total = CurrencyConverter.conversionValue(price, amount);

        JOptionPane.showMessageDialog(null, "Negotiation:"
                + "\nPrice dollar: $" + String.format("%.2f", price)
                + "\nAcquired value: $" + String.format("%.2f", amount)
                + "\nIOF value: R$" + String.format("%.2f", CurrencyConverter.calculateIof(total))
                + "\nTotal in Reais: R$" + String.format("%.2f", total));

    }
}
