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
	<title> ���ʽ���� - �߼������ </title>
	<meta name="website" content="http://www.crazyit.org" />
</head>
<body>
	<h2>���ʽ���� - �߼������</h2><hr/>
	����֮��ıȽϣ�
	<table border="1" bgcolor="#aaaadd">
		<tr>
			<td><b>���ʽ����</b></td>
			<td><b>������</b></td>
		</tr>
		<!-- ֱ�ӱȽ��������� -->
		<tr>
			<td>\${1 &lt; 2}</td>
			<td>${1 < 2}</td>
		</tr>
		<!-- ʹ��lt�Ƚ������ -->
		<tr>
			<td>\${1 lt 2}</td>
			<td>${1 lt 2}</td>
		</tr>
		<!-- ʹ��>�Ƚ������ -->
		<tr>
			<td>\${1 &gt; (4/2)}</td>
			<td>${1 > (4/2)}</td>
		</tr>
		<!-- ʹ��gt�Ƚ������ -->
		<tr>
			<td>\${1 gt (4/2)}</td>
			<td>${1 gt (4/2)}</td>
		</tr>
		<!-- ʹ��>=�Ƚ������ -->
		<tr>
			<td>\${4.0 &gt= 3}</td>
			<td>${4.0 >= 3}</td>
		</tr>
		<!-- ʹ��ge�Ƚ������ -->
		<tr>
			<td>\${4.0 ge 3}</td>
			<td>${4.0 ge 3}</td>
		</tr>
		<!-- ʹ��<=�Ƚ������ -->
		<tr>
			<td>\${4 &lt;= 3}</td>
			<td>${4 <= 3}</td>
		</tr>
		<!-- ʹ��le�Ƚ������ -->
		<tr>
			<td>\${4 le 3}</td>
			<td>${4 le 3}</td>
		</tr>
		<!-- ʹ��==�Ƚ������ -->
		<tr>
			<td>\${100.0 == 100}</td>
			<td>${100.0 == 100}</td>
		</tr>
		<!-- ʹ��eq�Ƚ������ -->
		<tr>
			<td>\${100.0 eq 100}</td>
			<td>${100.0 eq 100}</td>
		</tr>
		<!-- ʹ��!=�Ƚ������ -->
		<tr>
			<td>\${(10*10) != 100}</td>
			<td>${(10*10) != 100}</td>
		</tr>
		<!--  ��ִ�����㣬�ٽ��бȽ����㣬ʹ��ne�Ƚ������-->
		<tr>
			<td>\${(10*10) ne 100}</td>
			<td>${(10*10) ne 100}</td>
		</tr>
	</table>
	�ַ�֮��ıȽϣ�
	<table border="1" bgcolor="#aaaadd">
		<tr>
			<td><b>���ʽ����</b></td>
			<td><b>������</b></td>
		</tr>
		<tr>
			<td>\${'a' &lt; 'b'}</td>
			<td>${'a' < 'b'}</td>
		</tr>
		<tr>
			<td>\${'hip' &gt; 'hit'}</td>
			<td>${'hip' > 'hit'}</td>
		</tr>
		<tr>
			<td>\${'4' &gt; 3}</td>
			<td>${'4' > 3}</td>
		</tr>
	</table>
</body>
</html>