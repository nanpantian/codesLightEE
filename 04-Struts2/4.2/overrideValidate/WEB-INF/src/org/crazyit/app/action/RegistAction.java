package org.crazyit.app.action;

import com.opensymphony.xwork2.ActionSupport;
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
public class RegistAction extends ActionSupport
{
	private String name;
	private String pass;
	private int age;
	private Date birth;	

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

	//age���Ե�setter��getter����
	public void setAge(int age)
	{
		this.age = age;
	}
	public int getAge()
	{
		return this.age;
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

	public void validate()
	{
		System.out.println("����validate��������У��"
			+ name);
		//Ҫ���û����������crazyit�Ӵ�
		if(!name.contains("crazyit"))
		{
			addFieldError("user" , 
				"�����û����������crazyit��");
		}
	}
}