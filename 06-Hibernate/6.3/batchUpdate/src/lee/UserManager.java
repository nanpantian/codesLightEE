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
		mgr.updateUsers();
		HibernateUtil.sessionFactory.close();
	}
private void updateUsers()throws Exception
{
	//��Session
	Session session = HibernateUtil.currentSession();
	//��ʼ����
	Transaction tx = session.beginTransaction();
	//��ѯ��User���е����м�¼
	ScrollableResults users = session.createQuery("from User")
		.setCacheMode(CacheMode.IGNORE)
		.scroll(ScrollMode.FORWARD_ONLY);
	int count=0;
	//����User���е�ȫ����¼
	while ( users.next() )
	{
		User u = (User) users.get(0);
		u.setName("���û���" + count);
		//��countΪ20�ı���ʱ��
		//�����µĽ����Session��flush�����ݿ⡣
		if ( ++count % 20 == 0 ) 
		{
			session.flush();
			session.clear();
		}
	}
	tx.commit();
	HibernateUtil.closeSession();
}
}