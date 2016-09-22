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
@Table(name="publicacao")
@ManagedBean(name="publicacao")
public class Publicacao {

	@Id
	@NotNull
	@Column(name="id_publicacao")
	private int id;
	
	@Column(name="tituloPublicacao", length=100)
	@NotNull
	private String tituloPublicacao; //100 caracteres lanca exeção
	
	@Column(name="descricao")
	@NotNull
	private String descricao; //lança exceção
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="id_meioComunicacao")
	private MeioComunicacao meioComunicacao;
	
	private Aluno aluno;
	
	private Professor professor;
	

	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTituloPublicacao() {
		return tituloPublicacao;
	}
	public void setTituloPublicacao(String tituloPublicacao) {
		this.tituloPublicacao = tituloPublicacao;
	}
	public MeioComunicacao getMeioComunicacao() {
		return meioComunicacao;
	}
	public void setMeioComunicacao(MeioComunicacao meioComunicacao) {
		this.meioComunicacao = meioComunicacao;
	}
}
