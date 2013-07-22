package org.crazyit.app.domain;

import java.util.Set;
import java.util.HashSet;
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
	//��ʶ����
	private int addressId;
	//��ַ��ϸ��Ϣ
	private String addressDetail;
	//��¼����ʵ���person����
	private Set<Person> persons
		= new HashSet<Person>();

	//�޲����Ĺ�����
	public Address()
	{
	}
	//��ʼ��ȫ�����ԵĹ�����
	public Address(String addressDetail)
	{
		this.addressDetail = addressDetail;
	}

	//addressId���Ե�setter��getter����
	public void setAddressId(int addressId)
	{
		this.addressId = addressId;
	}
	public int getAddressId()
	{
		return this.addressId;
	}

	//addressDetail���Ե�setter��getter����
	public void setAddressDetail(String addressDetail)
	{
		this.addressDetail = addressDetail;
	}
	public String getAddressDetail()
	{
		return this.addressDetail;
	}

	//persons���Ե�setter��getter����
	public void setPersons(Set<Person> persons)
	{
		this.persons = persons;
	}
	public Set<Person> getPersons()
	{
		return this.persons;
	}
}