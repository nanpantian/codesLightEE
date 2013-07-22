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
public interface PaymentDao
{
	/**
	 * ���ݱ�ʶ����������Paymentʵ��
	 * @param id ��Ҫ���ص�Paymentʵ���ı�ʶ����ֵ
	 * @return ָ����ʶ���Զ�Ӧ��Paymentʵ��
	 */
	Payment get(Integer id);

	/**
	 * �־û�ָ����Paymentʵ��
	 * @param payment ��Ҫ���־û���Paymentʵ��
	 * @return Paymentʵ�����־û���ı�ʶ����ֵ
	 */
	Integer save(Payment payment);

	/**
	 * �޸�ָ����Paymentʵ��
	 * @param payment ��Ҫ���޸ĵ�Paymentʵ��
	 */
	void update(Payment payment);

	/**
	 * ɾ��ָ����Paymentʵ��
	 * @param payment ��Ҫ��ɾ����Paymentʵ��
	 */
	void delete(Payment payment);

	/**
	 * ���ݱ�ʶ����ɾ��Paymentʵ��
	 * @param id ��Ҫ��ɾ����Paymentʵ���ı�ʶ����ֵ
	 */
	void delete(Integer id);

	/**
	 * ��ѯȫ����Paymentʵ��
	 * @return ���ݿ���ȫ����Paymentʵ��
	 */
	List<Payment> findAll();

	/**
	 * ����Ա����ѯ�½�нˮ
	 * @return ��Ա����Ӧ���½�нˮ����
	 */ 
	List<Payment> findByEmp(Employee emp);

	/**
	 * ����Ա���ͷ�н�·�����ѯ�½�нˮ
	 * @param payMonth ��н�·�
	 * @param emp ��н��Ա��
	 * @return ָ��Ա����ָ���·ݵ��½�нˮ
	 */ 
	Payment findByMonthAndEmp(String payMonth , Employee emp);
}
