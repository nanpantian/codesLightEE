

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
//NewsDaoHibernate�̳�HibernateDaoSupport��ʵ��NewsDao�ӿ�
public class NewsDaoHibernate
	extends HibernateDaoSupport implements NewsDao
{
	//��������������Ϣ
	public News getNews(Long id) 
	{
		return (News)getHibernateTemplate()
			.get(News.class, id);
	}
	//�����µ���Ϣ
	public void saveNews(News news) 
	{
		getHibernateTemplate().saveOrUpdate(news);
	}
	//��������ɾ����Ϣ
	public void removeNews(Long id)
	{
		getHibernateTemplate().delete(getNews(id));
	}
	//����ȫ������Ϣ
	public List findAll()
	{
		getHibernateTemplate().find("from News");
	}
}
