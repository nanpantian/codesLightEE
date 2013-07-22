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
	public static void main(String[] args)
		throws Exception
	{
		//ʵ����Configuration��
		Configuration conf = new Configuration()
		//���淽��Ĭ�ϼ���hibernate.cfg.xml�ļ�
			.configure();
		//��Configuration����SessionFactory
		SessionFactory sf = conf.buildSessionFactory();
		//����Session
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
		sf.close();
	}
}
