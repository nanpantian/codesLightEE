package org.crazyit.hrsystem.domain;

import java.io.Serializable;
import java.sql.Date;

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
public class Payment
	implements Serializable
{
	private static final long serialVersionUID = 48L;
	//��ʶ����
	private Integer id;
	private String payMonth;
	//��н������
	private double amount;
	//��н��Ա��
	private Employee employee;
	
	//�޲����Ĺ�����
	public Payment()
	{
	}
	//��ʼ��ȫ�����ԵĹ�����
	public Payment(Integer id , String payMonth , 
		double amount , Employee employee)
	{
		this.id = id;
		this.payMonth = payMonth;
		this.amount = amount;
		this.employee = employee;
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

	//payMonth���Ե�setter��getter����
	public void setPayMonth(String payMonth)
	{
		this.payMonth = payMonth;
	}
	public String getPayMonth()
	{
		return this.payMonth;
	}

	//amount���Ե�setter��getter����
	public void setAmount(double amount)
	{
		this.amount = amount;
	}
	public double getAmount()
	{
		return this.amount;
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