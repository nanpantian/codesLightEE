package lee;import org.hibernate.Transaction;
import org.hibernate.Session;

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
public class PersonManager
{
	public static void main(String[] args)
	{
		PersonManager mgr = new PersonManager();
		mgr.createAndStorePerson();
		HibernateUtil.sessionFactory.close();
	}
	
	private void createAndStorePerson()
	{
		//���̰߳�ȫ��session����
		Session session = HibernateUtil.currentSession();
		//������
		Transaction tx = session.beginTransaction();
		//����Person����
		Person yeeku = new Person();
		//ΪPerson������������
		yeeku.setAge(29);
		yeeku.setName("crazyit.org");
		//����Map����
		Map<String ,Float> m = new HashMap<String ,Float>();
		m.put("����" , 67f);
		m.put("Ӣ��" , 45f);
		//����Map��������
		yeeku.setScores(m);
		session.save(yeeku);
		tx.commit();
		HibernateUtil.closeSession();
	}
}