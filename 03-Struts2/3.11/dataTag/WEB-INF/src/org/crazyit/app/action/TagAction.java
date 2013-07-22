package org.crazyit.app.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ActionContext;

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
public class TagAction extends ActionSupport
{
	//��װ�û����������author����
	private String author;

	//author���Ե�setter��getter����
	public void setAuthor(String author)
	{
		this.author = author;
	}
	public String getAuthor()
	{
		return this.author;
	}
	//�����һ�������߼�
	public String execute() throws Exception
	{
		return "done";
	}
	//����ڶ��������߼�
	public String login() throws Exception
	{
		ActionContext.getContext().
			put("author", getAuthor());
		return "done";
	}
}