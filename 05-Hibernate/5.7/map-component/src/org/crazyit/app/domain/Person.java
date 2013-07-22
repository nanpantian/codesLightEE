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
public class Person
{
	//��ʶ����
	private Integer id;
	//��ͨ����age
	private int age;
	//�������name
	private Map<String , Name> nicks
		= new HashMap<String , Name>();	
	
	//id���Ե�setter��getter����
	public void setId(Integer id)
	{
		this.id = id;
	}
	public Integer getId()
	{
		return this.id;
	}
	
	//age���Ե�setter��getter����
	public void setAge(int age)
	{
		this.age = age;
	}
	public int getAge()
	{
		return this.age;
	}
	
	//nicks���Ե�setter��getter����
	public void setNicks(Map<String , Name> nicks)
	{
		this.nicks = nicks;
	}
	public Map<String , Name> getNicks()
	{
		return this.nicks;
	}
}