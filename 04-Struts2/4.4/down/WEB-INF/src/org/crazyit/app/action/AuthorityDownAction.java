package org.crazyit.app.action;

import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.*;

import java.util.Map;
import java.io.InputStream;

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
public class AuthorityDownAction
	implements Action 
{
	private String inputPath;
	public void setInputPath(String value)
	{
		inputPath = value;
	}
	
	public InputStream getTargetFile() throws Exception 
	{
		//ServletContext�ṩgetResourceAsStream()����
		//����ָ���ļ���Ӧ�������� 
		return ServletActionContext.getServletContext()
			.getResourceAsStream(inputPath);
	}
	
	public String execute() throws Exception
	{
		//ȡ��ActionContextʵ��
		ActionContext ctx = ActionContext.getContext();
		//ͨ��ActionContext�����û���HttpSession
		Map session = ctx.getSession();
		String user = (String)session.get("user");
		//�ж�Session���user�Ƿ�ͨ�����
		if ( user !=  null && user.equals("crazyit.org"))
		{
			return SUCCESS;
		}
		ctx.put("tip"
			, "����û�е�¼�����ߵ�¼���û�������ȷ�������µ�¼��");
		return LOGIN;
	}
}
