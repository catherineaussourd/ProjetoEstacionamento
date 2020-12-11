import java.util.HashMap;

public class Estacionamento { // 50 vagas

	Garagem aCarro = new Garagem(25);
	Garagem aMoto = new Garagem(15);
	Garagem aEspecial = new Garagem(10);
	HashMap<Integer, Registro> aRegistros = new HashMap<Integer, Registro>();

	public boolean verificarVaga(TipoVeiculo veiculo) {
		switch (veiculo) {
		case ESPECIAL: {
			this.aEspecial.hasVaga();
			break;
		}
		case MOTO: {
			this.aMoto.hasVaga();
			break;
		}
		default: {
			this.aCarro.hasVaga();
			break;
		}
		}
		return false;
	}

	public TipoVeiculo TipoVaga(Registro registro) {
		return registro.aTipo;
	}

	public Registro acessarRegistro(int pMatricula, int pSenha) {
		Registro vRegistro = aRegistros.get(pMatricula);
		if (vRegistro.validaSenha(pSenha)) {
			return vRegistro;
		}
		return null;
	}

	public void registrar(Registro pRegistro) {
		if (aRegistros.get(pRegistro.getMatricula()) != null) {
			aRegistros.put(pRegistro.getMatricula(), pRegistro);
		}
	}

	public Registro getRegistro(int pMatricula) {
		return aRegistros.get(pMatricula);
	}

	public boolean verificarRegistro(Registro pRegistro) {
		return aRegistros.containsKey(pRegistro.getMatricula());
	}

	public boolean verificarRegistro(int pMatricula) {
		return aRegistros.containsKey(pMatricula);
	}

}