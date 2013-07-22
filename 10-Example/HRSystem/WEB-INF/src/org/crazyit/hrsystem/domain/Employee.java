package org.crazyit.hrsystem.domain;

import java.io.Serializable;
import java.util.*;

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
public class Employee
	implements Serializable
{
	private static final long serialVersionUID = 48L;
	//��ʶ����
	private Integer id;
	//Ա������
	private String name;
	//Ա������
	private String pass;
	//Ա������
	private double salary;
	//Ա����Ӧ�ľ���
	private Manager manager;
	//Ա����Ӧ�ĳ��ڼ�¼
	private Set<Attend> attends = new HashSet<Attend>();
	//Ա����Ӧ�Ĺ���֧����¼
	private Set<Payment> payments = new HashSet<Payment>();
	

	//�޲����Ĺ�����
	public Employee()
	{
	}
	//��ʼ��ȫ�����ԵĹ�����
	public Employee(Integer id , String name , String pass , 
		double salary , Manager manager , 
		Set<Attend> attends , Set<Payment> payments)
	{
		this.id = id;
		this.name = name;
		this.pass = pass;
		this.salary = salary;
		this.manager = manager;
		this.attends = attends;
		this.payments = payments;
	}

	//id���Ե�setter��getter����
	public void setId(Integer id)
	{
		this.id = id;
	}
	public Integer getId()
	{
		return this.id;
	}

	//name���Ե�setter��getter����
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}

	//pass���Ե�setter��getter����
	public void setPass(String pass)
	{
		this.pass = pass;
	}
	public String getPass()
	{
		return this.pass;
	}

	//salary���Ե�setter��getter����
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	public double getSalary()
	{
		return this.salary;
	}

	//manager���Ե�setter��getter����
	public void setManager(Manager manager)
	{
		this.manager = manager;
	}
	public Manager getManager()
	{
		return this.manager;
	}

	//attends���Ե�setter��getter����
	public void setAttends(Set<Attend> attends)
	{
		this.attends = attends;
	}
	public Set<Attend> getAttends()
	{
		return this.attends;
	}

	//payments���Ե�setter��getter����
	public void setPayments(Set<Payment> payments)
	{
		this.payments = payments;
	}
	public Set<Payment> getPayments()
	{
		return this.payments;
	}
 
	//��дequals()������ֻҪname��pass��ͬ��Ա������Ϊ��ȡ�
	public boolean equals(Object obj)
	{
		if (this == obj)
		{
			return true;
		}
		if (obj != null &&
			obj.getClass() == Employee.class)
		{
			Employee employee = (Employee)obj;
			return this.getName().equals(employee.getName())
				&& this.getPass().equals(employee.getPass());
		}
		return false;
	}
	//����Ա����name��pass������hashCodeֵ
	public int hashCode()
	{
		return name.hashCode()
			+ pass.hashCode() * 17;
	}
}