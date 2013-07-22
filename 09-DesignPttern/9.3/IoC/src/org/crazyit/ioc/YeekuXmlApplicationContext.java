package org.crazyit.ioc;

import java.lang.reflect.*;
import java.util.*;
import java.io.*;
import org.dom4j.*;
import org.dom4j.io.*;

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
public class YeekuXmlApplicationContext
	implements ApplicationContext
{
	//�������������е���ģʽ��Beanʵ��
	private Map<String , Object> objPool
		= Collections.synchronizedMap(new HashMap<String , Object>()); 
	//���������ļ���Ӧ��Document����
	private Document doc;
	//���������ļ���ĸ�Ԫ��
	private Element root;
	public YeekuXmlApplicationContext(String filePath)
		throws Exception
	{
		SAXReader reader = new SAXReader();
		doc = reader.read(new File(filePath));
		root = doc.getRootElement();
		initPool();
		initProp();
	}

	public Object getBean(String name)
		throws Exception
	{
		Object target = objPool.get(name);
		//����singleton Bean�������Ѿ���ʼ��������Beanʵ��
		if (target.getClass() != String.class)
		{
			return target;
		}
		else
		{
			String clazz = (String)target;
			//����prototype��δע������ֵ
			return Class.forName(clazz).newInstance();
		}
	}
	//��ʼ������������singleton Bean
	private void initPool()
		throws Exception
	{
		//���������ļ����ÿ��<bean.../>Ԫ��
		for (Object obj : root.elements())
		{
			Element beanEle = (Element)obj;
			//ȡ��<bean.../>Ԫ�ص�id����
			String beanId = beanEle.attributeValue("id");
			//ȡ��<bean.../>Ԫ�ص�class����
			String beanClazz = beanEle.attributeValue("class");
			//ȡ��<bean.../>Ԫ�ص�scope����
			String beanScope = beanEle.attributeValue("scope");
			//���<bean.../>Ԫ�ص�scope���Բ����ڣ���Ϊsingleton
			if (beanScope == null ||
				beanScope.equals("singleton"))
			{
				//��Ĭ�Ϲ���������Beanʵ�������������objPool��
				objPool.put(beanId , Class.forName(beanClazz).newInstance());
			}
			else
			{
				//���ڷ�singlton Bean����Ÿ�Beanʵ�����������
				objPool.put(beanId , beanClazz);
			}
		}
	}
	//��ʼ��������singleton Bean������
	private void initProp()
		throws Exception
	{
		//���������ļ����ÿ��<bean.../>Ԫ��
		for (Object obj : root.elements())
		{
			Element beanEle = (Element)obj;
			//ȡ��<bean.../>Ԫ�ص�id����
			String beanId = beanEle.attributeValue("id");
			//ȡ��<bean.../>Ԫ�ص�scope����
			String beanScope = beanEle.attributeValue("scope");
			//���<bean.../>Ԫ�ص�scope���Բ����ڣ���Ϊsingleton
			if (beanScope == null ||
				beanScope.equals("singleton"))
			{
				//ȡ��objPool��ָ����Beanʵ��
				Object bean = objPool.get(beanId);
				//����<bean.../>Ԫ�ص�ÿ��<property.../>��Ԫ��
				for (Object prop : beanEle.elements())
				{
					Element propEle = (Element)prop;
					//ȡ��<property.../>Ԫ�ص�name����	
					String propName = propEle.attributeValue("name");
					//ȡ��<property.../>Ԫ�ص�value����
					String propValue = propEle.attributeValue("value");
					//ȡ��<property.../>Ԫ�ص�ref����	
					String propRef = propEle.attributeValue("ref");
					//��������������ĸ��д
					String propNameCamelize = propName.substring(0 , 1).toUpperCase()
						+ propName.substring(1 , propName.length());
					//���<property.../>Ԫ�ص�value����ֵ����
					if (propValue != null && propValue.length() > 0)
					{
						//��ȡ��ֵע�������setter����
						Method setter = bean.getClass().getMethod(
							"set" + propNameCamelize , String.class);
						//ִ��setterע��
						setter.invoke(bean , propValue);
					}
					if (propRef != null && propRef.length() > 0)
					{
						//ȡ����Ҫ������ע���Beanʵ��
						Object target = objPool.get(propRef);
						//objPool���в�����ָ��Beanʵ��
						if (target == null)
						{
							//�˴���Ӧ����Singleton Bean����prototype Bean������
						}
						//������ֵע�������setter����
						Method setter = null;
						//����target��������ʵ�ֵ����нӿ�
						for (Class superInterface : target.getClass().getInterfaces())
						{
							try
							{
								//��ȡ��ֵע�������setter����
								setter = bean.getClass().getMethod(
									"set" + propNameCamelize , superInterface);
								//����ɹ�ȡ�øýӿڶ�Ӧ�ķ�����ֱ������ѭ��
								break;
							}
							catch (NoSuchMethodException ex)
							{
								//���û���ҵ���Ӧ��setter�����������´�ѭ��
								continue;
							}
						}
						//���setter������ȻΪnull��
						//��ֱ��ȡ��targetʵ�����Ӧ��setter����
						if (setter == null)
						{
							setter = bean.getClass().getMethod(
								"set" + propNameCamelize , target.getClass());
						}
						//ִ��setterע��
						setter.invoke(bean , target);
					}
				}
			}
		}
	}
}
