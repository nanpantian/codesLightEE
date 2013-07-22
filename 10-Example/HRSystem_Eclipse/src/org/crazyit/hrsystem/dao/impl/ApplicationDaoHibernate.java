package org.crazyit.hrsystem.dao.impl;

import java.util.*; 

import org.crazyit.hrsystem.domain.*;
import org.crazyit.common.hibernate3.support.*;
import org.crazyit.hrsystem.dao.*;

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
public class ApplicationDaoHibernate
	extends YeekuHibernateDaoSupport
	implements ApplicationDao
{
	/**
	 * ���ݱ�ʶ����������Applicationʵ��
	 * @param id ��Ҫ���ص�Applicationʵ���ı�ʶ����ֵ
	 * @return ָ����ʶ���Զ�Ӧ��Applicationʵ��
	 */
	public Application get(Integer id)
	{
		return getHibernateTemplate()
			.get(Application.class , id);
	}

	/**
	 * �־û�ָ����Applicationʵ��
	 * @param application ��Ҫ���־û���Applicationʵ��
	 * @return Applicationʵ�����־û���ı�ʶ����ֵ
	 */
	public Integer save(Application application)
	{
		return (Integer)getHibernateTemplate()
			.save(application);
	}

	/**
	 * �޸�ָ����Applicationʵ��
	 * @param application ��Ҫ���޸ĵ�Applicationʵ��
	 */
	public void update(Application application)
	{
		getHibernateTemplate()
			.update(application);
	}

	/**
	 * ɾ��ָ����Applicationʵ��
	 * @param application ��Ҫ��ɾ����Applicationʵ��
	 */
	public void delete(Application application)
	{
		getHibernateTemplate()
			.delete(application);
	}

	/**
	 * ���ݱ�ʶ����ɾ��Applicationʵ��
	 * @param id ��Ҫ��ɾ����Applicationʵ���ı�ʶ����ֵ
	 */
	public void delete(Integer id)
	{
		getHibernateTemplate()
			.delete(get(id));
	}

	/**
	 * ��ѯȫ����Applicationʵ��
	 * @return ���ݿ���ȫ����Applicationʵ��
	 */
	public List<Application> findAll()
	{
		return (List<Application>)getHibernateTemplate()
			.find("from Application");
	}

	/**
	 * ����Ա����ѯδ������춯����
	 * @param emp ��Ҫ��ѯ��Ա��
	 * @return ��Ա����Ӧ��δ������춯����
	 */ 
	public List<Application> findByEmp(Employee emp)
	{
		return (List<Application>)getHibernateTemplate()
			.find("from Application as a where "
			+ "a.attend.employee=?" , emp);
	}
}
