package com.dao;

import java.util.List;

import org.springframework.orm.hibernate.support.HibernateDaoSupport;

import com.entity.Students;

public class StudentDaoImpl extends HibernateDaoSupport implements StudentDao {

	@Override
	public List<Students> findall(String hql) {
		// TODO Auto-generated method stub
		return super.getHibernateTemplate().find(hql);
	}

	@Override
	public void addStudent(Students students) {
		// TODO Auto-generated method stub
		super.getHibernateTemplate().save(students);
	}

	@Override
	public void delStudent(Students students) {
		// TODO Auto-generated method stub
		super.getHibernateTemplate().delete(students);
	}

	@Override
	public Students get(Integer sid) {
		// TODO Auto-generated method stub
		Students students=(Students) super.getHibernateTemplate().get(Students.class, sid);
		return students;
	}

	@Override
	public void updateStudent(Students students) {
		// TODO Auto-generated method stub
		super.getHibernateTemplate().update(students);
	}

}
