package org.crazyit.app.service.impl;

import org.crazyit.app.service.*;
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
public abstract class Chinese
	implements Person
{
	public Chinese()
	{
		System.out.println("Springʵ��������bean��Chineseʵ��...");
	}

	//����һ�����󷽷����÷�������Spring����ʵ��
	public abstract Axe getAxe();
	public void useAxe()
	{
		System.out.println("����ʹ�� " + getAxe()
			+ "����");
		System.out.println(getAxe().chop());
	}
}