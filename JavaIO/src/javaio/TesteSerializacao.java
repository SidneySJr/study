/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaio;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Esse main me mostra como funciona a serialização da classe
 * @version
 * @author maryucha
 */
public class TesteSerializacao {
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        
//        Cliente cliente1 = new Cliente("Maryucha", 31, "06016082910");
//        
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("testecliente.bin"));
//        oos.writeObject(cliente1);
//        oos.close();
        
        
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("testecliente.bin"));
        Cliente cliente = (Cliente) ois.readObject();
        ois.close();
        System.out.println(cliente);
    }
}
