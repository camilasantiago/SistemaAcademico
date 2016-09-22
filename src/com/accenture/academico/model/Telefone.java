package com.accenture.academico.model;

public class Telefone {

	private int id;
	private int DDD; //3 caracteres
	private int telefone; //10 caracteres
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDDD() {
		return DDD;
	}
	public void setDDD(int dDD) {
		DDD = dDD;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}


}
