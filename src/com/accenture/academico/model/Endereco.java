package com.accenture.academico.model;

public class Endereco {

	private int id; //OBRIGATORIO E INCREMENTAL
	private String logradouro;
	private String bairro; //OBRIGATORIO, LAN�A EXCEPTION
	private int numero; //OBRIGATORIO E LAN�A EXCE��O
	private CidadesPernambuco cidade;
	private String uf;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public CidadesPernambuco getCidade() {
		return cidade;
	}
	public void setCidade(CidadesPernambuco cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
}
