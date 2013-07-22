package org.crazyit.hrsystem.dao.impl;

import java.util.*; 
import java.text.*; 

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
public class AttendDaoHibernate
	extends YeekuHibernateDaoSupport
	implements AttendDao
{
	/**
	 * ���ݱ�ʶ����������Attendʵ��
	 * @param id ��Ҫ���ص�Attendʵ���ı�ʶ����ֵ
	 * @return ָ����ʶ���Զ�Ӧ��Attendʵ��
	 */
	public Attend get(Integer id)
	{
		return getHibernateTemplate()
			.get(Attend.class , id);
	}

	/**
	 * �־û�ָ����Attendʵ��
	 * @param attend ��Ҫ���־û���Attendʵ��
	 * @return Attendʵ�����־û���ı�ʶ����ֵ
	 */
	public Integer save(Attend attend)
	{
		return (Integer)getHibernateTemplate()
			.save(attend);
	}

	/**
	 * �޸�ָ����Attendʵ��
	 * @param attend ��Ҫ���޸ĵ�Attendʵ��
	 */
	public void update(Attend attend)
	{
		getHibernateTemplate()
			.update(attend);
	}

	/**
	 * ɾ��ָ����Attendʵ��
	 * @param attend ��Ҫ��ɾ����Attendʵ��
	 */
	public void delete(Attend attend)
	{
		getHibernateTemplate()
			.delete(attend);
	}

	/**
	 * ���ݱ�ʶ����ɾ��Attendʵ��
	 * @param id ��Ҫ��ɾ����Attendʵ���ı�ʶ����ֵ
	 */
	public void delete(Integer id)
	{
		getHibernateTemplate()
			.delete(get(id));
	}

	/**
	 * ��ѯȫ����Attendʵ��
	 * @return ���ݿ���ȫ����Attendʵ��
	 */
	public List<Attend> findAll()
	{
		return (List<Attend>)getHibernateTemplate()
			.find("from Attend");
	}

	/**
	 * ����Ա����ѯ��Ա���Ĵ򿨼�¼
	 * @param emp Ա��
	 * @return ��Ա����ȫ�����ڼ�¼
	 */ 
	public List<Attend> findByEmp(Employee emp)
	{
		return (List<Attend>)getHibernateTemplate()
			.find("from Attend as a where a.employee=?" , emp);
	}

	/**
	 * ����Ա�������ڲ�ѯ��Ա���Ĵ򿨼�¼����
	 * @param emp Ա��
	 * @param dutyDay  ����
	 * @return ��Ա����ĳ��Ĵ򿨼�¼����
	 */
	public List<Attend> findByEmpAndDutyDay(Employee emp 
		, String dutyDay)
	{
		return (List<Attend>)getHibernateTemplate()
			.find("from Attend as a where a.employee=? and "
			+ "a.dutyDay=?" , new Object[]{emp , dutyDay});
	}

	/**
	 * ����Ա�������� �����°��ѯ��Ա���Ĵ򿨼�¼����
	 * @param emp Ա��
	 * @param dutyDay  ����
	 * @param isCome �Ƿ��ϰ�
	 * @return ��Ա����ĳ���ϰ���°�Ĵ򿨼�¼
	 */
	public Attend findByEmpAndDutyDayAndCome(Employee emp , 
		String dutyDay , boolean isCome)
	{
		List<Attend> al = findByEmpAndDutyDay(emp , dutyDay);
		if (al != null || al.size() > 1)
		{
			for (Attend attend : al)
			{
				if (attend.getIsCome() == isCome )
				{
					return attend;
				}
			}
		}
		return null;
	}

	/**
	 * �鿴Ա��ǰ����ķ�������
	 * @param emp Ա��
	 * @return ��Ա����ǰ����ķ�������
	 */
	public List<Attend> findByEmpUnAttend(Employee emp
		, AttendType type)
	{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar c = Calendar.getInstance();
		String end = sdf.format(c.getTime());
		c.add(Calendar.DAY_OF_MONTH, -3);
		String start = sdf.format(c.getTime());

		Object[] args = {emp , type , start , end};
		return (List<Attend>)getHibernateTemplate()
			.find("from Attend as a where a.employee=? and "
			+ "a.type != ? and a.dutyDay between ? and ?" , args);
	}
}
