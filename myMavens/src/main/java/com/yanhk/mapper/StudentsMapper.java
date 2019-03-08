package com.yanhk.mapper;

import org.springframework.stereotype.Repository;

import com.yanhk.pojo.Students;

@Repository
public interface StudentsMapper {
	/**
	 * 根据id查找学生信息
	 * @param id 学生id
	 * @return 学生信息
	 */
	public Students findStuById(int id);
	/**
	 * 添加学生信息
	 * @param students 学生信息
	 */
	public void creatStu(Students students);
	/**
	 * 根据学生id删除学生信息
	 * @param id 学生id
	 */
	public void delStu(int id);
	/**
	 * 根据学生id修改学生信息
	 * @param students  学生信息
	 */
	public void updateStu(Students students);
	

}
