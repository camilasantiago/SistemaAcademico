package com.accenture.academico.model;

import javax.faces.bean.ManagedBean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import com.accenture.academico.model.type.TipoDispositivo;

@Entity
@ManagedBean(name = "publicacao")
public class Publicacao {

	@Id
	@GeneratedValue
	private Long id;

	@Column(length = 100)
	@NotNull
	private String titulo;

	@Column(length = 500)
	@NotNull
	private String descricao;

	@ManyToOne
	@NotNull
	private Aluno aluno;

	@NotNull
	@Enumerated(EnumType.STRING)
	private TipoDispositivo meioPublicacao;

	public String getTitulo() {

		return titulo;

	}

	public void setTitulo(String titulo) {

		this.titulo = titulo;

	}

	public String getDescricao() {

		return descricao;

	}

	public void setDescricao(String descricao) {

		this.descricao = descricao;

	}

	public Aluno getAluno() {

		return aluno;

	}

	public void setAluno(Aluno aluno) {

		this.aluno = aluno;

	}

	public TipoDispositivo getMeioPublicacao() {

		return meioPublicacao;

	}

	public void setMeioPublicacao(TipoDispositivo meioPublicacao) {

		this.meioPublicacao = meioPublicacao;

	}

	public Long getId() {

		return id;

	}

}