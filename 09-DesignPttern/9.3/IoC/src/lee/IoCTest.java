
package lee;

import org.crazyit.ioc.*;
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
public class IoCTest
{
	public static void main(String[] args) 
		throws Exception
	{
		//����IoC����
		ApplicationContext ctx = 
			new YeekuXmlApplicationContext("bean.xml");
		//��IoC������ȡ��computer Bean
		Computer c = (Computer)ctx.getBean("computer");
		//����Computer����
		c.keyIn("������Java EE��ҵӦ��ʵս");
		c.keyIn("���Java����");
		c.print();
		System.out.println(ctx.getBean("now"));
	}
}
