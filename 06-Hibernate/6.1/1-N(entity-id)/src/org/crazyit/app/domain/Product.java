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
public class Product
{
	//��ʶ����
	private Integer productId;
	//��Ʒ��
	private String name;
	
	//�޲����Ĺ�����
	public Product()
	{
	}
	//��ʼ��ȫ�����ԵĹ�����
	public Product(String name)
	{
		this.name = name;
	}

	//productId���Ե�setter��getter����
	public void setProductId(Integer productId)
	{
		this.productId = productId;
	}
	public Integer getProductId()
	{
		return this.productId;
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
}