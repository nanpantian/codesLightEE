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
public class UserManager
{
	static Configuration cfg = new Configuration()
		//����hibernate.cfg.xml�����ļ�
		.configure();
	static SessionFactory sf = cfg.buildSessionFactory();

	public static void main(String[] args)
	{
		UserManager mgr = new UserManager();
		mgr.testUser();
		sf.close();
	}
	
	private void testUser()
	{
		Session session = sf.getCurrentSession();
		Transaction tx = session.beginTransaction();
		//����һ��User����
		User u1 = new User();
		//���û�������
		u1.setName("Yeeku.Lee");
		u1.setAge(30);
		u1.setNationality("china");
		//����һ��User����
		session.save(u1);
		//װ��һ�����е�User����
		User u = (User)session.get(User.class , 1);
		//�ı�����
		u.setName("���");
		tx.commit();
	}
}
