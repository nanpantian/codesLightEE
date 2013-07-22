package lee;

import org.hibernate.Transaction;
import org.hibernate.Session;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
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
public class HqlQuery
{
	public static void main(String[] args)throws Exception
	{
		HqlQuery mgr = new HqlQuery();
		mgr.findByNamedQuery();
		HibernateUtil.sessionFactory.close();
	}
private void findByNamedQuery()
	throws Exception
{
	//��Hibernate��Session������
	Session sess = HibernateUtil.currentSession();
	Transaction tx = sess.beginTransaction();
	System.out.println("===ִ��������ѯ===");
	//ִ��������ѯ
	List pl = sess.getNamedQuery("myNamedQuery")
		//����HQL������������Ϊ������ֵ
		.setInteger(0 , 20)
		.list();
	//���������ѯ�õ���ÿ��Person����
	for (Iterator pit = pl.iterator() ; pit.hasNext(); )
	{
		Person p = ( Person )pit.next();
		System.out.println(p.getName());
	}
	//�ύ���񡢹ر�Session
	tx.commit();
	HibernateUtil.closeSession();
}
}
