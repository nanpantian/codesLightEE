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
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title> pageContext���� </title>
	<meta name="website" content="http://www.crazyit.org" />
</head>
<body>
<%
//ʹ��pageContext�������ԣ�������Ĭ����page��Χ��
pageContext.setAttribute("page","hello");
//ʹ��request�������ԣ�������Ĭ����request��Χ��
request.setAttribute("request","hello");
//ʹ��pageContext������������request��Χ��
pageContext.setAttribute("request2","hello" 
	, pageContext.REQUEST_SCOPE);
//ʹ��session������������session��Χ��
session.setAttribute("session","hello");
//ʹ��pageContext������������session��Χ��
pageContext.setAttribute("session2","hello" 
	, pageContext.SESSION_SCOPE);
//ʹ��application������������application��Χ��
application.setAttribute("app","hello");
//ʹ��pageContext������������application��Χ��
pageContext.setAttribute("app2","hello" 
	, pageContext.APPLICATION_SCOPE);
//�����ȡ���������ڵķ�Χ��
out.println("page�������ڷ�Χ��" + 
	pageContext.getAttributesScope("page") + "<br/>");
out.println("request�������ڷ�Χ��" +
	pageContext.getAttributesScope("request") + "<br/>");
out.println("request2�������ڷ�Χ��"+
	pageContext.getAttributesScope("request2") + "<br/>");
out.println("session�������ڷ�Χ��" +
	pageContext.getAttributesScope("session") + "<br/>");
out.println("session2�������ڷ�Χ��" +
	pageContext.getAttributesScope("session2") + "<br/>");
out.println("app�������ڷ�Χ��" +
	pageContext.getAttributesScope("app") + "<br/>");
out.println("app2�������ڷ�Χ��" + 
	pageContext.getAttributesScope("app2") + "<br/>");
%>
</body>
</html>