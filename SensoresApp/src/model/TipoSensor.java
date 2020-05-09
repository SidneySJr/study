package model;

/**
 * @author void door
 */
public class TipoSensor {

    int cod;
    private String nome;
    private UnidadeMedida unidadeMedida;

    public TipoSensor() {
    }

    public TipoSensor(String nome, UnidadeMedida unidadeMedida) {
        this.nome = nome;
        this.unidadeMedida = unidadeMedida;
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

    public UnidadeMedida getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(UnidadeMedida unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    @Override
    public String toString() {
        return "SensorType: "
                + "\nCod: " + cod
                + "\nNome: " + nome
                + "\nUnidade de Medida: " + unidadeMedida;
    }
}
