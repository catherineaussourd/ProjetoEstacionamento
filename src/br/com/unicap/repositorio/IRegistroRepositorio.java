/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unicap.repositorio;

/**
 *
 * @author Catatau
 */
public interface IRegistroRepositorio {
    
    public Registro acessarRegistro(int pMatricula, int pSenha);

    public void registrar(Registro pRegistro);

    public Registro getRegistro(int pMatricula);
  
    public boolean verificarRegistro(Registro pRegistro);

    public boolean verificarRegistro(int pMatricula);

    
}
