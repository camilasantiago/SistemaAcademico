package com.accenture.academico.model;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="tb_meioComunicacao")
@ManagedBean(name="meioComunicacao")
public class MeioComunicacao {

	@Id
	@NotNull
	@Column(name="id_meioComunicacao")
	private int id;
	
	@Column(name="descricao")
	@NotNull
	@Enumerated(EnumType.STRING)
	private TipoComunicacao descricao;
	
	@NotNull
	@OneToMany(mappedBy="meioComunicacao", fetch= FetchType.LAZY)
	private List<Publicacao> publicacao;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public TipoComunicacao getDescricao() {
		return descricao;
	}
	public void setDescricao(TipoComunicacao descricao) {
		this.descricao = descricao;
	}
	
	

}
