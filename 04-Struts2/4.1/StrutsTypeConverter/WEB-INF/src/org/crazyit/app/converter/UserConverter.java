package org.crazyit.app.converter;

import java.util.Map;
import org.apache.struts2.util.*;

import org.crazyit.app.domain.*;
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
public class UserConverter extends StrutsTypeConverter 
{
	//ʵ�ֽ��ַ�������ת���ɸ������͵ķ���
	public Object convertFromString(Map context
		, String[] values , Class toClass)
	{
		//����һ��Userʵ��
		User user = new User();
		//ֻ����������������һ������Ԫ�أ�
		//�������ַ�����Ӣ�Ķ��ŷָ�������ַ���
		String[] userValues = values[0].split(",");
		//ΪUserʵ����ֵ
		user.setName(userValues[0]);
		user.setPass(userValues[1]);
		//����ת������Userʵ��
		return user;
	}
	//ʵ�ֽ���������ת�����ַ������͵ķ���
	public String convertToString(Map context, Object o)
	{
		//����Ҫת����ֵǿ������ת��ΪUserʵ��
		User user = (User) o;
		return "<" + user.getName() + ","
			+ user.getPass() + ">";
	}
}
