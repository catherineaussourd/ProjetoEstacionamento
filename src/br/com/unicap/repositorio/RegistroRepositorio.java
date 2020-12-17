package br.com.unicap.repositorio;

import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Catatau
 */
public class RegistroRepositorio implements IRegistroRepositorio {
    private final HashMap<Integer, Registro> aRegistros = new HashMap<>();

    @Override
    public Registro acessarRegistro(int pMatricula, int pSenha) {
         Registro vRegistro = aRegistros.get(pMatricula);

        if (vRegistro != null && vRegistro.validaSenha(pSenha)) {
            return vRegistro;
        }
        return null;
    }

    @Override
    public void registrar(Registro pRegistro) {
        aRegistros.putIfAbsent(pRegistro.getMatricula(), pRegistro);
    }

    @Override
    public Registro getRegistro(int pMatricula) {
        return aRegistros.get(pMatricula);
    }

    @Override
    public boolean verificarRegistro(Registro pRegistro) {
        return aRegistros.containsKey(pRegistro.getMatricula());
    }

    @Override
    public boolean verificarRegistro(int pMatricula) {
        return aRegistros.containsKey(pMatricula);
    }
    
    
}
