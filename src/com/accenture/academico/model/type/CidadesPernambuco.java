package com.accenture.academico.model.type;

public enum CidadesPernambuco {

	RECIFE("Recife", 10),
	CARUARU("Caruaru", 9),
	OLINDA("Olinda", 8),
	GARANHUNS("Garanhuns", 7),
	ARCOVERDE("Arco-verde", 6),
	GOIANA("Goiana", 5),
	GRAVATA("Gravatá", 4),
	JABOATAODOSGUARARAPES("Jaboatão dos Guararapes", 3),
	CARPINA("Carpina", 2),
	LIMOEIRO("Limoeiro", 1);
	
	private String nomeApresentacao;
	private int tempo;

	private CidadesPernambuco(String nomeApresentacao, int tempo) {
		
		this.nomeApresentacao = nomeApresentacao;
		this.tempo = tempo;
		
	}

	public String getNomeApresentacao() {
		
		return nomeApresentacao;
		
	}

	public void setNomeApresentacao(String nomeApresentacao) {
		
		this.nomeApresentacao = nomeApresentacao;
		
	}

	public int getTempo() {
		
		return tempo;
		
	}

	public void setTempo(int tempo) {
		
		this.tempo = tempo;
		
	}
	
}