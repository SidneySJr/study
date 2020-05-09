package model;

/**
 * @author void door
 */
public class Cliente {

    private int cod;
    private String nome;
    private String descricao;
    private GeoLocalizacao localizacao;
    private Endereco endereco;

    public Cliente() {
    }

    public Cliente(String nome, String descricao, GeoLocalizacao localizacao, Endereco endereco) {
        this.nome = nome;
        this.descricao = descricao;
        this.localizacao = localizacao;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public GeoLocalizacao getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(GeoLocalizacao localizacao) {
        this.localizacao = localizacao;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Cliente: "
                + "\nCod: " + cod 
                + "\nNome: " + nome 
                + "\nDescricao: " + descricao 
                + "\nLocalizacao: " + localizacao 
                + "\nEndereco: " + endereco;
    }

}
