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
<%@ page import="javax.naming.*,java.sql.*,javax.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>����Tomcat����Դ</title>
</head>
<body>
<%
//��ʼ��Context��ʹ��InitialContext��ʼ��Context
Context ctx=new InitialContext(); 
/*
ͨ��JNDI��������Դ����JNDIΪjava:comp/env/jdbc/dstest���ֳ���������
java:comp/env��Tomcat�̶��ģ�Tomcat�ṩ��JNDI�󶨶�����Ӹ�ǰ׺
jdbc/dstest�Ƕ�������Դʱ������Դ��
*/
DataSource ds=(DataSource)ctx.lookup("java:comp/env/jdbc/dstest");
//��ȡ���ݿ�����
Connection conn=ds.getConnection();
//��ȡStatement
Statement stmt=conn.createStatement();
//ִ�в�ѯ������ResulteSet����
ResultSet rs=stmt.executeQuery("select * from news_inf");
while(rs.next())
{
	out.println(rs.getString(1) 
		+ "\t" + rs.getString(2) + "<br/>");
}
%>
</body>
</html>