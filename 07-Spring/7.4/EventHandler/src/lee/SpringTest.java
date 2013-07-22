package lee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.crazyit.app.event.*;
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
		//����һ��ApplicationEvent����
		EmailEvent ele = new EmailEvent
			("hello","spring_test@163.com" 
				,"this is a test");
		//�������������¼�
		ctx.publishEvent(ele);
	}
}