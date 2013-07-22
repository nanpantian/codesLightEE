package lee;

import java.io.*;
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
		Chinese p = ctx.getBean("chinese" , Chinese.class);
		//��ӡ��Chineseʵ����õ�ApplicationContext
		System.out.println(p.getContext());
		//�Ƚ����ַ�����õ�BeanFactory
		System.out.println(ctx == p.getContext());
	}
}