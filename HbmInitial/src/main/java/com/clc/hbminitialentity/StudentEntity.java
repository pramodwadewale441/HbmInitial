package com.clc.hbminitialentity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="Student")
public class StudentEntity {
	
	@Id
	private int Id;
	private String name;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public StudentEntity(int id, String name) {
		super();
		Id = id;
		this.name = name;
	}
	public StudentEntity() {
		super();
		
	}
	

}
