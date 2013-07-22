package lee;

import javax.servlet.*;
import javax.servlet.annotation.*;/**
 * Description:
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a> 
 * <br/>Copyright (C), 2001-2012, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
@WebListener
public class MyServletContextAttributeListener
	implements ServletContextAttributeListener
{
	//��������application��Χ�������ʱ�����÷���
	public void attributeAdded(ServletContextAttributeEvent event) 
	{
		ServletContext application = event.getServletContext();
		//��ȡ��ӵ�������������ֵ
		String name = event.getName();
		Object value = event.getValue();
		System.out.println(application + "��Χ���������Ϊ"
			+ name + "��ֵΪ" + value + "������!");
	}
	//�������application��Χɾ������ʱ�����÷���
	public void attributeRemoved(ServletContextAttributeEvent event)
	{
		ServletContext application = event.getServletContext();
		//��ȡ��ɾ����������������ֵ
		String name = event.getName();
		Object value = event.getValue();
		System.out.println(application + "��Χ����Ϊ"
			+ name + "��ֵΪ" + value + "�����Ա�ɾ����!");
	}
	//��application��Χ�����Ա��滻ʱ�����÷���
	public void attributeReplaced(ServletContextAttributeEvent event)
	{
		ServletContext application = event.getServletContext();
		//��ȡ���滻��������������ֵ
		String name = event.getName();
		Object value = event.getValue();
		System.out.println(application + "��Χ����Ϊ"
			+ name + "��ֵΪ" + value + "�����Ա��滻��!");
	}
}
