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
<%@ page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title> request���� </title>
	<meta name="website" content="http://www.crazyit.org" />
</head>
<body>
<%
//��ȡ�����Ǯ��
String bal = request.getParameter("balance");
//��Ǯ�����ַ���ת����˫���ȸ�����
double qian = Double.parseDouble(bal);	
//��ȡ����Ǯ�����ж�
if (qian < 500)
{
	out.println("����" + qian + "��");
	out.println("�˻�����" + qian);
}
else
{
	//������һ��List����
	List<String> info = new ArrayList<String>();
	info.add("1111111");
	info.add("2222222");
	info.add("3333333");
	//��info�������request��Χ��
	request.setAttribute("info" , info);
%>
<!-- ʵ��ת�� -->
<jsp:forward page="second.jsp"/>
<%}%>
</body>
</html>