package com.accenture.academico.model;

public enum TipoPessoa {

	DISCENTE("Aluno", 6),
	DOCENTE("Professor", 7);

	private String nomeApresentacao;
	private int tempo;

	private TipoPessoa(String nomeApresentacao, int tempo){
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
