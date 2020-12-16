/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unicap.estacionamento;

import br.com.unicap.tipo.TipoVeiculo;

/**
 *
 * @author Catatau
 */
public class AutomovelFactory {
    
    public static Automovel preencheAutomovel(TipoVeiculo tipo, String marca, String placa){
        
        Automovel automovel = null;
        
        switch(tipo){
            case CARRO:
                automovel = new Carro(marca,placa);
                break;
            case MOTO:
                automovel = new Moto(marca,placa);
                break;                
        }
        return automovel;
    }
}
