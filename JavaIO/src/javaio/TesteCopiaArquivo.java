/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

/**
 *
 * @author maryucha
 */
public class TesteCopiaArquivo {

    public static void main(String[] args) throws IOException {


        //ENTRADA DO ARQUIVO
        InputStream fis = new FileInputStream("texto.txt");  //entrada de arquivo
        Reader isr = new InputStreamReader(fis);               //transforma os bytes em caracteres
        BufferedReader br = new BufferedReader(isr);           //juntar os caracteres de uma linha

        //SAÍDA DO ARQUIVO
        OutputStream fos = new FileOutputStream("texto3.txt");  //saída do arquivo
        Writer osw = new OutputStreamWriter(fos);               //transforma os bytes em caracteres
        BufferedWriter bw = new BufferedWriter(osw);            //juntar os caracteres de uma linha

        //PRINTANDO A PORRA TODA
        String linha = br.readLine();
        while (linha != null) {
            bw.write(linha);
            bw.newLine();
            linha = br.readLine();
        }
        br.close();
        bw.close();
    }
}
