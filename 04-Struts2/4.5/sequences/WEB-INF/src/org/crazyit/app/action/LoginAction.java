package org.crazyit.app.action;

import com.opensymphony.xwork2.ActionSupport;

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
	extends ActionSupport
{
	private String username;
	private String password;
	//username��setter��getter����
	public void setUsername(String username)
	{
		this.username = username;
	}
	public String getUsername()
	{
		return username;
	}
	//password��setter��getter����
	public void setPassword(String password)
	{
		this.password = password;
	}
	public String getPassword()
	{
		return password;
	}
	
	public String execute() throws Exception
	{
		System.out.println("����execute����ִ����..........");
		Thread.sleep(1500);
		if (getUsername().equals("crazyit.org")
			&& getPassword().equals("leegang") )
		{
			return SUCCESS;
		}
		else
		{
			return ERROR;
		}
	}
}
