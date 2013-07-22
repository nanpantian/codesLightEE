package org.crazyit.app.action.book;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

import org.apache.struts2.dispatcher.*;

import org.apache.struts2.config.*;

import org.crazyit.app.service.*;

/**
 * Description:
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a> 
 * <br/>Copyright (C), 2001-2010, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */

public class GetBooksAction implements Action
{
	//��װ���ݵ�books����
	private String[] books;
	//ʡ��books���Ե�setter��getter����
	
	//books���Ե�setter��getter����
	public void setBooks(String[] books)
	{
		this.books = books;
	}
	public String[] getBooks()
	{
		return this.books;
	}

	//�����û������execute����
	public String execute() throws Exception
	{
		String user = (String)ActionContext.getContext()
			.getSession().get("user");
		if (user != null && user.equals("crazyit.org"))
		{
			//����ҵ���߼������������ҵ���߼�����ķ���
			BookService bs = new BookService();
			setBooks(bs.getLeeBooks());
			return SUCCESS;
		}
		else
		{
			return LOGIN;
		}
	}
}