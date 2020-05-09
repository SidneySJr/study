/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaio;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

/**
 *
 * @author maryucha
 */
public class TesteEscrita2 {

    public static void main(String[] args) throws IOException {
        
        FileWriter fw = new FileWriter("texto5.txt");       
        fw.write("Teste no arquivo 5?\n");        
        fw.write("\nOlha eu mandando ver em JAVA");
        
        fw.close();
        
//        PrintStream ps = new PrintStream("texto6.txt");
//        ps.println("Bora testar essa merda de código");
//        
//        ps.close();
        }       
    }
