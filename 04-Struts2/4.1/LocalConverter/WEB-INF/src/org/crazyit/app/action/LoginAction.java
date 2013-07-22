package org.crazyit.app.action;

import com.opensymphony.xwork2.Action;

import org.crazyit.app.domain.*;

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
public class LoginAction implements Action
{
	private User user;
	private String tip;

	//user���Ե�setter��getter����
	public void setUser(User user)
	{
		this.user = user;
	}
	public User getUser()
	{
		return this.user;
	}

	//tip���Ե�setter��getter����
	public void setTip(String tip)
	{
		this.tip = tip;
	}
	public String getTip()
	{
		return this.tip;
	}
	
	public String execute() throws Exception
	{
		if (getUser().getName().equals("crazyit.org")
			&& getUser().getPass().equals("leegang") )
		{
			setTip("��¼�ɹ���");
			return SUCCESS;
		}
		else
		{
			setTip("��¼ʧ�ܣ���");
			return ERROR;
		}
	}
}