
public class Automovel {

	String aMarca;
	String aPlaca;
	String aMoto;

	public Automovel(String marca, String placa, String moto) {
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

	public String getMoto() {
		return this.aMoto;
	}

	public void setMoto(String moto) {
		this.aMoto = moto;
	}

	public void setMoto(boolean alunoEspecial) {
		throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
																		// Tools | Templates.
	}
}
