package lee;

import org.springframework.core.io.ByteArrayResource;
import org.dom4j.*;
import org.dom4j.io.*;
import java.util.*;

import java.util.*;
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
public class ByteArrayResourceTest 
{
	public static void main(String[] args) throws Exception
	{
		String file = "<?xml version='1.0' encoding='GBK'?>"
			+ "<������鼮�б�><��><����>���Java����"
			+ "</����><����>���</����></��><��><����>"
			+ "������Java EE��ҵӦ��ʵս</����><����>���"
			+ "</����></��></������鼮�б�>";
		byte[] fileBytes = file.getBytes();
		//���ֽ�������Ϊ��Դ������Resource����
		ByteArrayResource bar = new ByteArrayResource(fileBytes);
		//��ȡ����Դ�ļ���Ϣ
		System.out.println(bar.getDescription());
		//����Dom4j�Ľ�����
		SAXReader reader = new SAXReader();
		Document doc = reader.read(bar.getInputStream());
		//��ȡ��Ԫ��
		Element el = doc.getRootElement();
		List l = el.elements();
		//������Ԫ�ص�ȫ����Ԫ��
		for (Iterator it = l.iterator();it.hasNext() ; )
		{
			//ÿ���ڵ㶼��<��>�ڵ�
			Element book = (Element)it.next();
			List ll = book.elements();
			//����<��>�ڵ��ȫ���ӽڵ�
			for (Iterator it2 = ll.iterator();it2.hasNext() ; )
			{
				Element eee = (Element)it2.next();
				System.out.println(eee.getText());
			}
		}
	}
}
