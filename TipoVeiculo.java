/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaEstacionamento;

/**
 *
 * @author Catatau
 */
public enum TipoVeiculo {
    ESPECIAL(1),
    MOTO(2),
    CARRO(3);
    
    private int tipo; 
    
    private TipoVeiculo(int tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the tipo
     */
    public int getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
    public static TipoVeiculo valueOf(int value){
        for(TipoVeiculo v :  TipoVeiculo.values()){
            if (v.tipo == value) {
                return v;
            }
        }
        return null;
    }
    
}
    
    

