package com.dao;

import java.util.List;

import com.entity.Students;

public interface StudentDao {
	public void addStudent(Students students);
	public void delStudent(Students students);
	public Students get(Integer sid);
	public void updateStudent(Students students);
	public List<Students> findall(String hql);
}
