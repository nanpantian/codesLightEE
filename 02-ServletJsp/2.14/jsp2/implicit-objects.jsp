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
	<title> ���ʽ���� - ���ö��� </title>
	<meta name="website" content="http://www.crazyit.org" />
</head>
<body>
	<h2>���ʽ���� - ���ö���</h2>
	������������֣�
	<!-- ͨ�����ύ������� -->
	<form action="implicit-objects.jsp" method="post">
		<!-- ͨ��${param['name']} ��ȡ������� -->
		������� = <input type="text" name="name" value="${param['name']}"/>
		<input type="submit" value='�ύ'/>
	</form><br/>
	<% session.setAttribute("user" , "abc");
	//�������д������Cookie
	Cookie c = new Cookie("name" , "yeeku");
	c.setMaxAge(24 * 3600);
	response.addCookie(c);
	%>
	<table border="1" width="660" bgcolor="#aaaadd">
		<tr>
			<td width="170"><b>����</b></td>
			<td width="200"><b>���ʽ����</b></td>
			<td width="300"><b>������</b></td>
		<tr>
			<!-- ʹ�����ַ�ʽ��ȡ�������ֵ -->
			<td>ȡ���������ֵ</td>
			<td>\${param.name}</td>
			<td>${param.name}&nbsp;</td>
		</tr>
		<tr>
			<td>ȡ���������ֵ</td>
			<td>\${param["name"]}</td>
			<td>${param["name"]}&nbsp;</td>
		</tr>
		<tr>
			<!-- ʹ�����ַ�ʽ��ȡָ������ͷ��Ϣ -->
			<td>ȡ������ͷ��ֵ</td>
			<td>\${header.host}</td>
			<td>${header.host}</td>
		</tr>
		<tr>
			<td>ȡ������ͷ��ֵ</td>
			<td>\${header["accept"]}</td>
			<td>${header["accept"]}</td>
		</tr>
		<!-- ��ȡWebӦ�õĳ�ʼ������ֵ -->
		<tr>
			<td>ȡ�ó�ʼ������ֵ</td>
			<td>\${initParam["author"]}</td>
			<td>${initParam["author"]}</td>
		</tr>
		<!-- ��ȡsession���ص�����ֵ -->
		<tr>
			<td>ȡ��session������ֵ</td>
			<td>\${sessionScope["user"]}</td>
			<td>${sessionScope["user"]}</td>
		</tr>
		<!-- ��ȡָ��Cookie��ֵ -->
		<tr>
			<td>ȡ��ָ��Cookie��ֵ</td>
			<td>\${cookie["name"].value}</td>
			<td>${cookie["name"].value}</td>
		</tr>
	</table>
</body>
</html>