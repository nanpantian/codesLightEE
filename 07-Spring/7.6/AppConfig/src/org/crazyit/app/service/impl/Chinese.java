package org.crazyit.app.service.impl;

import org.crazyit.app.service.*;
import org.crazyit.app.config.*;
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
public class Chinese
	implements Person
{
	private Axe axe;
	private String name;
	//��ֵע�������setter����
	public void setAxe(Axe axe)
	{
		this.axe = axe;
	}
	//��ֵע�������setter����
	public void setName(String name)
	{
		this.name = name;
	}
	//ʵ��Person�ӿڵ�useAxe����
	public void useAxe()
	{
		//����axe��chop()������
		//����Person����������axe����
		System.out.println("���ǣ�"	+ name
			+ axe.chop());
	}
}