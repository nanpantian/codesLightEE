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
public class MyEvent
{
	//�����ʶ����
	private Integer id;
	//����MyEvent���������
	private String title;
	//����MyEvent����ķ���ʱ��
	private Date happenDate;
	//����MyEvent�����Person����Ĺ���
	private Set<Person> actors = new HashSet<Person>();
	
	//�޲����Ĺ�����
	public MyEvent()
	{
	}
	//��ʼ��ȫ�����ԵĹ�����
	public MyEvent(Integer id , String title , Date happenDate)
	{
		this.id = id;
		this.title = title;
		this.happenDate = happenDate;
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
	
	//title���Ե�setter��getter����
	public void setTitle(String title)
	{
		this.title = title;
	}
	public String getTitle()
	{
		return this.title;
	}
	
	//happenDate���Ե�setter��getter����
	public void setHappenDate(Date happenDate)
	{
		this.happenDate = happenDate;
	}
	public Date getHappenDate()
	{
		return this.happenDate;
	}
	
	//actors���Ե�setter��getter����
	public void setActors(Set<Person> actors)
	{
		this.actors = actors;
	}
	public Set<Person> getActors()
	{
		return this.actors;
	}
}