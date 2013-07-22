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
public class ProcessAppAction
	extends EmpBaseAction
{
	//�����춯�ĳ���ID
	private int attId;
	//ϣ���ı䵽��������
	private int typeId;
	//��������
	private String reason;
	//������
	private String tip;
	//attId���Ե�setter��getter����
	public void setAttId(int attId)
	{
		this.attId = attId;
	}
	public int getAttId()
	{
		return this.attId;
	}

	//typeId���Ե�setter��getter����
	public void setTypeId(int typeId)
	{
		this.typeId = typeId;
	}
	public int getTypeId()
	{
		return this.typeId;
	}

	//reason���Ե�setter��getter����
	public void setReason(String reason)
	{
		this.reason = reason;
	}
	public String getReason()
	{
		return this.reason;
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
	//�����û�����
	public String execute()
		throws Exception
	{
		//�����춯����
		boolean result = mgr.addApplication(attId , 
			typeId , reason);
		//�������ɹ�
		if (result)
		{
			setTip("���Ѿ�����ɹ����ȴ���������");
		}
		else
		{
			setTip("����ʧ�ܣ���ע�ⲻҪ�ظ�����");
		}
		return SUCCESS;
	}
}