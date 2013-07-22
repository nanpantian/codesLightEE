package org.crazyit.app.action;

import com.opensymphony.xwork2.*;
import com.opensymphony.xwork2.interceptor.PreResultListener;
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
 
public class LoginRegistAction 
	extends ActionSupport
{
	//��װ�û������������������
	private String username;
	private String password;
	//��װ��������tip����
	private String tip;
	//username���Զ�Ӧ��setter��getter����
	public String getUsername()
	{
		return username;
	}
	public void setUsername(String username)
	{
		this.username = username;
	}
	//password���Զ�Ӧ��getter��setter����
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	//tip���Զ�Ӧ��setter��getter����
	public String getTip()
	{
		return tip;
	}
	public void setTip(String tip)
	{
		this.tip = tip;
	}
	//Action������ע������߼�
	public String regist() throws Exception
	{
		ActionContext.getContext().getSession()
			.put("user" , getUsername());
		setTip("��ϲ��," + getUsername() + ",���Ѿ�ע��ɹ���");
		return SUCCESS;
	}
	//ActionĬ�ϰ����Ŀ����߼�
	public String execute() throws Exception
	{
		ActionInvocation invocation = ActionContext
			.getContext().getActionInvocation();
		invocation.addPreResultListener(new PreResultListener() 
		{
			public void beforeResult(ActionInvocation invocation, 
				String resultCode) 
			{
				System.out.println("���ص��߼���ͼ����Ϊ��"
					+ resultCode);
				//�ڷ���Result֮ǰ����һ����������ݡ�
				invocation.getInvocationContext().put("extra"
					, new java.util.Date() + "��" 
					+ resultCode + "�߼���ͼ��ת��");
				//Ҳ�ɼ�����־��
			}
		});
		if (getUsername().equals("crazyit.org")
			&& getPassword().equals("leegang") )
		{
			ActionContext.getContext().getSession()
				.put("user" , getUsername());
			setTip("��ӭ," + getUsername() + ",���Ѿ���¼�ɹ���");
			return SUCCESS;
		}
		else
		{
			return ERROR;
		}
	}
}