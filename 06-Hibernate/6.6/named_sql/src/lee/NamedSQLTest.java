package lee;

import org.hibernate.*;
import org.hibernate.transform.*;

import java.util.*;

import org.crazyit.app.domain.*;

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
public class NamedSQLTest
{
	public static void main(String[] args)
	{
		NamedSQLTest test = new NamedSQLTest();
		test.simpleQuery();
		test.query();
		test.callProcedure();
		HibernateUtil.sessionFactory.close();
	}
	
	//ִ�м򵥵�����SQL��ѯ
	private void simpleQuery()
	{
		//��Session������
		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();
		//����������ѯ��ֱ�ӷ��ؽ��
		List l = session.getNamedQuery("simpleQuery")
			.list();
		tx.commit();
		HibernateUtil.closeSession();
		//���������
		for(Iterator it = l.iterator(); it.hasNext() ;)
		{
			//ÿ������Ԫ����Student����
			Student s = (Student)it.next();
			System.out.println(s.getName() + "\t");
		}
	}
	
	//ִ������SQL��ѯ
	private void query()
	{
		//��Session������
		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();
		//����������ѯ��ֱ�ӷ��ؽ��
		List l = session.getNamedQuery("queryTest")
			.setInteger("targetYear" , 2005)
			.list();
		tx.commit();
		HibernateUtil.closeSession();
		//���������
		for(Iterator it = l.iterator(); it.hasNext() ;)
		{
			//ÿ������Ԫ����Student��Enrolment
			//��stuName����Ԫ�ص�����
			Object[] objs = (Object[])it.next();
			Student s = (Student)objs[0];
			Enrolment e = (Enrolment)objs[1];
			String stuName = (String)objs[2];
			System.out.println(s.getName() + "\t"
				+ e.getYear() + "\t" + e.getSemester()
				+ "\t=" + e.getCourse().getName() + "=\t" + stuName);
		}
	}
	
//���ô洢����
private void callProcedure()
{
	//��Session������
	Session session = HibernateUtil.currentSession();
	Transaction tx = session.beginTransaction();
	//����������ѯ��ֱ�ӷ��ؽ��
	List l = session.getNamedQuery("callProcedure")
		.list();
	tx.commit();
	HibernateUtil.closeSession();
	//���������
	for(Iterator it = l.iterator(); it.hasNext() ;)
	{
		//ÿ������Ԫ����Student����
		Student s = (Student)it.next();
		System.out.println(s.getName());
	}
}
}
