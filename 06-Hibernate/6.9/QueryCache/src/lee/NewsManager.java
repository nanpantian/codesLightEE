package lee;

import org.hibernate.*;
import org.hibernate.cfg.*;

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
public class NewsManager
{
	static Configuration conf = new Configuration()
		.configure();
	//��Configuration����SessionFactory
	static SessionFactory sf = conf.buildSessionFactory();
	public static void main(String[] args) throws Exception
	{
		NewsManager mgr = new NewsManager();
		mgr.cacheQuery();
		mgr.stat();
	}

	private void noCacheQuery()
	{
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		List titles  = session.createQuery("select news.title from News news")
			//��ʵ�������ã�Ĭ�Ͼ��ǹرջ���ġ�
			.setCacheable(false)
			.list();
		for(Object title : titles)
		{
			System.out.println(title);
		}
		System.out.println("-------------------------");
		//�ڶ��β�ѯ����Ϊû��ʹ�ò�ѯ���棬��˻����·���SQL�����в�ѯ
		titles  = session.createQuery("select news.title from News news")
			//��ʵ�������ã�Ĭ�Ͼ��ǹرջ���ġ�
			.setCacheable(false)
			.list();
		for(Object title : titles)
		{
			System.out.println(title);
		}
		session.getTransaction().commit();
	}

	private void cacheQuery()
	{
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		List titles  = session.createQuery("select news.title from News news")
			//������ѯ����
			.setCacheable(true)
			.list();
		for(Object title : titles)
		{
			System.out.println(title);
		}
		session.getTransaction().commit();
		System.out.println("-------------------------");
		Session sess2 = sf.getCurrentSession();
		sess2.beginTransaction();
		//�ڶ��β�ѯ��ʹ�ò�ѯ���棬��˲������·���SQL�����в�ѯ
		titles  = sess2.createQuery("select news.title from News news")
			//������ѯ����
			.setCacheable(true)
			.list();
		for(Object title : titles)
		{
			System.out.println(title);
		}
		sess2.getTransaction().commit();
	}

	//������ѯ���棬��ʹ��iterate()������ѯ
	public static void cacheQueryIterator()
	{
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		Iterator it  = session.createQuery("select news.title from News news")
			//������ѯ����
			.setCacheable(true)
			.iterate();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		session.getTransaction().commit();
		System.out.println("-------------------------");
		Session sess2 = sf.getCurrentSession();
		sess2.beginTransaction();
		//�ڶ��β�ѯ��ʹ�ò�ѯ���棬��˲������·���SQL�����в�ѯ
		it  = sess2.createQuery("select news.title from News news")
			//������ѯ����
			.setCacheable(true)
			.iterate();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		sess2.getTransaction().commit();
	}
	private void stat()
	{
		//----------ͳ�Ʋ�ѯ����----------
		long hitCount = sf.getStatistics()
			//��ѯ�����������HQL����SQL�����ͬ
			.getQueryStatistics("select news.title from News news")  
			.getCacheHitCount();
		System.out.println("��ѯ�������еĴ�����" + hitCount);
	}
}
