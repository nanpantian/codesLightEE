package org.crazyit.app.service.impl;

import org.springframework.stereotype.*;

import java.io.*;

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
		//�÷���������Ȼ�׳����쳣�����÷���
		//�Լ������˸��쳣������AOP����Ը��쳣���д���
		try
		{
			System.out.println("sayHello������ʼ��ִ��...");
			new FileInputStream("a.txt");
		}
		catch (Exception ex)
		{
			System.out.println("Ŀ������쳣����"
				+ ex.getMessage());
		}
		//���ؼ򵥵��ַ���
		return name + " Hello , Spring AOP";
	}
	//����һ��divide()����
	public void divide()
	{
		int a = 5 / 0;
		System.out.println("divideִ����ɣ�");
	}
}