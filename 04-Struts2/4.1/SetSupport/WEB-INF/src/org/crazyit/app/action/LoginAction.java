package org.crazyit.app.action;

import com.opensymphony.xwork2.*;
import java.util.Date;
import java.util.Set;

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
	private Set users;
	private Date birth;
	//user���Ե�setter��getter����
	public void setUsers(Set users)
	{
		this.users = users;
	}
	public Set getUsers()
	{
		return this.users;
	}
	//birth���Ե�setter��getter����
	public void setBirth(Date birth)
	{
		this.birth = birth;
	}
	public Date getBirth()
	{
		return this.birth;
	}
	//û���ṩexecute()����,
	//��ֱ��ʹ��ActionSupport��execute()����
}