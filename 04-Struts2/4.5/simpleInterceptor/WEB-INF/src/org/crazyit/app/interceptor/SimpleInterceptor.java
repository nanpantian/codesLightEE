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
public class SimpleInterceptor
	extends AbstractInterceptor
{
	//��������������
	private String name;
	//Ϊ�ü��������������ֵ�setter����
	public void setName(String name)
	{
		this.name = name;
	}
	public String intercept(ActionInvocation invocation)
		throws Exception
	{
		//ȡ�ñ����ص�Actionʵ��
		LoginAction action = (LoginAction)invocation.getAction();
		//��ӡִ�п�ʼ��ʵ��
		System.out.println(name + " �������Ķ���---------" + 
			"��ʼִ�е�¼Action��ʱ��Ϊ��" + new Date());
		//ȡ�ÿ�ʼִ��Action��ʱ��
		long start = System.currentTimeMillis();
		//ִ�и��������ĺ�һ��������
		//�������������û����������������ֱ��ִ��Action��execute����
		String result = invocation.invoke();
		//��ӡִ�н�����ʱ��
		System.out.println(name + " �������Ķ���---------" + 
			"ִ�����¼Action��ʱ��Ϊ��" + new Date());
		long end = System.currentTimeMillis();
		System.out.println(name + " �������Ķ���---------" + 
			"ִ�����Action���¼�Ϊ" + (end - start) + "����");
		return result;
	}
}
