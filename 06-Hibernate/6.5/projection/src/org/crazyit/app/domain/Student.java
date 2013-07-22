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
public class Student
{
	//����ѧ��ѧ�ţ�����Ϊ��ʶ����
	private Integer studentNumber;
	//����ѧ����������
	private String name;
	//����ѧ��ʵ�������ѡ�μ�¼ʵ��
	private Set<Enrolment> enrolments
		= new HashSet<Enrolment>();	//�޲����Ĺ�����
	public Student()
	{
	}
	//��ʼ��ȫ�����ԵĹ�����
	public Student(Integer studentNumber , String name)
	{
		this.studentNumber = studentNumber;
		this.name = name;
	}
	
	//studentNumber���Ե�setter��getter����
	public void setStudentNumber(Integer studentNumber)
	{
		this.studentNumber = studentNumber;
	}
	public Integer getStudentNumber()
	{
		return this.studentNumber;
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
	
	//enrolments���Ե�setter��getter����
	public void setEnrolments(Set<Enrolment> enrolments)
	{
		this.enrolments = enrolments;
	}
	public Set<Enrolment> getEnrolments()
	{
		return this.enrolments;
	}
}