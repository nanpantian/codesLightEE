package org.crazyit.hrsystem.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.opensymphony.xwork2.*;
import org.apache.struts2.interceptor.*;

import org.crazyit.hrsystem.service.EmpManager;
import org.crazyit.hrsystem.exception.HrException;
import org.crazyit.hrsystem.action.base.EmpBaseAction;

import org.crazyit.hrsystem.vo.*;

import java.util.*;

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

public class ViewSalaryAction extends EmpBaseAction
{
	//��װ���з�н��Ϣ��List
	private List salarys;
	//salarys���Ե�setter��getter����
	public void setSalarys(List salarys)
	{
		this.salarys = salarys;
	}
	public List getSalarys()
	{
		return this.salarys;
	}
	//�����û�����ķ���
	public String execute()
		throws Exception
	{
		//����ActionContextʵ��
		ActionContext ctx = ActionContext.getContext();
		//��ȡHttpSession�е�user����
		String user = (String)ctx.getSession()
			.get(WebConstant.USER);
		List<PaymentBean> salarys =  mgr.empSalary(user);
		setSalarys(salarys);
		return SUCCESS;
	}
}