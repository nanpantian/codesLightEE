package org.crazyit.app.advice;

import org.aspectj.lang.annotation.*;
import org.aspectj.lang.*;
import org.springframework.core.annotation.Order;
import java.util.Arrays;

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
//����һ������
@Aspect
@Order(1)
public class SecondAdviceTest
{
	//����Before��ǿ����ִ��
	@Before("execution(* org.crazyit.app.service.impl.*.*(..))")
	public void zuthority(JoinPoint jp)
	{
		System.out.println("�ź�Before��ǿ��ģ��ִ��Ȩ�޼��");
	}
}
