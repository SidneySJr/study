package funcoes;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 * @author renoa
 */
public class Funcoes {

    public static void main(String[] args) {

        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1° numero: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2° numero: "));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Digite o 3° numero: "));

        int maior = max(a, b, c);

        ShowResult(maior);

    }

    public static void ShowResult(int maior) throws HeadlessException {
        JOptionPane.showMessageDialog(null, "O maior numero é " + maior);
    }

    private static int max(int a, int b, int c) {

        int maior = a;

        if (a < b) {
            maior = b;
        }
        if (c > maior) {
            maior = c;
        }

        return maior;

    }

}
