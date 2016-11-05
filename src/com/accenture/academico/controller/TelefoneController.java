package com.accenture.academico.controller;

import java.util.List;

import com.accenture.academico.model.Telefone;

public interface TelefoneController {

	public void addTelefone(Telefone t);

	public void updateTelefone(Telefone t);

	public void removeTelefone(Telefone t);

	public List<Telefone> listTelefone();

}
