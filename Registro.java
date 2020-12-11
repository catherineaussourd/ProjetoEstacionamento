public class Registro extends Aluno{
	
    Automovel aAutomovel;
    TipoVeiculo aTipo;
    
    public Registro(String pNome, int pIdade, int pMatricula, int pSenha, boolean pEspecial, String pMarcaAutomovel, String pPlacaAutomovel, boolean pAutomovelEspecial){
        super(pNome,pIdade,pMatricula,pSenha,pEspecial);
        this.aAutomovel.setMarca(pMarcaAutomovel);
        this.aAutomovel.setPlaca(pPlacaAutomovel);
        this.aAutomovel.setMoto(pAutomovelEspecial);
        
        if(pEspecial == true) {
        	this.aTipo = TipoVeiculo.ESPECIAL;
        }else if(pAutomovelEspecial == true) {
        	this.aTipo = TipoVeiculo.MOTO;
        }else {
        	this.aTipo = TipoVeiculo.CARRO;
        }
    }
    
    public int getMatricula(){
        return super.getMatricula();
    }
    
    public boolean getEspecial(){
        return super.getEspecial();
    }
    
    public String getPlaca(){
        return aAutomovel.getPlaca();
    }
    
    public String getMarca(){
        return aAutomovel.getMarca();
    }
    
    public String getMoto(){
        return aAutomovel.getMoto();
    }
    
}
