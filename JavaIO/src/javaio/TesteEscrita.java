/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaio;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

/**
 *
 * @author maryucha
 */
public class TesteEscrita {

    public static void main(String[] args) throws IOException {
        
        OutputStream fos = new FileOutputStream("texto2.txt");//saída do arquivo
        Writer osw = new OutputStreamWriter(fos);            //transforma os bytes em caracteres
        BufferedWriter bw = new BufferedWriter(osw);         //juntar os caracteres de uma linha
        
        bw.write("\\\\Gabriela eu te amo sabia\\\\?");
        bw.newLine();
        bw.newLine();
        bw.write("Olha eu mandando ver em JAVA");
        
        bw.close();
        }       
    }
