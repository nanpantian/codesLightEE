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
public class Course

{
	
	//�γ̱�ţ�����Ϊ��ʶ����

	private String courseCode;
	
	//�γ�������
	private String name;
	
	//�޲����Ĺ�����
	public Course()
	{
	}
	//��ʼ��ȫ�����ԵĹ�����
	public Course(String courseCode , String name)
	{
		this.courseCode = courseCode;
		this.name = name;
	}
	
	//courseCode���Ե�setter��getter����
	public void setCourseCode(String courseCode)
	{
		this.courseCode = courseCode;
	}
	public String getCourseCode()
	{
		return this.courseCode;
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
}