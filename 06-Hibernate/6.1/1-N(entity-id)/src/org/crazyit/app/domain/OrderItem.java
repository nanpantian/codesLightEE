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
public class OrderItem 
	implements java.io.Serializable
{
	//����3�����Խ���Ϊ��������
	//���������Orderʵ��
	private Order order;
	//���������Productʵ��
	private Product product;
	//�ö�������Ĳ�Ʒ����
	private int count;

	//�޲����Ĺ�����
	public OrderItem()
	{
	}
	//��ʼ��ȫ�����ԵĹ�����
	public OrderItem(Order order , Product product , int count)
	{
		this.order = order;
		this.product = product;
		this.count = count;
	}

	//order���Ե�setter��getter����
	public void setOrder(Order order)
	{
		this.order = order;
	}
	public Order getOrder()
	{
		return this.order;
	}

	//product���Ե�setter��getter����
	public void setProduct(Product product)
	{
		this.product = product;
	}
	public Product getProduct()
	{
		return this.product;
	}

	//count���Ե�setter��getter����
	public void setCount(int count)
	{
		this.count = count;
	}
	public int getCount()
	{
		return this.count;
	}

}