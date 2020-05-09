package model;

/**
 * @author void door
 */
public class Lotacao {

    private int cod;
    private String nome;
    private boolean situacao;
    private Endereco endereco;

    public Lotacao() {
    }

    public Lotacao(String nome, boolean situacao, Endereco endereco) {
        this.nome = nome;
        this.situacao = situacao;
        this.endereco = endereco;
    }

    public int getCod() {
        return cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isSituacao() {
        return situacao;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Lotacao:"
                + "\nCod: " + cod 
                + "\nNome: " + nome 
                + "\nSituacao: " + situacao 
                + "\nEndereco: " + endereco + '}';
    }

}
