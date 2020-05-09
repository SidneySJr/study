package saida;


import java.util.Locale;

/**
 * @author renoa
 */
public class Escrita {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        double x = 10.35724;
        System.out.print("Hello Word!");
        System.out.println("Bom dia!");
        System.out.printf("%.2f %n \n", x);
        System.out.printf("%.4f \n", x);
        System.out.println("RESULTADO = " + x + " METROS");
        System.out.printf("RESULTADO = %.2f METROS\n", x);
        
        String nome = "Maria";
        int idade = 31;
        double renda = 4000.00;
        
        System.out.printf("%s tem %d anos e ganha %.2f reais \n", nome, idade, renda);

    }
}
