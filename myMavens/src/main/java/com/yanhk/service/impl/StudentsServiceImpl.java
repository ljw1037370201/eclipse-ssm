package com.yanhk.service.impl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yanhk.mapper.StudentsMapper;
import com.yanhk.pojo.Students;
import com.yanhk.service.StudentsService;



@Service
public class StudentsServiceImpl implements StudentsService {
	
	@Autowired
	private StudentsMapper studentsMapper;
	
	@Override
	public Students selStuById(int id) {
		Students students = studentsMapper.findStuById(id);
		return students;
	}

	@Override
	public void addStu(Students students) {
		studentsMapper.creatStu(students);
		System.out.println("�����ɹ�");
	}

	@Override
	public void delStu(int id) {
		studentsMapper.delStu(id);
		System.out.println("ɾ���ɹ�");
	}

	@Override
	public void updateStu(Students students) {
		studentsMapper.updateStu(students);
		System.out.println("�޸ĳɹ�");
	}

}
