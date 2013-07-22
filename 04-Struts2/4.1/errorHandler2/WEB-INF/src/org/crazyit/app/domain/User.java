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
public class User
{
	private String name;
	private Integer age;
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

	//age���Ե�setter��getter����
	public void setAge(Integer age)
	{
		this.age = age;
	}
	public Integer getAge()
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

}