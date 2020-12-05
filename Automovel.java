package SistemaEstacionamento;

public class Automovel {
    String Marca;
    String Placa;
    String Moto;
    
    
    public Automovel(String marca, String placa, String moto ){
        if( marca != null){
            this.Marca = marca;
        }
        if( placa != null){
            this.Placa = placa;
        }
        this.Moto = moto;
    }
    
    public String getMarca(){
        return this.Marca;
    }
    public void setMarca(String marca){
        if( marca != null){
            this.Marca = marca;
        }
    }
    
    public String getPlaca(){
        return this.Placa;
    }
    public void setPlaca(String placa){
        if( placa != null){
            this.Placa = placa;
        }
    }
    
    public String getMoto(){
        return this.Moto;
    }
    
    public void setMoto(String moto){
        this.Moto = moto;
    }

    public void setMoto(boolean alunoEspecial) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
