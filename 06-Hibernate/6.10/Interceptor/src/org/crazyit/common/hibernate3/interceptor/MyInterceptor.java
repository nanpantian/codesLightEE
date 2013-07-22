package org.crazyit.common.hibernate3.interceptor;

import java.util.*;
import java.io.*;

import org.hibernate.*;
import org.hibernate.type.Type;

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
//ͨ�����ò��ü̳�EmptyInterceptor��ʵ��������
public class MyInterceptor extends EmptyInterceptor
{
	//��¼�޸Ĵ���
	private int updates;
	//��¼��������
	private int creates;
	
	//��ɾ��ʵ��ʱ��onDelete������������
	public void onDelete(Object entity , Serializable id , 
		Object[] state , String[] propertyNames , Type[] types)
	{
		// do nothing
	}

	//���ѳ־û�ʵ���״̬ͬ�������ݿ�ʱ��onFlushDirty����������
	public boolean onFlushDirty(Object entity , Serializable id ,
		Object[] currentState, Object[] previousState,
		String[] propertyNames, Type[] types)
	{
		//ÿͬ��һ�Σ��޸ĵ��ۼ�����1
		updates++;
		for ( int i = 0; i < propertyNames.length; i++ )
		{
			if ( "lastUpdateTimestamp".equals( propertyNames[i] ) )
			{
				currentState[i] = new Date();
				return true;
			}
		}
		return false;
	}

	//�����س־û�ʵ��ʱ��onLoad����������
	public boolean onLoad(Object entity , Serializable id ,
		Object[] state,String[] propertyNames,Type[] types)
	{
		for ( int i = 0; i < propertyNames.length ; i++ )
		{
			if ( "name".equals( propertyNames[i] ) )
			{
				//�����װ��ʵ���name����ֵ
				System.out.println( state[i] );
				return true;
			}
		}
		return false;
	}

	//����־û�ʵ��ʱ�򣬵��ø÷���
	public boolean onSave(Object entity , Serializable id ,
		Object[] state,String[] propertyNames,Type[] types)
	{
		creates++;
		for ( int i = 0; i < propertyNames.length; i++ )
		{
			if ("createTimestamp".equals( propertyNames[i]))
			{
				state[i] = new Date();
				return true;
			}
		}
		return false;
	}

	//�־û������޸�ͬ����ɺ󣬵���postFlush����
	public void postFlush(Iterator entities)
	{
		System.out.println("�����Ĵ����� " 
			+ creates + ", ���µĴ����� " + updates);
	}

	//��ͬ���־û������޸�֮ǰ������preFlush����
	public void preFlush(Iterator entities)
	{
		// do nothing
	}

	//�����ύ֮ǰ�����÷���
	public void beforeTransactionCompletion(Transaction tx) 
	{
		System.out.println("���񼴽�����");
	}

	//�����ύ֮�󴥷��÷���
	public void afterTransactionCompletion(Transaction tx) 
	{
		System.out.println("�����Ѿ�����");
	}
}