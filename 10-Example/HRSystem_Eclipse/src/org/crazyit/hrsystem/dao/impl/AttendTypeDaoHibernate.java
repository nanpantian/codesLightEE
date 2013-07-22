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
public class AttendTypeDaoHibernate
	extends YeekuHibernateDaoSupport
	implements AttendTypeDao
{
	/**
	 * ���ݱ�ʶ����������AttendTypeʵ��
	 * @param id ��Ҫ���ص�AttendTypeʵ���ı�ʶ����ֵ
	 * @return ָ����ʶ���Զ�Ӧ��AttendTypeʵ��
	 */
	public AttendType get(Integer id)
	{
		return getHibernateTemplate()
			.get(AttendType.class , id);
	}

	/**
	 * �־û�ָ����AttendTypeʵ��
	 * @param attendType ��Ҫ���־û���AttendTypeʵ��
	 * @return AttendTypeʵ�����־û���ı�ʶ����ֵ
	 */
	public Integer save(AttendType attendType)
	{
		return (Integer)getHibernateTemplate()
			.save(attendType);
	}

	/**
	 * �޸�ָ����AttendTypeʵ��
	 * @param attendType ��Ҫ���޸ĵ�AttendTypeʵ��
	 */
	public void update(AttendType attendType)
	{
		getHibernateTemplate()
			.update(attendType);
	}

	/**
	 * ɾ��ָ����AttendTypeʵ��
	 * @param attendType ��Ҫ��ɾ����AttendTypeʵ��
	 */
	public void delete(AttendType attendType)
	{
		getHibernateTemplate()
			.delete(attendType);
	}

	/**
	 * ���ݱ�ʶ����ɾ��AttendTypeʵ��
	 * @param id ��Ҫ��ɾ����AttendTypeʵ���ı�ʶ����ֵ
	 */
	public void delete(Integer id)
	{
		getHibernateTemplate()
			.delete(get(id));
	}

	/**
	 * ��ѯȫ����AttendTypeʵ��
	 * @return ���ݿ���ȫ����AttendTypeʵ��
	 */
	public List<AttendType> findAll()
	{
		return (List<AttendType>)getHibernateTemplate()
			.find("from AttendType");
	}
}
