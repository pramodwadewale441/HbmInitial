package com.clc.hbminitial.Dao;

import java.util.List;

import com.clc.hbminitialentity.StudentEntity;

public interface StudentDao {
	
	public boolean insertStudent(StudentEntity st);

	public List<StudentEntity> removeStudent(int id);

	public StudentEntity modifyStudent(StudentEntity st);

	public StudentEntity fetchStudent(int id);

	public List<StudentEntity> fetchAllStudent();

}
