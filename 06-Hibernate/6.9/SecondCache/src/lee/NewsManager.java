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
	public static void main(String[] args)
	{
		NewsManager mgr = new NewsManager();
		mgr.secondCacheTest();
		mgr.stat();
	}
	//���Զ�������
	private void secondCacheTest()
	{
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		List names  = session.createQuery("from News news")
			.list();
		session.getTransaction().commit();
		System.out.println("----------------------");
		//�򿪵ڶ���Session
		Session sess2 = sf.getCurrentSession();
		sess2.beginTransaction();
		//������������ʵ�壬ϵͳ��ֱ�ӴӶ��������ȡ
		//��˲��ᷢ����ѯ��SQL���
		News news = (News)sess2.load(News.class , 1);
		System.out.println(news.getTitle());
		sess2.getTransaction().commit();
	}

	private void stat()
	{
		//----------ͳ�ƶ�������----------
		Map cacheEntries = sf.getStatistics()
			//�������������Ĭ����־û����������ͬ
			.getSecondLevelCacheStatistics("org.crazyit.app.domain.News")
			.getEntries();
		System.out.println(cacheEntries);
	}
}
