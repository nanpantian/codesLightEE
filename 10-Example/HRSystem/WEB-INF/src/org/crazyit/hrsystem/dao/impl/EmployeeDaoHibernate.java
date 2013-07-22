package org.crazyit.hrsystem.dao.impl;

import java.util.*; 

import org.crazyit.hrsystem.domain.*;
import org.crazyit.common.hibernate3.support.*;
import org.crazyit.hrsystem.dao.*;

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
public class EmployeeDaoHibernate
	extends YeekuHibernateDaoSupport
	implements EmployeeDao
{
	/**
	 * ���ݱ�ʶ����������Employeeʵ��
	 * @param id ��Ҫ���ص�Employeeʵ���ı�ʶ����ֵ
	 * @return ָ����ʶ���Զ�Ӧ��Employeeʵ��
	 */
	public Employee get(Integer id)
	{
		return getHibernateTemplate()
			.get(Employee.class , id);
	}

	/**
	 * �־û�ָ����Employeeʵ��
	 * @param employee ��Ҫ���־û���Employeeʵ��
	 * @return Employeeʵ�����־û���ı�ʶ����ֵ
	 */
	public Integer save(Employee employee)
	{
		return (Integer)getHibernateTemplate()
			.save(employee);
	}

	/**
	 * �޸�ָ����Employeeʵ��
	 * @param employee ��Ҫ���޸ĵ�Employeeʵ��
	 */
	public void update(Employee employee)
	{
		getHibernateTemplate()
			.update(employee);
	}

	/**
	 * ɾ��ָ����Employeeʵ��
	 * @param employee ��Ҫ��ɾ����Employeeʵ��
	 */
	public void delete(Employee employee)
	{
		getHibernateTemplate()
			.delete(employee);
	}

	/**
	 * ���ݱ�ʶ����ɾ��Employeeʵ��
	 * @param id ��Ҫ��ɾ����Employeeʵ���ı�ʶ����ֵ
	 */
	public void delete(Integer id)
	{
		getHibernateTemplate()
			.delete(get(id));
	}

	/**
	 * ��ѯȫ����Employeeʵ��
	 * @return ���ݿ���ȫ����Employeeʵ��
	 */
	public List<Employee> findAll()
	{
		return (List<Employee>)getHibernateTemplate()
			.find("from Employee");
	}

	/**
	 * �����û����������ѯԱ��
	 * @param emp ����ָ���û����������Ա��
	 * @return ����ָ���û����������Ա������
	 */ 
	public List<Employee> findByNameAndPass(Employee emp)
	{
		return (List<Employee>)getHibernateTemplate()
			.find("from Employee p where p.name = ? and p.pass=?"
			, emp.getName() , emp.getPass()); 
	}

	/**
	 * �����û�����ѯԱ��
	 * @param name Ա�����û���
	 * @return �����û�����Ա��
	 */ 
	public Employee findByName(String name)
	{
		List<Employee> emps = (List<Employee>)getHibernateTemplate()
			.find("from Employee where name = ? " , name);
		if (emps!= null && emps.size() >= 1)
		{
			return emps.get(0);
		}
		return null;
	}

	/**
	 * ���ݾ����ѯԱ��
	 * @param mgr ����
	 * @return �þ����Ӧ������Ա��
	 */ 
	public List<Employee> findByMgr(Manager mgr)
	{
		return (List<Employee>)getHibernateTemplate()
			.find("from Employee as e where "
			+ "e.manager = ?" , mgr);
	}
}
