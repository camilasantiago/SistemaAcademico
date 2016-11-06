package com.accenture.academico.model.type;

public enum CidadesPernambuco {

	RECIFE("Recife"),
	CARUARU("Caruaru"),
	OLINDA("Olinda"),
	GARANHUNS("Garanhuns"),
	ARCOVERDE("Arco-verde"),
	GOIANA("Goiana"),
	GRAVATA("Gravatá"),
	JABOATAODOSGUARARAPES("Jaboatão dos Guararapes"),
	CARPINA("Carpina"),
	LIMOEIRO("Limoeiro");
	
	private String nomeApresentacao;

	private CidadesPernambuco(String nomeApresentacao) {

		this.nomeApresentacao = nomeApresentacao;

	}

	public String getNomeApresentacao() {

		return nomeApresentacao;

	}

}