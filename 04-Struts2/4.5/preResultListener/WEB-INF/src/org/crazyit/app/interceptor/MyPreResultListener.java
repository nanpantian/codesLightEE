package org.crazyit.app.interceptor;

import com.opensymphony.xwork2.interceptor.*;
import com.opensymphony.xwork2.ActionInvocation;

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
public class MyPreResultListener 
	implements PreResultListener
{
	//�����ڴ���Result֮ǰ����Ϊ
	public void beforeResult(ActionInvocation invocation
		,String resultCode)
	{
		//��ӡ��ִ�н��
		System.out.println("���ص��߼���ͼΪ:" + resultCode);
		try
		{
			invocation.invoke();
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
		}
	}
}

