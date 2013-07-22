package org.crazyit.app.advice;

import org.aspectj.lang.annotation.*;
import org.aspectj.lang.*;

import java.util.*;
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
@Aspect
public class AccessArgAspect
{	//�����args(msg,time)��֤�������ֻƥ��
	//���е�һ���������ַ������ڶ���������Date�ķ���
	@AfterReturning(pointcut="execution(* org.crazyit.app.service.impl"
		+ ".*.*(..)) && args(food , time , ..)"
		, returning="retVal")
	public void access(Date time , String food ,
			Object retVal)
	{
		System.out.println("Ŀ�귽����String����Ϊ��" + food);
		System.out.println("Ŀ�귽����Date����Ϊ��" + time);
		System.out.println("ģ���¼��־....");
	}
}
