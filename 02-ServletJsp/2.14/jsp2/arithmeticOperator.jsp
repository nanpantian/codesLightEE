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
	<title> ���ʽ���� - ��������� </title>
	<meta name="website" content="http://www.crazyit.org" />
</head>
<body>
	<h2>���ʽ���� - ���������</h2><hr/>
	<table border="1" bgcolor="#aaaadd">
		<tr>
			<td><b>���ʽ����</b></td>
			<td><b>������</b></td>
		</tr>
		<!-- ֱ��������� -->
		<tr>
			<td>\${1}</td>
			<td>${1}</td>
		</tr>
		<!-- ����ӷ� -->
		<tr>
			<td>\${1.2 + 2.3}</td>
			<td>${1.2 + 2.3}</td>
		</tr>
		<!-- ����ӷ� -->
		<tr>
			<td>\${1.2E4 + 1.4}</td>
			<td>${1.2E4 + 1.4}</td>
		</tr>
		<!-- ������� -->
		<tr>
			<td>\${-4 - 2}</td>
			<td>${-4 - 2}</td>
		</tr>
		<!-- ����˷� -->
		<tr>
			<td>\${21 * 2}</td>
			<td>${21 * 2}</td>
		</tr>
		<!-- ������� -->
		<tr>
			<td>\${3/4}</td>
			<td>${3/4}</td>
		</tr>
		<!-- ������� -->
		<tr>
			<td>\${3 div 4}</td>
			<td>${3 div 4}</td>
		</tr>
		<!-- ������� -->
		<tr>
			<td>\${3/0}</td>
			<td>${3/0}</td>
		</tr>
		<!-- �������� -->
		<tr>
			<td>\${10%4}</td>
			<td>${10%4}</td>
		</tr>
		<!-- �������� -->
		<tr>
			<td>\${10 mod 4}</td>
			<td>${10 mod 4}</td>
		</tr>
		<!-- ������Ŀ����� -->
		<tr>
			<td>\${(1==2) ? 3 : 4}</td>
			<td>${(1==2) ? 3 : 4}</td>
		</tr>
	</table>
</body>
</html>