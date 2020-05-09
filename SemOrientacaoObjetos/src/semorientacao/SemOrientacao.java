package semorientacao;

import java.util.Locale;
import javax.swing.JOptionPane;

/**
 * @author renoa
 */
public class SemOrientacao {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        int xA = Integer.parseInt(JOptionPane.showInputDialog("Enter the 1° measure of triangle X: "));
        int xB = Integer.parseInt(JOptionPane.showInputDialog("Enter the 2° measure of triangle X: "));
        int xC = Integer.parseInt(JOptionPane.showInputDialog("Enter the 3° measure of triangle X: "));

        int yA = Integer.parseInt(JOptionPane.showInputDialog("Enter the 1° measure of triangle Y: "));
        int yB = Integer.parseInt(JOptionPane.showInputDialog("Enter the 2° measure of triangle Y: "));
        int yC = Integer.parseInt(JOptionPane.showInputDialog("Enter the 3° measure of triangle Y: "));

        float pX = calculateP(xA, xB, xC);
        double areaX = calculateArea(pX, xA, xB, xC);

        float pY = calculateP(yA, yB, yC);
        double areaY = calculateArea(pY, yA, yB, yC);
        double largerArea = calculateLargerArea(areaX, areaY);

        ShowResult(largerArea);

    }

    public static double calculateArea(float p, int a, int b, int c) {
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return area;
    }

    public static float calculateP(int a, int b, int c) {
        return (a + b + c) / 2;
    }

    private static void ShowResult(Double largerArea) {
        JOptionPane.showMessageDialog(null, "The larger area is: " + largerArea);
    }

    private static Double calculateLargerArea(double areaX, double areaY) {
        return areaX > areaY ? areaX : areaY;
    }

}
