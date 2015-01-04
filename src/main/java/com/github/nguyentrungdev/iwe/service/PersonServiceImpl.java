package com.github.nguyentrungdev.iwe.service;


import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.nguyentrungdev.iwe.dao.PersonDao;
import com.github.nguyentrungdev.iwe.pojo.Person;

@Service
public class PersonServiceImpl implements PersonService {
	
	private PersonDao personDAO;
	
	public void setPersonDao(PersonDao personDAO) {
		this.personDAO = personDAO;
	}
	
	@Override
	@Transactional
	public void addPerson(Person person) {
		this.personDAO.addPerson(person);
	}
	
	@Override
	@Transactional
	public void updatePerson(Person p) {
		this.personDAO.updatePerson(p);
	}

	@Override
	@Transactional
	public List<Person> listPersons() {
		return this.personDAO.listPersons();
	}

	@Override
	@Transactional
	public Person getPersonById(long id) {
		return this.personDAO.getPersonById(id);
	}

	@Override
	@Transactional
	public void removePerson(long id) {
		this.personDAO.removePerson(id);
	}
}
