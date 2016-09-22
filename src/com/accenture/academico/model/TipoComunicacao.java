package com.accenture.academico.model;

public enum TipoComunicacao {

	CELULAR("Celular", 6),
	TABLET("Tablet", 5),
	BROWSER("Navegador", 4);
	
	public String getNomeDispositivo() {
		return nomeDispositivo;
	}

	public void setNomeDispositivo(String nomeDispositivo) {
		this.nomeDispositivo = nomeDispositivo;
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}

	private String nomeDispositivo;
	private int tempo;
	
	private TipoComunicacao(String nomeDispositivo, int tempo){
		this.nomeDispositivo = nomeDispositivo;
		this.tempo = tempo;
	}
}
