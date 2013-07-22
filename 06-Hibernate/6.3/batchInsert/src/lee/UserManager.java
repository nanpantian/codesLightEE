package lee;

import org.hibernate.Transaction;
import org.hibernate.Session;

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
	public static void main(String[] args)throws Exception
	{
		UserManager mgr = new UserManager();
		mgr.addUsers();
		HibernateUtil.sessionFactory.close();
	}
	private void addUsers()throws Exception
	{
		//��Session
		Session session = HibernateUtil.currentSession();
		//��ʼ����
		Transaction tx = session.beginTransaction();
		//ѭ��100000�Σ�����100000����¼
		for (int i = 0 ; i < 100000 ; i++ )
		{
			//����Userʵ��
			User u1 = new User();
			u1.setName("xxxxx" + i);
			u1.setAge(i);
			u1.setNationality("china");
			//��Session���𻺴�Userʵ��
			session.save(u1);
			//ÿ���ۼ�����20�ı���ʱ����Session������ˢ�����ݿ⣬
			//�����Session���档
			if (i % 20 == 0)
			{
				session.flush();
				session.clear();
			}
		}
		//�ύ����
		tx.commit();
		//�ر�����
		HibernateUtil.closeSession();
	}
}