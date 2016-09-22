package model;

public class Aluno extends Pessoa {

	// OBRIGATORIO
	private String matricula;
	// OBRIGATORIO

	public String getMatricula() {

		return matricula;

	}

	public void setMatricula(String matricula) {

		this.matricula = matricula;

	}

	@Override
	public String toString() {

		return "CPF: " + this.getCpf() + " - Matricula: " + this.getMatricula();

	}

}
