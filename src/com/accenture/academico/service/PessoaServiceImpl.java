package com.accenture.academico.service;

import com.accenture.academico.excecao.SistemaAcademicoException;
import com.accenture.academico.model.Aluno;
import com.accenture.academico.model.Pessoa;

public class PessoaServiceImpl implements IPessoaService {

	
	
	
	
	
	public void validar(Pessoa p) throws SistemaAcademicoException{
		if (p.getNome()==null) {
			throw new SistemaAcademicoException("Nome inválido!");
		}
		if (p.getTipoSexo()==null) {
			throw new SistemaAcademicoException("Informe o sexo.");
		}
		if (p.getCategoria()==null) {
			throw new SistemaAcademicoException("Informe a categoria!");
		}
		if (p instanceof Aluno) {
			if (((Aluno) p).getProfessor()==null) {
				throw new SistemaAcademicoException("Professor inválido!");
			}
		}
	} 
}
