package org.crazyit.app.domain;

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
 
//�˿���̳���Person��
public class Customer extends Person
{
	//�˿͵�������Ϣ
	private String comments;
	//��Ա�����ֹ�����ϵ������
	private Employee employee;
	//�޲����Ĺ�����
	public Customer()
	{
	}
	//��ʼ��comments���ԵĹ�����
	public Customer(String comments)
	{
		this.comments = comments;
	}
	
	//comments���Ե�setter��getter����
	public void setComments(String comments)
	{
		this.comments = comments;
	}
	public String getComments()
	{
		return this.comments;
	}
	
	//employee���Ե�setter��getter����
	public void setEmployee(Employee employee)
	{
		this.employee = employee;
	}
	public Employee getEmployee()
	{
		return this.employee;
	}
}