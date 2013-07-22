package lee;

import org.springframework.context.*;
import org.springframework.context.support.*;
import org.springframework.core.io.*;

import org.dom4j.io.XPPReader;
import org.dom4j.Document;
import org.dom4j.Element;

import java.util.*;

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
		//����ApplicationContext����
		ApplicationContext ctx = new 
			ClassPathXmlApplicationContext("bean.xml");
		//��ȡ��������Ϊtest��Beanʵ��
		TestBean tb = ctx.getBean("test" , TestBean.class);
		//ͨ��tbʵ������ȡResourceLoader����
		ResourceLoader rl = tb.getResourceLoader();
		//�жϳ�����ResourceLoader�������Ƿ���ͬ
		System.out.println(rl == ctx);
	}
}
