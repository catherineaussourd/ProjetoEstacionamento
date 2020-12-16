package br.com.unicap.tipo;
/**
 *
 * @author Catatau
 */
public enum TipoVeiculo {
    ESPECIAL(1), MOTO(2), CARRO(3);

    private int tipo;

    private TipoVeiculo(int tipo) {
        this.tipo = tipo;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public static TipoVeiculo valueOf(int value) {
        for (TipoVeiculo v : TipoVeiculo.values()) {
            if (v.tipo == value) {
                return v;
            }
        }
        return null;
    }

}
