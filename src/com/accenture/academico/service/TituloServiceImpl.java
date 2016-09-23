package com.accenture.academico.service;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accenture.academico.dao.TituloDAO;
import com.accenture.academico.model.Titulo;

@Service
@SessionScoped
@ManagedBean(name = "tituloService")
public class TituloServiceImpl implements TituloService {

	private TituloDAO tituloDAO;

	public void setTituloDAO(TituloDAO tituloDAO) {

		this.tituloDAO = tituloDAO;

	}

	@Override
	@Transactional
	public void addTitulo(Titulo t) {

		tituloDAO.addTitulo(t);

	}

	@Override
	@Transactional
	public void updateTitulo(Titulo t) {

		tituloDAO.updateTitulo(t);

	}

	@Override
	@Transactional
	public void removeTitulo(Titulo t) {

		tituloDAO.removeTitulo(t);

	}

	@Override
	public List<Titulo> listTitulo() {

		return tituloDAO.listTitulo();

	}

}
