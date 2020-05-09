package main;

import entities.Retangle;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 * @author sidney
 */
public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Retangle retangle;
        retangle = new Retangle();

        JOptionPane.showMessageDialog(null, "Enter the data of retangle");
        var width = Double.parseDouble(JOptionPane.showInputDialog("Enter the width of retangle"));
        var height = Double.parseDouble(JOptionPane.showInputDialog("Entre the height of retangle"));

        retangle.setWidth(width);
        retangle.setHeight(height);

        JOptionPane.showMessageDialog(null, retangle.toString());

    }
}
