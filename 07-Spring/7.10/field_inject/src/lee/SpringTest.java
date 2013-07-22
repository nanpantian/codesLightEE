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
		ApplicationContext ctx = new
			ClassPathXmlApplicationContext("bean.xml");
		//��ȡson Beanʵ��
		Son son = ctx.getBean("son" , Son.class);
		//���son��ageֵ
		System.out.println("ϵͳ��ȡson��age����ֵ��"
			+ son.getAge());
		System.out.println("ϵͳ��ȡtheAge1��ֵ��"
			+ ctx.getBean("theAge1"));
		System.out.println("ϵͳ��ȡtheAge2��ֵ��"
			+ ctx.getBean("theAge2"));
	}
}