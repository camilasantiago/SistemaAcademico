package service;

import java.util.List;

import model.Person;

public interface PersonService {

	public void addPerson(Person p);

	public List<Person> listPersons();

}
