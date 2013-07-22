package org.crazyit.app.action;

import com.opensymphony.xwork2.Action;

import java.io.*;
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
public class LoginAction
	implements Action
{
	//��װ�����������������
	private String user;
	private String pass;
	//��װ�������Ķ�������
	private InputStream inputStream;

	//user���Ե�setter��getter����
	public void setUser(String user)
	{
		this.user = user;
	}
	public String getUser()
	{
		return this.user;
	}

	//pass���Ե�setter��getter����
	public void setPass(String pass)
	{
		this.pass = pass;
	}
	public String getPass()
	{
		return this.pass;
	}

	public InputStream getResult()
	{
		return inputStream;
	}

	public String execute() 
		throws Exception 
	{
		//�ж��û��������룬���ɶ�Ӧ����Ӧ
		inputStream = user.equals("crazyit.org") && pass.equals("leegang")
			? new ByteArrayInputStream("��ϲ�㣬��¼�ɹ�!"
				.getBytes("UTF-8"))
			: new ByteArrayInputStream("�Բ����û��������벻ƥ�䣡"
				.getBytes("UTF-8"));
		return SUCCESS;
	}
}