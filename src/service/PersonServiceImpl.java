package service;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.PersonDAO;
import model.Person;

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

}
