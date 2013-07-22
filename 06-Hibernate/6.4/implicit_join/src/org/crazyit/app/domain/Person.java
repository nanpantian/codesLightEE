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
	//�����ʶ����
	private Integer id;
	//����Personʵ����name����
	private String name;
	//����Personʵ����age����
	private int age;
	//����Person��MyEvent֮��Ĺ�����ϵ
	private MyEvent myEvent;
	//����һ����������
	private Set<String> emails = new HashSet<String>();
	
	//�޲����Ĺ�����
	public Person()
	{
	}
	//��ʼ��ȫ�����ԵĹ�����
	public Person(Integer id , String name , int age)
	{
		this.id = id;
		this.name = name;
		this.age = age;
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
	
	//age���Ե�setter��getter����
	public void setAge(int age)
	{
		this.age = age;
	}
	public int getAge()
	{
		return this.age;
	}
	
	//myEvent���Ե�setter��getter����
	public void setMyEvent(MyEvent myEvent)
	{
		this.myEvent = myEvent;
	}
	public MyEvent getMyEvent()
	{
		return this.myEvent;
	}
	
	//emails���Ե�setter��getter����
	public void setEmails(Set<String> emails)
	{
		this.emails = emails;
	}
	public Set<String> getEmails()
	{
		return this.emails;
	}
}