package org.crazyit.app.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import java.util.*;

import org.crazyit.app.action.*;
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
public class BeforeResultInterceptor
	extends AbstractInterceptor
{
	public String intercept(ActionInvocation invocation)
		throws Exception
	{
		//��һ�����ؽ���ļ�����ע�����������
		invocation.addPreResultListener(new MyPreResultListener()); 
		System.out.println("execute����ִ��֮ǰ������...");
		//������һ��������������Action��ִ�з���
		String result = invocation.invoke();
		System.out.println("execute����ִ��֮�������...");
		return result;
	}
}
