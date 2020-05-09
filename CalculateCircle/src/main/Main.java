package main;

import java.util.Locale;
import javax.swing.JOptionPane;
import util.Calculator;

/**
 * @author sidney
 */
public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        var radius = Double.parseDouble(JOptionPane.showInputDialog("Enter the radius"));

        var c = Calculator.circunference(radius);
        var v = Calculator.volume(radius);

        JOptionPane.showMessageDialog(null, "Circunference: " + String.format("%.2f", c)
                + "\nVolume: " + String.format("%.2f", v)
                + "\nPI: " + String.format("%.2f", Calculator.PI));
    }

}
