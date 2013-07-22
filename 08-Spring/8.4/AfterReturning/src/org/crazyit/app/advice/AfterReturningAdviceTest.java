package org.crazyit.app.advice;

import org.aspectj.lang.annotation.*;
import org.aspectj.lang.*;/**
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
public class AfterReturningAdviceTest
{
	//ƥ��org.crazyit.app.service.impl����������ġ�
	//���з�����ִ����Ϊ�����
	@AfterReturning(returning="rvt"
		, pointcut="execution(* org.crazyit.app.service.impl.*.*(..))")
	public void log(Object rvt)
	{
		System.out.println("��ȡĿ�귽������ֵ:" + rvt);
		System.out.println("ģ���¼��־����...");
	}
}
