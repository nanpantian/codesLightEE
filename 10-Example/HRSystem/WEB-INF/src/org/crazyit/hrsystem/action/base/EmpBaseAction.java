package org.crazyit.hrsystem.action.base;

import com.opensymphony.xwork2.ActionSupport;

import org.crazyit.hrsystem.service.EmpManager;

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
public class EmpBaseAction
	extends ActionSupport
{
	//������ҵ���߼����
	protected EmpManager mgr;
	//����ע��ҵ���߼�����������setter����
	public void setEmpManager(EmpManager mgr)
	{
		this.mgr = mgr;
	}
}