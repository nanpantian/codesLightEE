package lee;

import org.hibernate.Transaction;
import org.hibernate.Session;

import java.util.Date;
import java.util.Set;
import java.util.HashSet;

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
		mgr.testPerson();
		HibernateUtil.sessionFactory.close();
	}
	//����Person��Address����
	private void testPerson()
	{
		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();
		//����һ��Person����
		Person p = new Person();
		//����Person��NameΪYeeku�ַ���
		p.setName("Yeeku");
		p.setAge(29);
		session.save(p);
		//����һ��Address����
		Address a = new Address("�������");
		//����Person�����Address����
		p.setAddress(a);
		//����2��School����
		School s1 = new School("���Java��Ŀ��̰�");
		School s2 = new School("���Javaѵ��Ӫ");
		//����2��Schoolʵ��
		session.save(s1);
		session.save(s2);
		//����Address���������School�Ĺ�����ϵ
		a.getSchools().add(s1);
		a.getSchools().add(s2);
		tx.commit();
		HibernateUtil.closeSession();
	}
}
