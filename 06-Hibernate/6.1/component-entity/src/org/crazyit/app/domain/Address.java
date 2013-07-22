package lee;

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
public class Address
{
	//��ʶ����
	private int addressId;
	//��ַ��ϸ��Ϣ
	private String addressDetail;
	//�������ð���ʵ�������
	private Person person;
	//���屣������ʵ���Set
	private Set<School> schools
		= new HashSet<School>();
	
	//�޲����Ĺ�����
	public Address()
	{
	}
	//��ʼ��addressDetail���ԵĹ�����
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
	
	//person���Ե�setter��getter����
	public void setPerson(Person person)
	{
		this.person = person;
	}
	public Person getPerson()
	{
		return this.person;
	}
	
	//schools���Ե�setter��getter����
	public void setSchools(Set<School> schools)
	{
		this.schools = schools;
	}
	public Set<School> getSchools()
	{
		return this.schools;
	}
}