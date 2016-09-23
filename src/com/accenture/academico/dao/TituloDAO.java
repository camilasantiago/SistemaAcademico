package com.accenture.academico.dao;

import java.util.List;

import com.accenture.academico.model.Titulo;

public interface TituloDAO {

	public void addTitulo(Titulo t);

	public void updateTitulo(Titulo t);

	public void removeTitulo(Titulo t);

	public List<Titulo> listTitulo();

}
