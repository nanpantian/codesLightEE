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
public interface ManagerDao
{
	/**
	 * ���ݱ�ʶ����������Managerʵ��
	 * @param id ��Ҫ���ص�Managerʵ���ı�ʶ����ֵ
	 * @return ָ����ʶ���Զ�Ӧ��Managerʵ��
	 */
	Manager get(Integer id);

	/**
	 * �־û�ָ����Managerʵ��
	 * @param manager ��Ҫ���־û���Managerʵ��
	 * @return Managerʵ�����־û���ı�ʶ����ֵ
	 */
	String save(Manager manager);

	/**
	 * �޸�ָ����Managerʵ��
	 * @param manager ��Ҫ���޸ĵ�Managerʵ��
	 */
	void update(Manager manager);

	/**
	 * ɾ��ָ����Managerʵ��
	 * @param manager ��Ҫ��ɾ����Managerʵ��
	 */
	void delete(Manager manager);

	/**
	 * ���ݱ�ʶ����ɾ��Managerʵ��
	 * @param id ��Ҫ��ɾ����Managerʵ���ı�ʶ����ֵ
	 */
	void delete(Integer id);

	/**
	 * ��ѯȫ����Managerʵ��
	 * @return ���ݿ���ȫ����Managerʵ��
	 */
	List<Manager> findAll();

	/**
	 * �����û����������ѯ����
	 * @param emp ����ָ���û���������ľ���
	 * @return ����ָ���û���������ľ���
	 */ 
	List<Manager> findByNameAndPass(Manager mgr);

	/**
	 * �����û������Ҿ���
	 * @param name ���������
	 * @return ���ֶ�Ӧ�ľ���
	 */
	Manager findByName(String name);
}
