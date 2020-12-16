package br.com.unicap.estacionamento;
/**
 *
 * @author Catatau
 */
public class Automovel {

    String aMarca;
    String aPlaca;

    public Automovel(String marca, String placa) {
        if (marca != null) {
            this.aMarca = marca;
        }
        if (placa != null) {
            this.aPlaca = placa;
        }
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

    
    public String toString(){
        return "Marca: " + this.getMarca() + "\nPlaca: " + this.getPlaca();
    }

}
