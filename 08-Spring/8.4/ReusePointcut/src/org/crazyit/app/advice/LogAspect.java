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
@Aspect
public class LogAspect
{
	//ֱ��ʹ��SystemArchitecture�������myPointcut�����
	//args(msg)��֤�������ֻƥ��ֻ��һ���ַ��������ķ���
	@AfterReturning(pointcut="SystemArchitecture.myPointcut()"
		+ "&&args(msg)" , returning="retVal")
	public void writeLog(String msg, Object retVal)
	{
		System.out.println(msg);
		System.out.println(retVal);
		System.out.println("ģ���¼��־....");
	}
}
