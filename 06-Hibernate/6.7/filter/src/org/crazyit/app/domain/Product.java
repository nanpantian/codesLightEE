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

public class Product

{

	//�����ʶ����
	private Integer id;

	//�����Ʒ��
	
	private String name;

	//�����Ʊ�����ԣ������Կɱ�ʶ�ò�Ʒ
	
	private int stockNumber;

	//������Ч��ʱ��
	
	private Date effectiveStartDate;
	
	//����ʧЧʱ��
	
	private Date effectiveEndDate;

	//����ò�Ʒ����������
	
	private Set<Category> categories =
		new HashSet<Category>();

	//�޲����Ĺ�����
	public Product()
	{
	}
	//��ʼ��ȫ�����ԵĹ�����
	public Product(String name , int stockNumber ,
		Date effectiveStartDate, Date effectiveEndDate)
	{
		this.name = name;
		this.stockNumber = stockNumber;
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
	
	//stockNumber���Ե�setter��getter����
	public void setStockNumber(int stockNumber)
	{
		this.stockNumber = stockNumber;
	}
	public int getStockNumber()
	{
		return this.stockNumber;
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
	
	//categories���Ե�setter��getter����
	public void setCategories(Set<Category> categories)
	{
		this.categories = categories;
	}
	public Set<Category> getCategories()
	{
		return this.categories;
	}	public boolean equals(Object obj)
	{
		if (this == obj)
		{
			return true;
		}
		if (obj != null 
			&& obj.getClass() == Product.class)
		{
			Product target = (Product)obj;
			if (target.getStockNumber() == stockNumber)
			{
				return true;
			}
		}
		return false;
	}
	
	//����stockNumber������hashCode����
	public int hashCode()
	{
		return stockNumber;
	}
	
	//Ϊ��Ʒ���һ����������
	public void addCategory(Category category)
	{
		if ( category == null )
		{
			return;
		}
		categories.add(category);
		category.getProducts().add(this);
	}
}