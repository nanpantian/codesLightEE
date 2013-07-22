package org.crazyit.app.domain;

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
public class Category
{
	private Integer id;
	private String name;
	private Date effectiveStartDate;
	private Date effectiveEndDate;
	private Set<Product> products =
		new HashSet<Product>();	//�޲����Ĺ�����
	public Category()
	{
	}
	//��ʼ��ȫ�����ԵĹ�����
	public Category(String name , 
		Date effectiveStartDate , Date effectiveEndDate)
	{
		this.name = name;
		this.effectiveStartDate = effectiveStartDate;
		this.effectiveEndDate = effectiveEndDate;
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
	
	//name���Ե�setter��getter����
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}
	
	//effectiveStartDate���Ե�setter��getter����
	public void setEffectiveStartDate(Date effectiveStartDate)
	{
		this.effectiveStartDate = effectiveStartDate;
	}
	public Date getEffectiveStartDate()
	{
		return this.effectiveStartDate;
	}
	
	//effectiveEndDate���Ե�setter��getter����
	public void setEffectiveEndDate(Date effectiveEndDate)
	{
		this.effectiveEndDate = effectiveEndDate;
	}
	public Date getEffectiveEndDate()
	{
		return this.effectiveEndDate;
	}
	
	//products���Ե�setter��getter����
	public void setProducts(Set<Product> products)
	{
		this.products = products;
	}
	public Set<Product> getProducts()
	{
		return this.products;
	}
	
	//�ж�������Ʒ�Ƿ����
	public boolean equals(Object c)
	{		
		if ( this == c )
		{
			return true;
		}
		if(c.getClass() == Category.class 
			&& c.hashCode() == hashCode())
		{
			return true;
		}
		return false;
	}
	
	//����hashCode�ķ�ʽ�����ֵ�hashCode����
	//��Ч��ʼ����hashCode �ټ���Ч�������ڵ�hashCode
	public int hashCode()
	{
		int result;
		result = name.hashCode();
		result = 29 * result + (effectiveStartDate != null ?
			effectiveStartDate.hashCode() : 0);
		result = 29 * result + (effectiveEndDate != null ? 
			effectiveEndDate.hashCode() : 0);
		return result;
	}
}