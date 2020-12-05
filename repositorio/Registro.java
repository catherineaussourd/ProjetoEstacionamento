package SistemaEstacionamento.repositorio;

import SistemaEstacionamento.Aluno;
import SistemaEstacionamento.Automovel;

public class Registro extends Aluno{
    Automovel A;
    
    
    public Registro(String nome, int idade, int matricula, int senha, String especial, String marcaAutomovel, String placaAutomovel, String automovelEspecial){
        super(nome,idade,matricula,senha,especial);
        this.A.setMarca(marcaAutomovel);
        this.A.setPlaca(placaAutomovel);
        this.A.setMoto(automovelEspecial);
    }
    
    public int matricula(){
        return super.getMatricula();
    }
    
    public int senha(){
        return super.getSenha();
    }
    
    public int especial(){
        return super.getEspecial();
    }
    
    public String placa(){
        return A.getPlaca();
    }
    
    public String marca(){
        return A.getMarca();
    }
    
    public String moto(){
        return A.getMoto();
    }
    
}
