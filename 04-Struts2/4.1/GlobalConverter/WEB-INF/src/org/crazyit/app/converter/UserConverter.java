package org.crazyit.app.converter;

import java.util.Map;
import ognl.DefaultTypeConverter;

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
public class UserConverter extends DefaultTypeConverter 
{
	//����ת����������дconvertValue�������÷�����Ҫ���˫��ת��
	public Object convertValue(Map context
		, Object value, Class toType)
	{
		//����Ҫ���ַ�����User����ת��ʱ
		if (toType == User.class )
		{
			//ϵͳ�����������һ���ַ�������
			String[] params = (String[])value;
			//����һ��Userʵ��
			User user = new User();
			//ֻ����������������һ������Ԫ�أ�
			//�������ַ�����Ӣ�Ķ��ŷָ�������ַ���
			String[] userValues = params[0].split(",");
			//ΪUserʵ����ֵ
			user.setName(userValues[0]);
			user.setPass(userValues[1]);
			//����ת������Userʵ��
			return user;
		}
		else if (toType == String.class )
		{
			//����Ҫת����ֵǿ������ת��ΪUserʵ��
			User user = (User) value;
			return "<" + user.getName() + ","
				+ user.getPass() + ">";
		} 
		return null ;
	} 
}