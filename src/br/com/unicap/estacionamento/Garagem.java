package br.com.unicap.estacionamento;

import java.util.HashMap;

public class Garagem {
	
	private HashMap<String,Automovel> aGaragem = new HashMap<String, Automovel>();
	private int aTamanho;
	
	public Garagem(int pTamanho) {
		this.aTamanho = pTamanho;
	}
	
	public void add(Automovel pAutomovel) {
		if (aGaragem.size() < aTamanho) {
			aGaragem.put(pAutomovel.getPlaca(), pAutomovel);
		}
	}
	
	public boolean hasVaga() {
		return aGaragem.size() < aTamanho;
	}
	
	public void remover(String pPlaca) {

		this.aGaragem.remove(pPlaca);
	}
	
	public Automovel busca(String pPlaca) {

		return this.aGaragem.get(pPlaca);
	}
	
	
}
