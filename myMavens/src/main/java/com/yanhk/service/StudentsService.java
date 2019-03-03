package com.yanhk.service;

import com.yanhk.pojo.Students;

public interface StudentsService {
	/**
	 * ����id����ѧ����Ϣ
	 * @param id ѧ��id
	 * @return ѧ����Ϣ
	 */
	public Students selStuById(int id);
	/**
	 * ���ѧ����Ϣ
	 * @param students ѧ����Ϣ
	 */
	public void addStu(Students students);
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
