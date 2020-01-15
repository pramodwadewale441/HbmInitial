package com.clc.hbminitialService;

import java.util.List;

import com.clc.hbminitial.bean.StudentBean;

public interface StudentService {
	public boolean addStudent(StudentBean st);

	public List<StudentBean> deleteStudent(int id);

	public StudentBean updateStudent(StudentBean st);

	public StudentBean getStudent(int id);

	public List<StudentBean> getAllStudent();

}
