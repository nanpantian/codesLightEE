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
public class Name
{
	//����first����
	private String first;
	//����last����
	private String last;
	//����ӵ�и�Name��Person����
	private Person owner;
	
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
	
	//owner���Ե�setter��getter����
	public void setOwner(Person owner)
	{
		this.owner = owner;
	}
	public Person getOwner()
	{
		return this.owner;
	}
}