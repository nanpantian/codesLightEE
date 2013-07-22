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
public class User
{
	private String name;
	private String pass;
	
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
	
	public boolean equals(Object obj)
	{
		//���Ƚϵ�����������ͬһ������ֱ�ӷ���true
		if(this == obj)
		{
			return true;
		}
		//ֻ�е�obj��User����
		if (obj != null && obj.getClass() == User.class)
		{
			User user = (User)obj;
			//���������name������ȼ���Ϊ������ȡ�
			if (this.getName().equals(user.getName()))
			{
				return true;
			}
		}
		return false;
	}
	//����name����������hashCode��
	public int hashCode()
	{
		return name.hashCode();
	}
}