package application;

import java.util.Locale;
import javax.swing.JOptionPane;

/**
 * @author sidney
 */
public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double[] arrayOfPeople;
        var total = 0.0;

        JOptionPane.showMessageDialog(null, "Average heigth");
        var numberOfPeople = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of peoples to register"));

        arrayOfPeople = new double[numberOfPeople];

        for (int i = 0; i < arrayOfPeople.length; i++) {
            arrayOfPeople[i] = Double.parseDouble(JOptionPane.showInputDialog("Enter people's height"));
            total += arrayOfPeople[i]; // Evita um novo for para verificar o total de alturas
        }

//        for (double d : arrayOfPeople) {
//            total += d;
//        }

        var average = total / numberOfPeople;

        JOptionPane.showMessageDialog(null, "The average height is " + String.format("%.2f", average));
    }
}
