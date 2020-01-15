package com.clc.hbminitial.Dao.Impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.clc.hbminitial.Dao.StudentDao;
import com.clc.hbminitialentity.StudentEntity;

public class StudentDaoImpl implements StudentDao{
	SessionFactory sFactory;
	public StudentDaoImpl(){
		sFactory = new Configuration().configure().buildSessionFactory();
		
	}
	

	public boolean insertStudent(StudentEntity st) {
		Session session = sFactory.openSession();
		Transaction tr = session.beginTransaction();
		session.save(st);
		tr.commit();
		session.close();
		return true;
	}

	public List<StudentEntity> removeStudent(int id) {
		Session session = sFactory.openSession();
		Transaction tr = session.beginTransaction();
		session.delete(fetchStudent(id));
		tr.commit();
		session.close();
		return fetchAllStudent();
	}

	public StudentEntity modifyStudent(StudentEntity st) {
		Session session = sFactory.openSession();
		Transaction tr = session.beginTransaction();
		StudentEntity updatedStudent = (StudentEntity) session.merge(st);
		tr.commit();
		session.close();
		return updatedStudent;
	}

	public StudentEntity fetchStudent(int id) {
		Session session = sFactory.openSession();
		return session.get(StudentEntity.class, id);
	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	public List<StudentEntity> fetchAllStudent() {
		Session session = sFactory.openSession();
		return session.createCriteria(StudentEntity.class).list();
		
	}


}
