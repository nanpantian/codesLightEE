package org.crazyit.app.service.impl;

import org.crazyit.app.service.*;
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
	implements Person
{
	private Dog dog;
	//dog���Ե�setter����
	public void setDog(Dog dog)
	{
		this.dog = dog;
	}
	public Dog getDog()
	{
		return dog;
	}
	public void test()
	{
		System.out.println("����һ����ͨ��,����һ���Թ���" 
			+ getDog().run());
	}
}
