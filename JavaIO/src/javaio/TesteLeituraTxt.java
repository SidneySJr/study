/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaio;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * @version 1.0
 * @author maryucha
 */
public class TesteLeituraTxt {

    public static void main(String[] args) throws IOException {

        InputStream fis = new FileInputStream("texto.txt");//entrada de arquivo
        Reader isr = new InputStreamReader(fis);           //transforma os bytes em caracteres
        BufferedReader br = new BufferedReader(isr);       //juntar os caracteres de uma linha

        String linha = br.readLine();
        while (linha != null) {
            System.out.println(linha);
            linha = br.readLine();
        }
        br.close();
    }
}
