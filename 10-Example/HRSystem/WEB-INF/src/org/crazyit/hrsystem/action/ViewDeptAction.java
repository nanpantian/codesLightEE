package org.crazyit.hrsystem.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.opensymphony.xwork2.*;
import org.apache.struts2.interceptor.*;

import org.crazyit.hrsystem.service.MgrManager;
import org.crazyit.hrsystem.exception.HrException;
import org.crazyit.hrsystem.action.base.MgrBaseAction;
import org.crazyit.hrsystem.vo.*;

import java.util.List;

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

public class ViewDeptAction extends MgrBaseAction
{
	//��װ��н�б��List����
	private List sals;
	//sals���Ե�setter��getter����
	public void setSals(List sals)
	{
		this.sals = sals;
	}
	public List getSals()
	{
		return this.sals;
	}	

	public String execute()
		throws Exception
	{
		//����ActionContextʵ��
		ActionContext ctx = ActionContext.getContext();
		//��ȡHttpSession�е�user����
		String mgrName = (String)ctx.getSession()
			.get(WebConstant.USER);
		//����ҵ���߼�����ȡ�õ�ǰԱ����ȫ����н�б�
		List<SalaryBean> result = mgr.getSalaryByMgr(mgrName);
		System.out.println("--------------" + result);
		setSals(result);
		return SUCCESS;
	}
}