package com.itheima12.s2sh.dao.impl;

import com.itheima12.s2sh.dao.PersonDao;
import com.itheima12.s2sh.domain.Person;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.web.context.support.WebApplicationContextUtils;

import java.io.Serializable;

public class PersonDaoImpl extends HibernateDaoSupport implements PersonDao{
	@Override
	public void savePerson(Person person) {
		// TODO Auto-generated method stub
//		WebApplicationContextUtils.getWebApplicationContext(null);

		this.getHibernateTemplate().save(person);
	}

	@Override
	public Person getPersonById(Serializable id) {
		return this.getHibernateTemplate().load(Person.class, id);
	}
}
