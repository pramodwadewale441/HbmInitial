package com.clc.hbminitial.main;

import com.clc.hbminitial.bean.StudentBean;
import com.clc.hbminitialService.StudentService;
import com.clc.hbminitialServiceImpl.StudentServiceImpl;

public class StudentMain {

	public static void main(String[] args) {
		
		StudentService service = new StudentServiceImpl();
		
		for(int i = 10; i<=20; i++){
			service.addStudent(new StudentBean(i, "promod"+i ));
			
		}
		
		System.out.println(service.getAllStudent());

	}

}
