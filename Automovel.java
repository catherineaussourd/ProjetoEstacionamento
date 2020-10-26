package SistemaEstacionamento;

public class Automovel {
    String Marca;
    String Placa;
    boolean Moto;
    
    
    public Automovel(String M, String P, boolean b){
        if( M != null){
            this.Marca = M;
        }
        if( P != null){
            this.Placa = P;
        }
        this.Moto = b;
    }
    
    public String getMarca(){
        return this.Marca;
    }
    public void setMarca(String M){
        if( M != null){
            this.Marca = M;
        }
    }
    
    public String getPlaca(){
        return this.Placa;
    }
    public void setPlaca(String P){
        if( P != null){
            this.Placa = P;
        }
    }
    
    public boolean getMoto(){
        return this.Moto;
    }
    
    public void setMoto(boolean b){
        this.Moto = b;
    }
}
