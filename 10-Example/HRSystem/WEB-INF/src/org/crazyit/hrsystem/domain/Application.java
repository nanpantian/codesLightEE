package org.crazyit.hrsystem.domain;

import java.io.Serializable;
import java.sql.Date;

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
public class Application
	implements Serializable
{
	private static final long serialVersionUID = 48L;
	//�����ʶ����
	private Integer id;
	//��������
	private String reason;
	//�Ƿ���
	private boolean result;
	//�����ĳ���
	private Attend attend;
	//ϣ����ָ�����ڸ�Ϊ��type����
	private AttendType type;
	//����Ľ��
	private CheckBack check;
	
	//�޲����Ĺ�����
	public Application()
	{
	}
	//��ʼ��ȫ�����ԵĹ�����
	public Application(Integer id , String reason , 
		boolean result , Attend attend , 
		AttendType type , CheckBack check)
	{
		this.id = id;
		this.reason = reason;
		this.result = result;
		this.attend = attend;
		this.type = type;
		this.check = check;
	}

	//id���Ե�setter��getter����
	public void setId(Integer id)
	{
		this.id = id;
	}
	public Integer getId()
	{
		return this.id;
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

	//result���Ե�setter��getter����
	public void setResult(boolean result)
	{
		this.result = result;
	}
	public boolean getResult()
	{
		return this.result;
	}

	//attend���Ե�setter��getter����
	public void setAttend(Attend attend)
	{
		this.attend = attend;
	}
	public Attend getAttend()
	{
		return this.attend;
	}

	//type���Ե�setter��getter����
	public void setType(AttendType type)
	{
		this.type = type;
	}
	public AttendType getType()
	{
		return this.type;
	}

	//check���Ե�setter��getter����
	public void setCheck(CheckBack check)
	{
		this.check = check;
	}
	public CheckBack getCheck()
	{
		return this.check;
	}

}