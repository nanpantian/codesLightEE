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
	<title> Java Bean���� </title>
	<meta name="website" content="http://www.crazyit.org" />
</head>
<body>
<!-- ����lee.Person��ʵ������ʵ����ʵ����Ϊp1 -->
<jsp:useBean id="p1" class="lee.Person" scope="page"/>
<!-- ����p1��name����ֵ -->
<jsp:setProperty name="p1" property="name" value="wawa"/>
<!-- ����p1��age����ֵ -->
<jsp:setProperty name="p1" property="age" value="23"/>
<!-- ���p1��name����ֵ -->
<jsp:getProperty name="p1" property="name"/><br/>
<!-- ���p1��age����ֵ -->
<jsp:getProperty name="p1" property="age"/>
</body>
</html>