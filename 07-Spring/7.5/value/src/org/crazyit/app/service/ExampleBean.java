package org.crazyit.app.service;

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
public class ExampleBean
{
	//����һ��int�͵�����
	private int integerProperty;
	//����һ��double�͵�����
	private double doubleProperty;

	//integerProperty���Ե�setter��getter����
	public void setIntegerProperty(int integerProperty)
	{
		this.integerProperty = integerProperty;
	}
	public int getIntegerProperty()
	{
		return this.integerProperty;
	}

	//doubleProperty���Ե�setter��getter����
	public void setDoubleProperty(double doubleProperty)
	{
		this.doubleProperty = doubleProperty;
	}
	public double getDoubleProperty()
	{
		return this.doubleProperty;
	}
}