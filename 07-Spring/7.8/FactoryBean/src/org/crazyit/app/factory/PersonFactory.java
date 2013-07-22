package org.crazyit.app.factory;

import org.springframework.beans.factory.FactoryBean;

import org.crazyit.app.service.*;
import org.crazyit.app.service.impl.*;
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
//PersonFactoryʵ��FactoryBean�ӿڣ�����Ϊ����Beanʹ��
public class PersonFactory
	implements FactoryBean<Person>
{
	Person p = null;
	//���ع���Bean�������Ĳ�Ʒ
	public Person getObject()
	{
		if (p == null)
		{
			p = new Chinese();
		}
		return p;
	}
	//��ȡ����Bean�������Ĳ�Ʒ������
	public Class<? extends Person> getObjectType()  
	{
		return Chinese.class;
	}
	//���ظù���Bean�����ɵĲ�Ʒ�Ƿ�Ϊ����
	public boolean isSingleton() 
	{
		return true;
	}
}