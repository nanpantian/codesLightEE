package org.crazyit.app.util;

import java.util.Comparator;

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
public class MyComparator implements Comparator
{
	//��������Ԫ�ش�С�ķ���
	public int compare(Object element1, Object element2)
	{
		//����Ԫ���ַ���������������С	
		return element1.toString().length()
			- element2.toString().length();
	}
}
