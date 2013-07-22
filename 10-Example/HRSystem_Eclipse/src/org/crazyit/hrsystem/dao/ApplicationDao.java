package org.crazyit.hrsystem.dao;

import java.util.*; 

import org.crazyit.hrsystem.domain.*;

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
public interface ApplicationDao
{
	/**
	 * ���ݱ�ʶ����������Applicationʵ��
	 * @param id ��Ҫ���ص�Applicationʵ���ı�ʶ����ֵ
	 * @return ָ����ʶ���Զ�Ӧ��Applicationʵ��
	 */
	Application get(Integer id);

	/**
	 * �־û�ָ����Applicationʵ��
	 * @param application ��Ҫ���־û���Applicationʵ��
	 * @return Applicationʵ�����־û���ı�ʶ����ֵ
	 */
	Integer save(Application application);

	/**
	 * �޸�ָ����Applicationʵ��
	 * @param application ��Ҫ���޸ĵ�Applicationʵ��
	 */
	void update(Application application);

	/**
	 * ɾ��ָ����Applicationʵ��
	 * @param application ��Ҫ��ɾ����Applicationʵ��
	 */
	void delete(Application application);

	/**
	 * ���ݱ�ʶ����ɾ��Applicationʵ��
	 * @param id ��Ҫ��ɾ����Applicationʵ���ı�ʶ����ֵ
	 */
	void delete(Integer id);

	/**
	 * ��ѯȫ����Applicationʵ��
	 * @return ���ݿ���ȫ����Applicationʵ��
	 */
	List<Application> findAll();

	/**
	 * ����Ա����ѯδ������춯����
	 * @param emp ��Ҫ��ѯ��Ա��
	 * @return ��Ա����Ӧ��δ������춯����
	 */ 
	List<Application> findByEmp(Employee emp);
}
