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
public interface AttendTypeDao
{
	/**
	 * ���ݱ�ʶ����������AttendTypeʵ��
	 * @param id ��Ҫ���ص�AttendTypeʵ���ı�ʶ����ֵ
	 * @return ָ����ʶ���Զ�Ӧ��AttendTypeʵ��
	 */
	AttendType get(Integer id);

	/**
	 * �־û�ָ����AttendTypeʵ��
	 * @param attendType ��Ҫ���־û���AttendTypeʵ��
	 * @return AttendTypeʵ�����־û���ı�ʶ����ֵ
	 */
	Integer save(AttendType attendType);

	/**
	 * �޸�ָ����AttendTypeʵ��
	 * @param attendType ��Ҫ���޸ĵ�AttendTypeʵ��
	 */
	void update(AttendType attendType);

	/**
	 * ɾ��ָ����AttendTypeʵ��
	 * @param attendType ��Ҫ��ɾ����AttendTypeʵ��
	 */
	void delete(AttendType attendType);

	/**
	 * ���ݱ�ʶ����ɾ��AttendTypeʵ��
	 * @param id ��Ҫ��ɾ����AttendTypeʵ���ı�ʶ����ֵ
	 */
	void delete(Integer id);

	/**
	 * ��ѯȫ����AttendTypeʵ��
	 * @return ���ݿ���ȫ����AttendTypeʵ��
	 */
	List<AttendType> findAll();
}
