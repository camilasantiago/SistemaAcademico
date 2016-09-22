package com.accenture.academico.model;


import javax.faces.bean.ManagedBean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="publicacao")
@ManagedBean(name="publicacao")

public class Publicacao {

	@Id @NotNull
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@NotNull
	@Column(name="titulo", length=100)
	private String tituloPublicacao;
	
	@Column(length=500)
	@NotNull
	private String descricao; //lança exceção
	
	@NotNull
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="id_aluno")
	private Aluno aluno;
	
	@NotNull
	private  Professor professor; //Busca professor a partir do aluno.
	
	@ManyToOne(fetch = FetchType.EAGER) 
	@JoinColumn(name="id_meioComunicacao", insertable= true, updatable=true) 
	private MeioComunicacao meioComunicacao;

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
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;

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
