package lee;

import org.springframework.core.io.Resource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.crazyit.app.service.*;
import org.crazyit.app.util.*;
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
public class BeanTest
{
	public static void main(String[] args)throws Exception
	{
		//CLASSPATH·���µ�bean.xml�ļ�����Resource����
		ClassPathResource isr = new ClassPathResource("bean.xml");
		//��Resource������Ϊ����������BeanFactory��ʵ��
		XmlBeanFactory factory = new XmlBeanFactory(isr);
		//��ȡBean������ʵ��
		MyBeanPostProcessor prr = factory.getBean("beanPostProcessor"
			, MyBeanPostProcessor.class);
		//ע��BeanPostProcessorʵ��
		factory.addBeanPostProcessor(prr);
		System.out.println("�����Ѿ�ʵ����BeanFactory...");
		Person p = factory.getBean("chinese" , Person.class);
		System.out.println("�������Ѿ������chinese bean��ʵ����...");
		p.useAxe();
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
//		Person p = (Person)ctx.getBean("chinese");
//		p.useAxe();
	}
}