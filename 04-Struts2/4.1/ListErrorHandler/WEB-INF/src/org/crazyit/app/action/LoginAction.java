package org.crazyit.app.action;

import com.opensymphony.xwork2.Action;
import java.util.Date;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

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
public class LoginAction extends ActionSupport
{
	private List<User> users;
	
	//users���Ե�setter��getter����
	public void setUsers(List<User> users)
	{
		this.users = users;
	}
	public List<User> getUsers()
	{
		return users;
	}
}