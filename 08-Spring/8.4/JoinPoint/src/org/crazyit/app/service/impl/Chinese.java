package org.crazyit.app.service.impl;

import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.*;

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
		System.out.println("sayHello����������...");
		//���ؼ򵥵��ַ���
		return name + " Hello , Spring AOP";
	}
	//����һ��eat()����
	public void eat(String food)
	{
		System.out.println("�����ڳ�:"
			+ food);
	}
}