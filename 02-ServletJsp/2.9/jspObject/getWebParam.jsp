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
<%@ page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>application����</title>
	<meta name="website" content="http://www.crazyit.org" />
</head>
<body>
<%
//�����ò����л�ȡ����
String driver = application.getInitParameter("driver");
//�����ò����л�ȡ���ݿ�url
String url = application.getInitParameter("url");
//�����ò����л�ȡ�û���
String user = application.getInitParameter("user");
//�����ò����л�ȡ����
String pass = application.getInitParameter("pass");
//ע������
Class.forName(driver);
//��ȡ���ݿ�����
Connection conn = DriverManager.getConnection(url,user,pass);
//����Statement����
Statement stmt = conn.createStatement();
//ִ�в�ѯ
ResultSet rs = stmt.executeQuery("select * from news_inf");
%>
<table bgcolor="#9999dd" border="1" width="480">
<%
//���������
while(rs.next())
{
%>
	<tr>
		<td><%=rs.getString(1)%></td>
		<td><%=rs.getString(2)%></td>
	</tr>
<%
}
%>
<table>
</body>
</html>