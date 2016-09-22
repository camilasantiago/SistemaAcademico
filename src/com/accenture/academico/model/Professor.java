package com.accenture.academico.model;

import java.util.Calendar;

public class Professor extends Pessoa{
	
	private Calendar dtAdmissao; //OBRIGATORIO
	private String departamento; //OBRIGATORIO
	private String titulacao; //OBRIGATORIO E COM 100 CARACTERES - essa estring � vai trazer a descri��o do t�tulo da classe Titulacao
	
	/**
	 * Professor ao qual o aluno pertence e histórico do mesmo. NÃO ENTENDI!!!
	 */
	
	public Calendar getDtAdmissao() {
		return dtAdmissao;
	}
	public void setDtAdmissao(Calendar dtAdmissao) {
		this.dtAdmissao = dtAdmissao;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getTitulacao() {
		return titulacao;
	}
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
}
