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
<%@ taglib prefix="crazyit" uri="http://www.crazyit.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title> new document </title>
	<meta name="website" content="http://www.crazyit.org" />
</head>
<body>
	<h2>���ʽ���� - �Զ��庯��</h2><hr/>
	������һ���ַ�����
	<form action="useFunctions.jsp" method="post">
		�ַ��� = <input type="text" name="name" value="${param['name']}">
		<input type="submit"  value="�ύ">
	</form>
	<table border="1" bgcolor="aaaadd">
		<tr>
		<td><b>���ʽ����</b></td>
		<td><b>������</b></td>
		<tr>
		<tr>
			<td>\${param["name"]}</td>
			<td>${param["name"]}&nbsp;</td>
		</tr>
		<!--  ʹ��reverse����-->
		<tr>
			<td>\${crazyit:reverse(param["name"])}</td>
			<td>${crazyit:reverse(param["name"])}&nbsp;</td>
		</tr>
		<tr>
			<td>\${crazyit:reverse(crazyit:reverse(param["name"]))}</td>
			<td>${crazyit:reverse(crazyit:reverse(param["name"]))}&nbsp;</td>
		</tr>
		<!-- ʹ��countChar���� -->
		<tr>
			<td>\${crazyit:countChar(param["name"])}</td>
			<td>${crazyit:countChar(param["name"])}&nbsp;</td>
		</tr>
	</table>
</body>
</html>