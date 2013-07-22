package lee;

import org.springframework.context.support.*;
import org.springframework.context.*;

import org.crazyit.app.dao.*;
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
		//����Spring����
		ApplicationContext ctx = new 
			ClassPathXmlApplicationContext("bean.xml");
		//��ȡ�������Bean
		NewsDao dao = (NewsDao)ctx
			.getBean("newsDaoTrans" , NewsDao.class);
		//ִ�в������
		dao.insert("���Java" , "������Java EE��ҵӦ��ʵս");
	}
}
