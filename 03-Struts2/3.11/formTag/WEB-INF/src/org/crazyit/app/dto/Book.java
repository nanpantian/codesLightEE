package org.crazyit.app.dto;

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
public class Book
{
	private String name;
	private String author;
	//�޲����Ĺ�����
	public Book()
	{
	}
	//��ʼ��ȫ�����ԵĹ�����
	public Book(String name , String author)
	{
		this.name = name;
		this.author = author;
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

	//author���Ե�setter��getter����
	public void setAuthor(String author)
	{
		this.author = author;
	}
	public String getAuthor()
	{
		return this.author;
	}
}