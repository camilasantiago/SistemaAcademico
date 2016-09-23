package com.accenture.academico.dao;

import java.util.List;

import com.accenture.academico.model.Person;

public interface PersonDAO {

	public void addPerson(Person p);

	public List<Person> listPersons();

}
