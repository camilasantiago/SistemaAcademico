package com.accenture.academico.service;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accenture.academico.dao.PersonDAO;
import com.accenture.academico.model.Person;

@ManagedBean(name = "personService")
@SessionScoped
@Service

public class PersonServiceImpl implements PersonService {

	private PersonDAO personDAO;

	public void setPersonDAO(PersonDAO personDAO) {

		this.personDAO = personDAO;

	}

	@Override
	@Transactional
	public void addPerson(Person p) {

		personDAO.addPerson(p);

	}

	@Override
	@Transactional
	public List<Person> listPersons() {

		return personDAO.listPersons();

	}

	public PersonDAO getPersonDAO() {
		return personDAO;
	}

}
