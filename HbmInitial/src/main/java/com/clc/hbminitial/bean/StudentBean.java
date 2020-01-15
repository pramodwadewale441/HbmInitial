package com.clc.hbminitial.bean;

public class StudentBean {
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
	public StudentBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "StudentBean [Id=" + Id + ", name=" + name + "]";
	}
	public StudentBean(int id, String name) {
		super();
		Id = id;
		this.name = name;
	}
	
	

}
