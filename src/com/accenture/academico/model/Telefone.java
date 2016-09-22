package com.accenture.academico.model;

import javax.faces.bean.ManagedBean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="tb_telefone")
@ManagedBean(name="telefone")
public class Telefone {

	@Id
	@Column(name="id_telefone")
	@NotNull
	private int id;
	
	@Column(name="ddd", length = 3)
	@NotNull
	private int DDD; //3 caracteres
	
	@Column(name="fone", length = 10)
	@NotNull
	private int telefone; //10 caracteres
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="id_pessoa")
	private Pessoa pessoa;
	
	
	
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
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}


}
