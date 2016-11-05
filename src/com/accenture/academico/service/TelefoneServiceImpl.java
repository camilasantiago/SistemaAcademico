package com.accenture.academico.service;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accenture.academico.dao.TelefoneDAO;
import com.accenture.academico.model.Telefone;

@ManagedBean(name = "telefoneService")
@SessionScoped
@Service
public class TelefoneServiceImpl implements TelefoneService {

	private TelefoneDAO telefoneDAO;

	public void setTelefoneDAO(TelefoneDAO telefoneDAO) {

		this.telefoneDAO = telefoneDAO;

	}

	@Override
	@Transactional
	public void addTelefone(Telefone t) {

		telefoneDAO.addTelefone(t);

	}

	@Override
	@Transactional
	public void updateTelefone(Telefone t) {
		telefoneDAO.updateTelefone(t);
	}

	@Override
	@Transactional
	public void removeTelefone(Telefone t) {

		telefoneDAO.removeTelefone(t);

	}

	@Override
	@Transactional
	public List<Telefone> listTelefone() {

		return telefoneDAO.listTelefone();

	}

	public TelefoneDAO getTelefoneDAO() {

		return telefoneDAO;

	}

}
