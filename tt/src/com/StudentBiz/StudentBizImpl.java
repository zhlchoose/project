package com.StudentBiz;

import java.util.List;

import com.dao.StudentDao;
import com.entity.Students;

public class StudentBizImpl implements StudentBiz {
	private StudentDao dao;
	@Override
	public void addStudent(Students students) {
		// TODO Auto-generated method stub
		dao.addStudent(students);
	}

	@Override
	public void delStudent(Students students) {
		// TODO Auto-generated method stub
		dao.delStudent(students);
	}

	@Override
	public Students get(Integer sid) {
		// TODO Auto-generated method stub
		return dao.get(sid);
	}

	@Override
	public void updateStudent(Students students) {
		// TODO Auto-generated method stub
		dao.updateStudent(students);
	}

	@Override
	public List<Students> findall(String hql) {
		// TODO Auto-generated method stub
		return dao.findall(hql);
	}

	public StudentDao getDao() {
		return dao;
	}

	public void setDao(StudentDao dao) {
		this.dao = dao;
	}
	

}
