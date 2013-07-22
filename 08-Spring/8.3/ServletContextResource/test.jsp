<%--
��վ: <a href="http://www.crazyit.org">���Java����</a>
author  yeeku.H.lee kongyeeku@163.com
version  1.0
Copyright (C), 2001-2012, yeeku.H.Lee
This program is protected by copyright laws.
Program Name:
Date: 
--%>

<%@ page contentType="text/html; charset=GBK" language="java" errorPage="" %>
<%@ page import="org.springframework.web.context.support.ServletContextResource"%>
<%@ page import="org.dom4j.*,org.dom4j.io.*,java.util.*"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>����ServletContextResource</title>
</head>
<body>
<h3>����ServletContextResource</h3>
<%
//��Web Context�µ�WEB-INF·���¶�ȡbook.xml��Դ
ServletContextResource src = new ServletContextResource
	(application , "WEB-INF/book.xml");
//��ȡ����Դ�ļ���Ϣ
System.out.println(src.getFilename());
System.out.println(src.getDescription());
//����Dom4j�Ľ�����
SAXReader reader = new SAXReader();
Document doc = reader.read(src.getFile());
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
		out.println(eee.getText());
		out.println("<br/>");
	}
}
%>
</body>
</html>