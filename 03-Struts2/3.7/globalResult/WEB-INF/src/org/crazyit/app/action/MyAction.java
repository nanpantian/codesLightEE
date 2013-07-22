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
 
public class MyAction extends ActionSupport
{
	//��װ���������target���ԡ�
	private String target;
	//��װ��������tip����
	private String tip;

	//target���Ե�setter��getter����
	public void setTarget(String target)
	{
		this.target = target;
	}
	public String getTarget()
	{
		return this.target;
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
		setTip("��ϲ��,���Ѿ��ɹ�ת��");
		return SUCCESS;
	}
}