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
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>ת���ɹ�</title>
</head>
<body>
	<s:property value="tip"/><br/>
��һ��Userʵ�����û���Ϊ:<s:property value="users[0].name"/><br/>
��һ��Userʵ��������Ϊ��<s:property value="users[0].pass"/><br/>
�ڶ���Userʵ�����û���Ϊ:<s:property value="users[1].name"/><br/>
�ڶ���Userʵ��������Ϊ��<s:property value="users[1].pass"/><br/>
</body>
</html>
