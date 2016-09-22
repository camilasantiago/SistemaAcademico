package com.accenture.academico.model;

public enum TipoComunicacao {

	CELULAR("Celular", 6),
	TABLET("Tablet", 5),
	BROWSER("Navegador", 4);
	
	private String nomeDispositivo;
	private int tempo;
	
	private TipoComunicacao(String nomeDispositivo, int tempo){
		this.nomeDispositivo = nomeDispositivo;
		this.tempo = tempo;
	}
}
