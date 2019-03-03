package com.yanhk.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mysql.jdbc.Driver;
import com.yanhk.pojo.Students;
import com.yanhk.service.StudentsService;

public class MyTest {
	private StudentsService studentsService;
	@Before
	public void init() {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		studentsService =  (StudentsService) context.getBean("studentsServiceImpl");
	}
	@Test
	public void find(){
		int id = 9;
		Students students = studentsService.selStuById(id);
		System.out.println(students.toString());
	}
}
