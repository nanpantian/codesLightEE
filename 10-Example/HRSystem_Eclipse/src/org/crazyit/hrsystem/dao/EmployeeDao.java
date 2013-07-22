package org.crazyit.hrsystem.dao;

import java.util.*; 

import org.crazyit.hrsystem.domain.*;

/**
 * Description:
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a> 
 * <br/>Copyright (C), 2001-2012, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public interface EmployeeDao
{
	/**
	 * ���ݱ�ʶ����������Employeeʵ��
	 * @param id ��Ҫ���ص�Employeeʵ���ı�ʶ����ֵ
	 * @return ָ����ʶ���Զ�Ӧ��Employeeʵ��
	 */
	Employee get(Integer id);

	/**
	 * �־û�ָ����Employeeʵ��
	 * @param employee ��Ҫ���־û���Employeeʵ��
	 * @return Employeeʵ�����־û���ı�ʶ����ֵ
	 */
	Integer save(Employee employee);

	/**
	 * �޸�ָ����Employeeʵ��
	 * @param employee ��Ҫ���޸ĵ�Employeeʵ��
	 */
	void update(Employee employee);

	/**
	 * ɾ��ָ����Employeeʵ��
	 * @param employee ��Ҫ��ɾ����Employeeʵ��
	 */
	void delete(Employee employee);

	/**
	 * ���ݱ�ʶ����ɾ��Employeeʵ��
	 * @param id ��Ҫ��ɾ����Employeeʵ���ı�ʶ����ֵ
	 */
	void delete(Integer id);

	/**
	 * ��ѯȫ����Employeeʵ��
	 * @return ���ݿ���ȫ����Employeeʵ��
	 */
	List<Employee> findAll();

	/**
	 * �����û����������ѯԱ��
	 * @param emp ����ָ���û����������Ա��
	 * @return ����ָ���û����������Ա������
	 */ 
	List<Employee> findByNameAndPass(Employee emp);

	/**
	 * �����û�����ѯԱ��
	 * @param name Ա�����û���
	 * @return �����û�����Ա��
	 */ 
	Employee findByName(String name);

	/**
	 * ���ݾ����ѯԱ��
	 * @param mgr ����
	 * @return �þ����Ӧ������Ա��
	 */ 
	List<Employee> findByMgr(Manager mgr);
}
