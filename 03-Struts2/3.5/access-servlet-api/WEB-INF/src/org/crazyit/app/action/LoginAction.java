package org.crazyit.app.action;

import com.opensymphony.xwork2.*;
import org.apache.struts2.interceptor.*;

import javax.servlet.http.*;

import java.util.Map;

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
	implements Action,ServletResponseAware
{
	private String username;
	private String password;
	private HttpServletResponse response;

	//��дʵ��ServletResponseAware�ӿڱ���ʵ�ֵķ���
	public void setServletResponse(HttpServletResponse response) 
	{
		this.response = response;
	}

	//username���Ե�setter��getter����
	public void setUsername(String username)
	{
		this.username = username;
	}
	public String getUsername()
	{
		return this.username;
	}

	//password���Ե�setter��getter����
	public void setPassword(String password)
	{
		this.password = password;
	}
	public String getPassword()
	{
		return this.password;
	}
	
	public String execute() throws Exception
	{
		ActionContext ctx = ActionContext.getContext();
		//ͨ��ActionContext����application��Χ������ֵ
		Integer counter = (Integer)ctx.getApplication()
			.get("counter");
		if (counter == null)
		{
			counter = 1;
		}
		else
		{
			counter = counter + 1;
		}
		//ͨ��ActionContext����application��Χ������
		ctx.getApplication().put("counter" , counter);
		//ͨ��ActionContext����session��Χ������
		ctx.getSession().put("user" , getUsername());
		if (getUsername().equals("crazyit.org")
			&& getPassword().equals("leegang") )
		{
			//ͨ��response���Cookie
			Cookie c = new Cookie("user" , getUsername());
			c.setMaxAge(60 * 60);
			response.addCookie(c);
			//ͨ��ActionContext����request��Χ������
			ctx.put("tip" , "��������ʾ�����Ѿ��ɹ��ĵ�¼");
			return SUCCESS;
		}
		else
		{
			//ͨ��ActionContext����request��Χ������
			ctx.put("tip" , "��������ʾ����¼ʧ��");
			return ERROR;
		}
	}
}