package br.com.unicap.tipo;
/**
 *
 * @author Catatau
 */
public enum TipoVaga {
    MOTO(1), CARRO(2), ESPECIAL(3);

    private int tipo;

    private TipoVaga(int tipo) {
        this.tipo = tipo;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public static TipoVaga valueOf(int value) {
        for (TipoVaga v : TipoVaga.values()) {
            if (v.tipo == value) {
                return v;
            }
        }
        return null;
    }

}
