package org.crazyit.app.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

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
public class Order
{	
	//��ʶ����
	private Integer orderId;
	//��������
	private Date orderDate;
	//�����ĵĶ�����
	private Set<OrderItem> items
		= new HashSet<OrderItem>();

	//�޲����Ĺ�����
	public Order()
	{
	}
	//��ʼ��ȫ�����ԵĹ�����
	public Order(Date orderDate)
	{
		this.orderDate = orderDate;
	}

	//orderId���Ե�setter��getter����
	public void setOrderId(Integer orderId)
	{
		this.orderId = orderId;
	}
	public Integer getOrderId()
	{
		return this.orderId;
	}

	//orderDate���Ե�setter��getter����
	public void setOrderDate(Date orderDate)
	{
		this.orderDate = orderDate;
	}
	public Date getOrderDate()
	{
		return this.orderDate;
	}

	//items���Ե�setter��getter����
	public void setItems(Set<OrderItem> items)
	{
		this.items = items;
	}
	public Set<OrderItem> getItems()
	{
		return this.items;
	}
}