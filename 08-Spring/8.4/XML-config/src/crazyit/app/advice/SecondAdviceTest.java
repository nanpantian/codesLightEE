package org.crazyit.app.advice;

import org.aspectj.lang.*;
import java.util.Arrays;

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
public class SecondAdviceTest
{
	//����Before��ǿ����
	public void authority(String aa)
	{
		System.out.println("Ŀ�귽���Ĳ���Ϊ��" + aa);
		System.out.println("�ٺ�Before��ǿ��ģ��ִ��Ȩ�޼��");
	}
}
