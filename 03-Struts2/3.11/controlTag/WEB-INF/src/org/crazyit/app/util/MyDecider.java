package org.crazyit.app.util;

import org.apache.struts2.util.SubsetIteratorFilter;

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
//�û��Զ����Decider�࣬ʵ����SubsetIteratorFilter.Decider�ӿ�
public class MyDecider 
	implements SubsetIteratorFilter.Decider
{
	//ʵ��Decider�ӿڱ���ʵ�ֵ�decide������
	//�÷������������е�Ԫ���Ƿ�ѡ���Ӽ�
	public boolean decide(Object element) throws Exception
	{
		String str = (String)element;
		//�������Ԫ�أ��ַ������а���Java EE�Ӵ������ɱ�ѡ���Ӽ�
		return str.indexOf("Java EE") > 0;
	}
}