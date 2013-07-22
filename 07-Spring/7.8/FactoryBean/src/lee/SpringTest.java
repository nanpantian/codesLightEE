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
	public static void main(String[] args)throws Exception
	{
		ApplicationContext ctx = new 
			ClassPathXmlApplicationContext("bean.xml");
		//ֱ������FactoryBeanʱ��ϵͳ�����ظ�FactoryBean�Ĳ�Ʒ
		Person p1 = ctx.getBean("chinese" , Person.class);
		System.out.println(p1.sayHello("Mary"));
		System.out.println(p1.sayGoodBye("Mary"));
		//�ٴλ�ȡ��FactoryBean�Ĳ�Ʒ
		Person p2 = ctx.getBean("chinese" , Person.class);
		System.out.println(p1 == p2);
		//�����ȡFactoryBean������Ӧ����Bean idǰ����&
		System.out.println(ctx.getBean("&chinese"));
	}
}