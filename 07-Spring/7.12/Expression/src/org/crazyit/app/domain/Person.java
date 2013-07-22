package org.crazyit.app.domain;

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
public class Person
{
	private Integer id;
	private String name;
	private Date birth;

	//�޲����Ĺ�����
	public Person()
	{
	}
	//��ʼ��ȫ�����ԵĹ�����
	public Person(Integer id , String name , Date birth)
	{
		this.id = id;
		this.name = name;
		this.birth = birth;
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

	//birth���Ե�setter��getter����
	public void setBirth(Date birth)
	{
		this.birth = birth;
	}
	public Date getBirth()
	{
		return this.birth;
	}

}