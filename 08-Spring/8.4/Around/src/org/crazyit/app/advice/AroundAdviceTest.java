package org.crazyit.app.advice;

import org.aspectj.lang.annotation.*;
import org.aspectj.lang.*;

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
public class AroundAdviceTest
{
	//ƥ��org.crazyit.app.service.impl����������ġ�
	//���з�����ִ����Ϊ�����
	@Around("execution(* org.crazyit.app.service.impl.*.*(..))")
	public Object processTx(ProceedingJoinPoint jp)
		throws java.lang.Throwable
	{
		System.out.println("ִ��Ŀ�귽��֮ǰ��ģ�⿪ʼ����...");
		//ִ��Ŀ�귽����������Ŀ�귽��ִ�к�ķ���ֵ
		Object rvt = jp.proceed(new String[]{"���ı�Ĳ���"});
		System.out.println("ִ��Ŀ�귽��֮��ģ���������...");
		return rvt + " ����������";
	}
}
