package org.crazyit.hrsystem.domain;

import java.io.Serializable;

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
public class AttendType
	implements Serializable
{
	private static final long serialVersionUID = 48L;

	//��ʶ����
	private Integer id;
	//�������͵�����
	private String name;
	//������ڶ�Ӧ�ķ���
	private double amerce;
	
	//�޲����Ĺ�����
	public AttendType()
	{
	}
	//��ʼ��ȫ�����ԵĹ�����
	public AttendType(Integer id , String name , double amerce)
	{
		this.id = id;
		this.name = name;
		this.amerce = amerce;
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

	//amerce���Ե�setter��getter����
	public void setAmerce(double amerce)
	{
		this.amerce = amerce;
	}
	public double getAmerce()
	{
		return this.amerce;
	}
}