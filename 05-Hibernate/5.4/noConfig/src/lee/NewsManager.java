package lee;

import org.hibernate.*;
import org.hibernate.cfg.*;
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
	public static void main(String[] args) throws Exception
	{
		//ʵ����Configuration���������κ������ļ�
		Configuration conf = new Configuration()
			//ͨ��addClass������ӳ־û���
			.addClass(org.crazyit.app.domain.News.class)
			//ͨ��setProperty����Hibernate���������ԡ�
			.setProperty("hibernate.connection.driver_class" , "com.mysql.jdbc.Driver")
			.setProperty("hibernate.connection.url" , "jdbc:mysql://localhost/hibernate")
			.setProperty("hibernate.connection.username" , "root")
			.setProperty("hibernate.connection.password" , "32147")
			.setProperty("hibernate.c3p0.max_size" , "20")
			.setProperty("hibernate.c3p0.min_size" , "1")
			.setProperty("hibernate.c3p0.timeout" , "5000")
			.setProperty("hibernate.c3p0.max_statements" , "100")
			.setProperty("hibernate.c3p0.idle_test_period" , "3000")
			.setProperty("hibernate.c3p0.acquire_increment" , "2")
			.setProperty("hibernate.c3p0.validate" , "true")
			.setProperty("hibernate.dialect" , "org.hibernate.dialect.MySQLInnoDBDialect")
			.setProperty("hibernate.hbm2ddl.auto" , "create");
		//��Configuration����SessionFactory
		SessionFactory sf = conf.buildSessionFactory();
		//ʵ����Session
		Session sess = sf.openSession();
		//��ʼ����
		Transaction tx = sess.beginTransaction();
		//������Ϣʵ��
		News n = new News();
		//������Ϣ�������Ϣ����
		n.setTitle("���Java���˳�����");
		n.setContent("���Java���˳����ˣ�"
			+ "��վ��ַhttp://www.crazyit.org");
		//������Ϣ
		sess.save(n);
		//�ύ����
		tx.commit();
		//�ر�Session
		sess.close();
	}
}
