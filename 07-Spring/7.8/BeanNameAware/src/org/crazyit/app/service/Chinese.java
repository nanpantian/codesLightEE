package org.crazyit.app.service;

import org.springframework.beans.factory.BeanNameAware;

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
public class Chinese 
	implements BeanNameAware
{
	//���沿���Beanʱָ����id����
	private String beanName;
	public void setBeanName(String name) 
	{
		this.beanName = name;
	}
	public void info()
	{
		System.out.println("Chineseʵ����"
			+ ", �����Beanʱָ����idΪ" + beanName);
	}
}
