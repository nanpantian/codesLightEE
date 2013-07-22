package org.crazyit.app.interceptor;

import com.opensymphony.xwork2.*;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

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
//Ȩ�޼���������̳�AbstractInterceptor��
public class AuthorityInterceptor
	extends AbstractInterceptor
{
	//����Action��������ط���
	public String intercept(ActionInvocation invocation)
		throws Exception
	{
		//ȡ��������ص�ActionContextʵ��
		ActionContext ctx = invocation.getInvocationContext();
		Map session = ctx.getSession();
		//ȡ����Ϊuser��Session����
		String user = (String)session.get("user");
		//���û�е�¼�����ߵ�¼���õ��û�������scott�����������µ�¼
		if (user != null && user.equals("crazyit.org") )
		{
			return invocation.invoke();
		}
		//û�е�¼������������ʾ���ó�һ��HttpServletRequest����
		ctx.put("tip" ,
			"����û�е�¼��������crazyit.org,leegang��¼ϵͳ");
		//ֱ�ӷ���login���߼���ͼ
		return Action.LOGIN;
	}
}
