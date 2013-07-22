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

public class User

{
	
	private Integer id;

	private String name;

	private int age;
	private String nationality;


	//�޲����Ĺ�����
	public User()
	{
	}
	//��ʼ��ȫ�����ԵĹ�����
	public User(Integer id , String name
		, int age , String nationality)
	{
		this.id = id;
		this.name = name;
		this.age = age;
		this.nationality = nationality;
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
	
	//nationality���Ե�setter��getter����
	public void setNationality(String nationality)
	{
		this.nationality = nationality;
	}
	public String getNationality()
	{
		return this.nationality;
	}
}