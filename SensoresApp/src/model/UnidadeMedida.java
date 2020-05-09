package model;

/**
 * @author void door
 */
public class UnidadeMedida {

    private String nome;
    private String tipo;

    public UnidadeMedida() {
    }

    public UnidadeMedida(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
