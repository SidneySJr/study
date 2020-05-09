package model;

/**
 * @author void door
 */
public class Endereco {

    private int cod;
    private String rua;
    private String bairro;
    private String cidade;
    private String estado;
    private String pais;
    private String cep;
    private int numero;

    public Endereco() {
    }

    public Endereco(String rua, String bairro, String cidade, String estado, String pais, String cep, int numero) {
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.cep = cep;
        this.numero = numero;
    }

    public int getCod() {
        return cod;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Endereco:"
                + "\nCod: " + cod
                + "\nRua: " + rua
                + "\nBairro: " + bairro
                + "\nCidade: " + cidade
                + "\nEstado: " + estado
                + "\nPais: " + pais
                + "\nCep: " + cep
                + "\nNumero: " + numero;
    }

}
