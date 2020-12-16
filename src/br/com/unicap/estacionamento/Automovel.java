package br.com.unicap.estacionamento;

public class Automovel {

    String aMarca;
    String aPlaca;
    boolean aMoto;

    public Automovel(String marca, String placa, boolean moto) {
        if (marca != null) {
            this.aMarca = marca;
        }
        if (placa != null) {
            this.aPlaca = placa;
        }
        this.aMoto = moto;
    }

    public String getMarca() {
        return this.aMarca;
    }

    public void setMarca(String marca) {
        if (marca != null) {
            this.aMarca = marca;
        }
    }

    public String getPlaca() {
        return this.aPlaca;
    }

    public void setPlaca(String placa) {
        if (placa != null) {
            this.aPlaca = placa;
        }
    }

    public boolean isMoto() {
        return this.aMoto;
    }

    public void setMoto(boolean moto) {
        this.aMoto = moto;
    }
    
    public String toString(){
        return "Marca: " + this.getMarca() + "\nPlaca: " + this.getPlaca();
    }

}
