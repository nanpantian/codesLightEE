package org.crazyit.app.converter;

import java.util.Map;
import org.apache.struts2.util.StrutsTypeConverter;
import java.util.Set;
import java.util.HashSet;

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
	public Object convertFromString(Map context
		, String[] values, Class toClass)
	{
		Set result = new HashSet();
		for (int i = 0; i < values.length ; i++ )
		{
			//����һ��Userʵ��
			User user = new User();
			//ֻ����������������һ������Ԫ�أ�
			//�������ַ�����Ӣ�Ķ��ŷָ�������ַ���
			String[] userValues = values[i].split(",");
			//ΪUserʵ�������Ը�ֵ
			user.setName(userValues[0]);
			user.setPass(userValues[1]);
			//��Userʵ����ӵ�Set������
			result.add(user);
		}
		return result;
	}
	
	public String convertToString(Map context, Object o)
	{
		//�����ת�������������Set
		if (o.getClass() == Set.class)
		{
			Set users = (Set)o;
			String result = "[";
			for (Object obj : users )
			{
				User user = (User)obj;
				result += "<" + user.getName()
					+ "," + user.getPass() + ">";
			}
			return result + "]";
		}
		else
		{
			return "";
		}
	}
}