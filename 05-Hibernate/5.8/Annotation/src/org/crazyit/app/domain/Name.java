package org.crazyit.app.domain;

import javax.persistence.*;

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
//�������������
@Embeddable
public class Name
	implements java.io.Serializable
{
	private String first;
	private String last;
	//�޲����Ĺ�����
	public Name()
	{
	}
	//��ʼ��ȫ�����ԵĹ�����
	public Name(String first , String last)
	{
		this.first = first;
		this.last = last;
	}
	
	//first���Ե�setter��getter����
	public void setFirst(String first)
	{
		this.first = first;
	}
	public String getFirst()
	{
		return this.first;
	}
	
	//last���Ե�setter��getter����
	public void setLast(String last)
	{
		this.last = last;
	}
	public String getLast()
	{
		return this.last;
	}

	//�ṩ��д��equals����
	public boolean equals(Object obj)
	{
		if (this == obj)
		{
			return true;
		}
		if (obj.getClass() == Name.class)
		{
			Name target = (Name)obj;
			if (target.getFirst().equals(first)
				&& target.getLast().equals(last))
			{
				return true;
			}
		}
		return false;
	}

	//�ṩ��д��hashCode����
	public int hashCode()
	{
		return first.hashCode() + last.hashCode() * 17;
	}
}