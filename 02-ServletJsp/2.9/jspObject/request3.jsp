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
	<title> ��ȡ��������ŷ�ַ���GET������� </title>
	<meta name="website" content="http://www.crazyit.org" />
</head>
<body>
<%
//��ȡ����������Ĳ�ѯ�ַ���
String rawQueryStr = request.getQueryString();
out.println("ԭʼ��ѯ�ַ���Ϊ��" + rawQueryStr + "<hr/>");
//ʹ��URLDecoder�����ַ���
String queryStr = java.net.URLDecoder.decode(
	rawQueryStr , "gbk");
out.println("�����Ĳ�ѯ�ַ���Ϊ��" + queryStr + "<hr/>");
//��&���ŷֽ��ѯ�ַ���
String[] paramPairs = queryStr.split("&");
for(String paramPair : paramPairs)
{
	out.println("ÿ�������������ֵ��Ϊ��" + paramPair + "<br/>");
	//��=���ֽ������������ֵ
	String[] nameValue = paramPair.split("=");
	out.println(nameValue[0] + "������ֵ�ǣ�" + 
		nameValue[1]+ "<hr/>");
}
%>
</body>
</html>