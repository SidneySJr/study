/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaio;

import java.nio.charset.Charset;

/**
 *
 * @author maryucha
 */
public class TesteEcoding {

    public static void main(String[] args) {
        String s = "Maryucha Machado Mariani";
        System.out.println(s.codePointAt(0));
        
        Charset charset= Charset.defaultCharset();
        System.out.println(charset);
        
        byte[] bytes = s.getBytes();
        System.out.println(bytes.length+" UTF_8");
        

    }
}
