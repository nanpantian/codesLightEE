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
<%@ page import="java.util.*"%>
<!-- �����ǩ�⣬ָ��mytagǰ׺�ı�ǩ��
��http://www.crazyit.org/mytaglib�ı�ǩ�⴦�� -->
<%@ taglib uri="http://www.crazyit.org/mytaglib" prefix="mytag"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title> ����ǩ��ı�ǩ-��������ǩ </title>
	<meta name="website" content="http://www.crazyit.org" />
</head>
<body>
	<h2>����ǩ��ı�ǩ-��������ǩ</h2><hr/>
	<%
	//����һ��List����
	List<String> a = new ArrayList<String>();
	a.add("���Java");
	a.add("www.crazyit.org");
	a.add("java");
	//��List�������page��Χ��
	pageContext.setAttribute("a" , a);
	%>
	<table border="1" bgcolor="#aaaadd" width="300">
		<!-- ʹ�õ�������ǩ����a���Ͻ��е��� -->
		<mytag:iterator collection="a" item="item">
		<tr>
			<td>${pageScope.item}</td>
		<tr>
		</mytag:iterator>
	</table>
</body>
</html>