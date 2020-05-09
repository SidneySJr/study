/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaio;

/**
 * Classe que representa é do cliente
 * @author maryucha
 * @version 0.1
 */
public class Cliente extends Pessoa {//implements Autenticavel {

    private static int total = 0;
    //private AutenticacaoUtil autenticador;

    public Cliente() {
        Cliente.total++;
        System.out.println("O número de clientes é: " + total);
        //this.autenticador = new AutenticacaoUtil();
    }

    public Cliente(String nome, int idade, String cpf) {
        super(nome, idade, cpf);
        Cliente.total++;
        System.out.println("O número de clientes é: " + total);
        //this.autenticador = new AutenticacaoUtil();
    }

    public static int getTotal() {
        return total;
    }

    public static void setTotal(int total) {
        Cliente.total = total;
    }

//    @Override
//    public boolean autentica(int senha) {
//        return this.autenticador.autentica(senha);
//    }
//
//    @Override
//    public void setSenha(int senha) {
//        this.autenticador.setSenha(senha);
//    }
}
