package org.crazyit.app.util;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

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
public class MyBeanFactoryPostProcessor 
	implements BeanFactoryPostProcessor
{
	/**
	 * ��д�÷�������Spring���к���
	 * @param beanFactory Spring��������
	 */
	public void postProcessBeanFactory(
		ConfigurableListableBeanFactory beanFactory)
		throws BeansException
	{
		System.out.println("�����Spring������BeanFactory�ĳ�ʼ��û�иı�...");
		System.out.println("Spring�����ǣ�" + beanFactory);
	}
}
