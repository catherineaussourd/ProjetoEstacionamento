package br.com.unicap.estacionamento;

import br.com.unicap.repositorio.Registro;
import br.com.unicap.tipo.TipoVeiculo;

import java.util.HashMap;

public class Estacionamento { // 50 vagas

	Garagem aCarro = new Garagem(25);
	Garagem aMoto = new Garagem(15);
	Garagem aEspecial = new Garagem(10);
	HashMap<Integer, Registro> aRegistros = new HashMap<>();

	public boolean verificarVaga(Registro veiculo) {

		Automovel auto = veiculo.getaAutomovel();
		boolean hasVaga = false;

		switch (veiculo.getaTipo()) {
			case ESPECIAL: {
				hasVaga = addVeiculoGaragem(auto, aEspecial);
				break;
			}
			case MOTO: {
				hasVaga = addVeiculoGaragem(auto, aMoto);
				break;
			}
			default: {
				hasVaga= addVeiculoGaragem(auto, aCarro);
				break;
			}
		}
		return hasVaga;
	}

	private boolean addVeiculoGaragem(Automovel veiculo, Garagem garagem) {

		if (garagem.hasVaga()){
			garagem.add(veiculo);
			return true;
		}
		return false;
	}

	public TipoVeiculo TipoVaga(Registro registro) {
		return registro.getaTipo();
	}

	public Registro acessarRegistro(int pMatricula, int pSenha) {

		Registro vRegistro = aRegistros.get(pMatricula);

		if (vRegistro != null && vRegistro.validaSenha(pSenha)) {
			return vRegistro;
		}
		return null;
	}

	public void registrar(Registro pRegistro) {
		aRegistros.putIfAbsent(pRegistro.getMatricula(), pRegistro);
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