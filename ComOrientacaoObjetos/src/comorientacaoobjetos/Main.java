package comorientacaoobjetos;

import entities.Triangulo;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 * @author renoa
 */
public class Main {

    public static void main(String[] args) {
        Triangulo x, y;

        x = new Triangulo();
        y = new Triangulo();

        x.setA(Integer.parseInt(JOptionPane.showInputDialog("Enter the 1° measure of triangle X: ")));
        x.setB(Integer.parseInt(JOptionPane.showInputDialog("Enter the 2° measure of triangle X: ")));
        x.setC(Integer.parseInt(JOptionPane.showInputDialog("Enter the 3° measure of triangle X: ")));

        y.setA(Integer.parseInt(JOptionPane.showInputDialog("Enter the 1° measure of triangle X: ")));
        y.setB(Integer.parseInt(JOptionPane.showInputDialog("Enter the 2° measure of triangle X: ")));
        y.setC(Integer.parseInt(JOptionPane.showInputDialog("Enter the 3° measure of triangle X: ")));

        double areaX = x.calculateArea();
        double areaY = y.calculateArea();

        showResult(calculateLargerArea(areaX, areaY));

    }

    public static void showResult(double largerArea) throws HeadlessException {
        JOptionPane.showMessageDialog(null, "The larger area is: " + largerArea);
    }

    public static double calculateLargerArea(double x, double y) {
        return x > y ? x : y;
    }
}
