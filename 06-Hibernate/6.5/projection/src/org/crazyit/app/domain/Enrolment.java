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

public class Enrolment

{

	//�����ʶ����

	private Integer enrolmentId;

	//����ѡ�μ�¼����ѧ��
	private int year;
	
//����ѡ�μ�¼����ѧ��

	private int semester;
	//����ѡ�μ�¼������ѧ��ʵ��

	private Student student;

	//����ѡ�μ�¼�����Ŀγ�ʵ��

	private Course course;

	//�޲����Ĺ�����
	public Enrolment()
	{
	}
	//��ʼ��ȫ�����ԵĹ�����
	public Enrolment(Integer enrolmentId , int year , int semester)
	{
		this.enrolmentId = enrolmentId;
		this.year = year;
		this.semester = semester;
	}
	
	//enrolmentId���Ե�setter��getter����
	public void setEnrolmentId(Integer enrolmentId)
	{
		this.enrolmentId = enrolmentId;
	}
	public Integer getEnrolmentId()
	{
		return this.enrolmentId;
	}
	
	//year���Ե�setter��getter����
	public void setYear(int year)
	{
		this.year = year;
	}
	public int getYear()
	{
		return this.year;
	}
	
	//semester���Ե�setter��getter����
	public void setSemester(int semester)
	{
		this.semester = semester;
	}
	public int getSemester()
	{
		return this.semester;
	}
	
	//student���Ե�setter��getter����
	public void setStudent(Student student)
	{
		this.student = student;
	}
	public Student getStudent()
	{
		return this.student;
	}
	
	//course���Ե�setter��getter����
	public void setCourse(Course course)
	{
		this.course = course;
	}
	public Course getCourse()
	{
		return this.course;
	}
}