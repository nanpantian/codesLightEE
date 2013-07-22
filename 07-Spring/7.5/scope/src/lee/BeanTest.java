package lee;

import org.springframework.context.*;
import org.springframework.context.support.*;

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
		//�������·���µ�beans.xml�ļ�����Spring����
		ApplicationContext ctx = new 
			ClassPathXmlApplicationContext("bean.xml");
		//�ж���������singleton�������Beanʵ���Ƿ����
		System.out.println(ctx.getBean("p1")
			== ctx.getBean("p1"));
		//�ж���������prototype�������Beanʵ���Ƿ����
		System.out.println(ctx.getBean("p2")
			== ctx.getBean("p2"));
	}
}
