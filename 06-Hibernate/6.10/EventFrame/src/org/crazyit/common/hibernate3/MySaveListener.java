package org.crazyit.common.hibernate3;

import java.io.Serializable;

import org.hibernate.event.def.DefaultSaveEventListener;
import org.hibernate.HibernateException;
import org.hibernate.event.SaveOrUpdateEvent;
import org.hibernate.event.LoadEventListener;

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
//Hibernate��Ĭ���¼��������඼��������non-final���ˡ�
public class MySaveListener extends DefaultSaveEventListener
{
	protected Serializable performSaveOrUpdate(SaveOrUpdateEvent event)
	{
		System.out.println("�Զ����save�¼�");
		System.out.println(event.getObject());
		return super.performSaveOrUpdate(event);
	}
}