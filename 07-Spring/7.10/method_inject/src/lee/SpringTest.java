package lee;

import org.springframework.context.*;
import org.springframework.context.support.*;

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
public class SpringTest
{
	public static void main(String[] args)
	{
		ApplicationContext ctx =
				new ClassPathXmlApplicationContext("bean.xml");
		//��ȡson1 Beanʵ��
		Son son1 = ctx.getBean("son1" , Son.class);
		//���son1��ageֵ
		System.out.println("ϵͳ��ȡson1��age����ֵ��"
			+ son1.getAge());
		//��ȡson2 Beanʵ��
		Son son2 = ctx.getBean("son2" , Son.class);
		//���son2��ageֵ
		System.out.println("ϵͳ��ȡson2��age����ֵ��"
			+ son2.getAge());
		System.out.println("ϵͳ��ȡJava�汾��" + ctx.getBean("javaVersion"));
	}
}