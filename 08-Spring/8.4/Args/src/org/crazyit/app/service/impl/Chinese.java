package org.crazyit.app.service.impl;

import org.springframework.stereotype.*;

import java.util.*;

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
@Component
public class Chinese 
	implements Person
{
	//ʵ��Person�ӿڵ�sayHello()����
	public String sayHello(String name)
	{
		//���ؼ򵥵��ַ���
		return name + " Hello , Spring AOP";
	}
	public void eat(String food 
		, Date time)
	{
		System.out.println("�����ڳ�" + food
			+ ",����ʱ����:" + time);
	}
}