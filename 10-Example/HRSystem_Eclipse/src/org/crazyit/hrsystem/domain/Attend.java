package org.crazyit.hrsystem.domain;

import java.io.Serializable;
import java.util.Date;

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
public class Attend
	implements Serializable
{
	private static final long serialVersionUID = 48L;

	//�����ʶ����
	private Integer id;
	//��������
	private String dutyDay;
	//��ʱ��
	private Date punchTime;
	//�����δ��Ƿ�Ϊ�ϰ��
	private boolean isCome;
	//���γ��ڵ�����
	private AttendType type;
	//���γ��ڹ�����Ա��
	private Employee employee;

	//�޲����Ĺ�����
	public Attend()
	{
	}
	//��ʼ��ȫ�����ԵĹ�����
	public Attend(Integer id , String dutyDay ,
		Date punchTime , boolean isCome ,
		AttendType type , Employee employee)
	{
		this.id = id;
		this.dutyDay = dutyDay;
		this.punchTime = punchTime;
		this.isCome = isCome;
		this.type = type;
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

	//dutyDay���Ե�setter��getter����
	public void setDutyDay(String dutyDay)
	{
		this.dutyDay = dutyDay;
	}
	public String getDutyDay()
	{
		return this.dutyDay;
	}

	//punchTime���Ե�setter��getter����
	public void setPunchTime(Date punchTime)
	{
		this.punchTime = punchTime;
	}
	public Date getPunchTime()
	{
		return this.punchTime;
	}

	//isCome���Ե�setter��getter����
	public void setIsCome(boolean isCome)
	{
		this.isCome = isCome;
	}
	public boolean getIsCome()
	{
		return this.isCome;
	}

	//type���Ե�setter��getter����
	public void setType(AttendType type)
	{
		this.type = type;
	}
	public AttendType getType()
	{
		return this.type;
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

	//����employee��isCome��dutyDay����дequals����
	public boolean equals(Object obj)
	{
		if (this == obj)
		{
			return true;
		}
		if (obj != null &&
			obj.getClass() == Attend.class)
		{
			Attend attend = (Attend)obj;
			return getEmployee().equals(attend.getEmployee())
				&& getDutyDay().equals(attend.getDutyDay())
				&& getIsCome() == attend.getIsCome();
		}
		return false;
	}
	//����employee��isCome��dutyDay����дhashCode()����
	public int hashCode ()
	{
		if (getIsCome())
		{
			return dutyDay.hashCode() + 
				29 * employee.hashCode() + 1;
		}
		return dutyDay.hashCode() + 
			29 * employee.hashCode();
	}
}