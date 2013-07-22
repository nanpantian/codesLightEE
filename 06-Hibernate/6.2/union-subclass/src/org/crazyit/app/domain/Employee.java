package org.crazyit.app.domain;

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
 
//Ա����̳���Person��
public class Employee extends Person
{
	//�����Ա����ְλ����
	private String title;
	//�����Ա���Ĺ�������
	private double salary;
	//�͹˿ͱ��ֹ�����ϵ������
	private Set<Customer> customers = new HashSet<Customer>();
	//�;����ֹ�����ϵ������
	private Manager manager;
	
	//�޲����Ĺ�����
	public Employee()
	{
	}
	//��ʼ��ȫ�����ԵĹ�����
	public Employee(String title , double salary)
	{
		this.title = title;
		this.salary = salary;
	}
	
	//title���Ե�setter��getter����
	public void setTitle(String title)
	{
		this.title = title;
	}
	public String getTitle()
	{
		return this.title;
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
	
	//customers���Ե�setter��getter����
	public void setCustomers(Set<Customer> customers)
	{
		this.customers = customers;
	}
	public Set<Customer> getCustomers()
	{
		return this.customers;
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
}