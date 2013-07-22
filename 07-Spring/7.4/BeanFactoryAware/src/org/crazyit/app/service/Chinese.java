package org.crazyit.app.service;

import org.springframework.context.*;
import org.springframework.beans.BeansException;
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
//����Bean�࣬ʵ��ApplicationContextAware�ӿ�
//���ཫӵ�з�������������
public class Chinese
	implements ApplicationContextAware
{
	//��BeanFactory�����Գ�Ա��������
	private ApplicationContext ctx;

	/**
	 * ʵ��ApplicationContextAware�ӿڱ���ʵ�ֵķ���
	 * @param ctx ����beanʵ����ApplicationContext
	 */
	public void setApplicationContext(ApplicationContext ctx)
		throws BeansException
	{
		this.ctx = ctx;
	}
	//���ApplicationContext�Ĳ��Է���
	public ApplicationContext getContext()
	{
		return ctx;
	}
}
