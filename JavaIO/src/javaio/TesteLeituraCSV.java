/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaio;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

/**
 * ==Essa main é responsavel por Scannear o doc contas CSV
 * e separar por linhas, depois cada linha vira um vetor
 * e cada item é formatado;
 * @version 1.0
 * @author maryucha
 */
public class TesteLeituraCSV {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(new File("contas.csv"),"UTF-8");

        while (scanner.hasNextLine()) {
            String linha = scanner.nextLine();
            //System.out.println(linha);

            Scanner linhaScanner = new Scanner(linha);
            linhaScanner.useLocale(Locale.US);
            linhaScanner.useDelimiter(",");

            String tipoConta = linhaScanner.next();
            int agencia = linhaScanner.nextInt();
            int numero = linhaScanner.nextInt();
            String nome = linhaScanner.next();
            double saldo = linhaScanner.nextDouble();

            String valorFormatado = String.format("Tipo da conta-> %s Agência-> %d Número da Conta-> %d Nome do Titular-> %s Saldo da Conta R$%.2f %n"
                                                  , tipoConta, agencia, numero, nome, saldo);
            System.out.println(valorFormatado);
            linhaScanner.close();

//            String[] valores = linha.split(",");
//            System.out.println(valores[1]);
        }

        scanner.close();
    }
}
