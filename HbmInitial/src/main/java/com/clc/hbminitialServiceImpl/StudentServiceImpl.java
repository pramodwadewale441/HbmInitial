package com.clc.hbminitialServiceImpl;

import java.util.ArrayList;
import java.util.List;

import com.clc.hbminitial.Dao.StudentDao;
import com.clc.hbminitial.Dao.Impl.StudentDaoImpl;
import com.clc.hbminitial.bean.StudentBean;
import com.clc.hbminitialService.StudentService;
import com.clc.hbminitialentity.StudentEntity;

public class StudentServiceImpl implements StudentService {

	StudentDao studao;

	public StudentServiceImpl() {
		super();
		studao = new StudentDaoImpl();
	}

	public StudentBean entityToBean(StudentEntity entity) {
		StudentBean bean = new StudentBean();
		bean.setId(entity.getId());
		bean.setName(entity.getName());
		return bean;
	}

	public StudentEntity beanToEntity(StudentBean bean) {
		StudentEntity entity = new StudentEntity();
		entity.setId(bean.getId());
		entity.setName(bean.getName());
		return entity;
	}

	public List<StudentBean> entitiesToBeans(List<StudentEntity> entities) {
		List<StudentBean> beans = new ArrayList<StudentBean>();
		for (StudentEntity enit : entities) {
			beans.add(entityToBean(enit));
		}
		return beans;
	}

	public boolean addStudent(StudentBean st) {
		return studao.insertStudent(beanToEntity(st));
	}

	public List<StudentBean> deleteStudent(int id) {
		return entitiesToBeans(studao.fetchAllStudent());

	}

	public StudentBean updateStudent(StudentBean st) {
		return entityToBean(studao.modifyStudent(beanToEntity(st)));
	}

	public StudentBean getStudent(int id) {
		return entityToBean(studao.fetchStudent(id));
	}

	public List<StudentBean> getAllStudent() {
		return entitiesToBeans(studao.fetchAllStudent());
	}

}
