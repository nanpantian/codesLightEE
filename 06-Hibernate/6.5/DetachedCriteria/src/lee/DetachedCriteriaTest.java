package lee;

import org.hibernate.*;
import org.hibernate.criterion.*;

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
public class DetachedCriteriaTest
{
	public static void main(String[] args)
	{
		DetachedCriteriaTest pt = new DetachedCriteriaTest();
		pt.datached();
		pt.subQuery();
		HibernateUtil.sessionFactory.close();
	}
	
	//ִ�����߲�ѯ
	private void datached()
	{
		//����һ�����߲�ѯ
		DetachedCriteria query = DetachedCriteria
			.forClass(Student.class)
			.setProjection(Property.forName("name"));
		//��Session������
		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();
		//ִ�����߲�ѯ
		List l = query.getExecutableCriteria(session)
			.list();
		//������ѯ�Ľ��
		for (Iterator it = l.iterator();it.hasNext() ; )
		{
			System.out.println(it.next());
		}
		tx.commit();
		HibernateUtil.closeSession();
	}
	//ִ���Ӳ�ѯ
	private void subQuery()
	{
		//����һ�����߲�ѯ
		DetachedCriteria subQuery = DetachedCriteria
			.forClass(Student.class)
			.setProjection(Property.forName("name"));
		//��Session������
		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();
		//ִ���Ӳ�ѯ
		List l = session.createCriteria(Student.class)
			.add( Property.forName("name").in(subQuery))
			.list();
		//������ѯ�Ľ��
		for (Iterator it = l.iterator();it.hasNext() ; )
		{
			System.out.println(it.next());
		}
		tx.commit();
		HibernateUtil.closeSession();
	}
}