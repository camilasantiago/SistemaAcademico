package com.accenture.academico.model;

public enum TipoSexo {

	FEMININO("Feminino", 6),
	MASCULINO("Masculino", 5),
	OUTROS("Outros", 4);

	private String sexo;
	private int tempo;

	private TipoSexo(String sexo, int tempo){
		this.sexo = sexo;
		this.tempo = tempo;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
}
