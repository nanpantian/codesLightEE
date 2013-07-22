package lee;

import org.hibernate.Transaction;
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
		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();
//		//����Person����
//		Person wawa = new Person();
//		//ΪPerson������������
//		wawa.setAge(21);
//		wawa.setName("crazyit.org");
//		//����Set����
//		SortedSet<String> s = new TreeSet<String>();
//		s.add("Wild Java Camp");
//		s.add("Sun SCJP");
//		//����Set��������
//		wawa.setTrainings(s);
//		session.save(wawa);
		
		Person p = (Person)session.get(Person.class , 1);
		p.getTrainings().add("CCNP");
		
		tx.commit();
		HibernateUtil.closeSession();
	}
}