package entrada;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author renoa
 */
public class Leitura {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.next();
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        System.out.print("Digite seu salario: ");
        double salario = sc.nextDouble();

        System.out.println("\nSeu nome é " + nome + "\nSua idade é: " + idade + "\nSeu salario é: " + salario);

        char c;

        System.out.print("\nDigite a primeira letra do seu nome: ");
        c = sc.next().charAt(0);

        System.out.println("\nA primeira letra do seu nome é: " + c);

        System.out.print("\nDigite seu nome, sua idade e seu salario: ");
        nome = sc.next(); // nextLine para ler mais de uma palavra
        idade = sc.nextInt();
        salario = sc.nextDouble();

        sc.close();

        System.out.println("\nSeu nome é " + nome + "\nSua idade é: " + idade + "\nSeu salario é: " + salario);

    }

}
