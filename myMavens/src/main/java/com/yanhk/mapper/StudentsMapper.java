package com.yanhk.mapper;

import org.springframework.stereotype.Repository;

import com.yanhk.pojo.Students;

@Repository
public interface StudentsMapper {
	/**
	 * ����id����ѧ����Ϣ
	 * @param id ѧ��id
	 * @return ѧ����Ϣ
	 */
	public Students findStuById(int id);
	/**
	 * ���ѧ����Ϣ
	 * @param students ѧ����Ϣ
	 */
	public void creatStu(Students students);
	/**
	 * ����ѧ��idɾ��ѧ����Ϣ
	 * @param id ѧ��id
	 */
	public void delStu(int id);
	/**
	 * ����ѧ��id�޸�ѧ����Ϣ
	 * @param students  ѧ����Ϣ
	 */
	public void updateStu(Students students);
	

}
