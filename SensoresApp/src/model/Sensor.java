package model;

/**
 * @author void door
 */
public class Sensor {

    private int cod;
    private String nome;
    private String observacao;
    private boolean situacao;
    private Ambiente ambiente;
    private UnidadeMedida unidadeMedida;

    public int getCod() {
        return cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public boolean isSituacao() {
        return situacao;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }

    public Ambiente getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(Ambiente ambiente) {
        this.ambiente = ambiente;
    }

    public UnidadeMedida getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(UnidadeMedida unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    @Override
    public String toString() {
        return "Sensor: "
                + "\nCod: " + cod
                + "\nNome: " + nome
                + "\nObservacao: " + observacao
                + "\nSituacao: " + situacao
                + "\nAmbiente: " + ambiente
                + "\nUnidadeMedida: " + unidadeMedida;
    }

}
