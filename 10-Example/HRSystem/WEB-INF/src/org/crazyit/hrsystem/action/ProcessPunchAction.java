package org.crazyit.hrsystem.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.opensymphony.xwork2.*;
import org.apache.struts2.interceptor.*;

import org.crazyit.hrsystem.service.EmpManager;
import org.crazyit.hrsystem.exception.HrException;
import static org.crazyit.hrsystem.service.EmpManager.*;

import java.util.*;
import java.text.SimpleDateFormat;

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
public class ProcessPunchAction
	extends ActionSupport
{
	//��Action��������ҵ���߼����
	private EmpManager empMgr;
	//��װ��������tip����
	private String tip;
	//����ע��ҵ���߼������setter����
	public void setEmpManager(EmpManager empMgr)
	{
		this.empMgr = empMgr;
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
	//�����ϰ�򿨵ķ���
	public String come()
		throws Exception
	{
		return process(true);
	}
	//�����°�򿨵ķ���
	public String leave()
		throws Exception
	{
		return process(false);
	}
	private String process(boolean isCome)
		throws Exception
	{
		//����ActionContextʵ��
		ActionContext ctx = ActionContext.getContext();
		//��ȡHttpSession�е�user����
		String user = (String)ctx.getSession()
			.get(WebConstant.USER);
		System.out.println("-----��----" + user);
		String dutyDay = new java.sql.Date(
			System.currentTimeMillis()).toString();
		//����ҵ���߼��������������
		int result = empMgr.punch(user ,dutyDay , isCome);
		switch(result)
		{
			case PUNCH_FAIL:
				setTip("��ʧ��");
				break;
			case PUNCHED:
				setTip("���Ѿ�������ˣ���Ҫ�ظ���");
				break;
			case PUNCH_SUCC:
				setTip("�򿨳ɹ�");
				break;
		}
		return SUCCESS;
	}
}