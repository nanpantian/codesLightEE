package org.crazyit.hrsystem.vo;

import java.io.Serializable;
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
public class AppBean implements Serializable
{
	private static final long serialVersionUID = 48L;

	private int id;
	private String emp;
	private String unAttend;
	private String toAttend;
	private String reason;

	//�޲����Ĺ�����
	public AppBean()
	{
	}
	//��ʼ��ȫ�����ԵĹ�����
	public AppBean(int id , String emp , String unAttend 
		, String toAttend , String reason)
	{
		this.id = id;
		this.emp = emp;
		this.unAttend = unAttend;
		this.toAttend = toAttend;
		this.reason = reason;
	}

	//id���Ե�setter��getter����
	public void setId(int id)
	{
		this.id = id;
	}
	public int getId()
	{
		return this.id;
	}

	//emp���Ե�setter��getter����
	public void setEmp(String emp)
	{
		this.emp = emp;
	}
	public String getEmp()
	{
		return this.emp;
	}

	//unAttend���Ե�setter��getter����
	public void setUnAttend(String unAttend)
	{
		this.unAttend = unAttend;
	}
	public String getUnAttend()
	{
		return this.unAttend;
	}

	//toAttend���Ե�setter��getter����
	public void setToAttend(String toAttend)
	{
		this.toAttend = toAttend;
	}
	public String getToAttend()
	{
		return this.toAttend;
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

}