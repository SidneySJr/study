/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaio;

import java.io.Serializable;

/**
 * Classe que representa uma pessoa aqui tá o toString de todas as outras pessoas
 * @author maryucha
 * @version 0.1
 */
public abstract class Pessoa implements Serializable {

    private String nome;
    private int idade;
    private String cpf;
    private static final long serialVersionUID=3918777099651029411L;
    public Pessoa() {

    }

    public Pessoa(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return nome 
                + " idade= " + idade 
                + " cpf= " + cpf;
    }

}
