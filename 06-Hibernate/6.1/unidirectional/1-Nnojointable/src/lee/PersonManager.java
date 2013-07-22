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

private void testPerson()
{
	Session session = HibernateUtil.currentSession();
	Transaction tx = session.beginTransaction();
	//����һ��Person����
	Person p = new Person();
	//����һ��˲̬��Address����
	Address a = new Address("�������");
	//�����ȳ־û�Address����
	session.persist(a);						  //��
	//����Person��NameΪYeeku�ַ���
	p.setName("Yeeku");
	p.setAge(29);
	//����Person��Address֮��Ĺ�����ϵ
	p.getAddresses().add(a);
	//�־û�Person����
	session.save(p);
	//����һ��˲̬��Address����
	Address a2 = new Address("�Ϻ����");
	//�ȳ־û�Address����
	session.persist(a2);						//��
	//�޸ĳ־û�״̬��Person����
	p.getAddresses().add(a2);
	tx.commit();
	HibernateUtil.closeSession();
}

}
