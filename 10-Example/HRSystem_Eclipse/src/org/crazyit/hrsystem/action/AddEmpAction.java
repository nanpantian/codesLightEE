package org.crazyit.hrsystem.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.opensymphony.xwork2.*;
import org.apache.struts2.interceptor.*;

import org.crazyit.hrsystem.exception.HrException;
import org.crazyit.hrsystem.domain.*;
import org.crazyit.hrsystem.action.base.MgrBaseAction;

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
public class AddEmpAction extends MgrBaseAction
{
	//������Ա����
	private Employee emp;
	//��װ��ʾ��Ϣ��tip����
	private String tip;
	//emp���Ե�setter��getter����
	public void setEmp(Employee emp)
	{
		this.emp = emp;
	}
	public Employee getEmp()
	{
		return this.emp;
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

	public String execute()
		throws Exception
	{
		//����ActionContextʵ��
		ActionContext ctx = ActionContext.getContext();
		//��ȡHttpSession�е�user����
		String mgrName = (String)ctx.getSession()
			.get(WebConstant.USER);
		//������û�
		mgr.addEmp(emp , mgrName);
		setTip("����Ա���ɹ�");
		return SUCCESS;
	}

}