package org.crazyit.app.domain;

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
public class Address
{
	//�����Address����ϸ��Ϣ
	private String detail;
	//�����Address���ʱ���Ϣ
	private String zip;
	//�����Address�Ĺ�����Ϣ
	private String country;	//�޲����Ĺ�����
	public Address()
	{
	}
	//��ʼ��ȫ�����ԵĹ�����
	public Address(String detail , String zip , String country)
	{
		this.detail = detail;
		this.zip = zip;
		this.country = country;
	}
	
	//detail���Ե�setter��getter����
	public void setDetail(String detail)
	{
		this.detail = detail;
	}
	public String getDetail()
	{
		return this.detail;
	}
	
	//zip���Ե�setter��getter����
	public void setZip(String zip)
	{
		this.zip = zip;
	}
	public String getZip()
	{
		return this.zip;
	}
	
	//country���Ե�setter��getter����
	public void setCountry(String country)
	{
		this.country = country;
	}
	public String getCountry()
	{
		return this.country;
	}
}