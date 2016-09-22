package com.accenture.academico.model;

public abstract class Pessoa {
	//CAMPO OBRIGAT�RIO
	private int id; 
	//CAMPO OBRIGAT�RIO
	private String nome;//limitar o tamanho para at� 100 caracteres
	//CAMPO OBRIGAT�RIO
	private String cpf; //valida��o cpf
	//CAMPO OBRIGAT�RIO
	private TipoSexo tipoSexo;
	//CAMPO OBRIGAT�RIO
	private TipoPessoa categoria;
	private Endereco endereco;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public TipoPessoa getCategoria() {
		return categoria;
	}
	public void setCategoria(TipoPessoa categoria) {
		this.categoria = categoria;
	}
	public TipoSexo getTipoSexo() {
		return tipoSexo;
	}
	public void setTipoSexo(TipoSexo tipoSexo) {
		this.tipoSexo = tipoSexo;
	}
}
