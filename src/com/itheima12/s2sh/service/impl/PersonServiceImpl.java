package com.itheima12.s2sh.service.impl;

import java.io.Serializable;

import com.itheima12.s2sh.dao.PersonDao;
import com.itheima12.s2sh.domain.Person;
import com.itheima12.s2sh.service.PersonService;

public class PersonServiceImpl implements PersonService{
	private PersonDao personDao;

	public PersonDao getPersonDao() {
		return personDao;
	}

	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;
	}

	@Override
	public void savePerson(Person person) {
		this.personDao.savePerson(person);
	}

	@Override
	public Person getPersonById(Serializable id) {
		// TODO Auto-generated method stub
		Person person =  this.personDao.getPersonById(id);
		return person;
	}
}
