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
	<title>ʹ��s:bean��ǩ����JavaBean��ʵ��</title>
</head>
<body>
<!-- ʹ��bean��ǩ����һ��Person���ʵ����Ϊ��ָ����var���� -->
<s:bean name="org.crazyit.app.dto.Person" var="p">
	<!-- ʹ��param��ǩΪPerson���ʵ��������� -->
	<s:param name="name" value="'yeeku'"/>
	<s:param name="age" value="29"/>
</s:bean>
<!-- ����JavaBeanʵ��ָ����var����������JavaBeanʵ�� -->
Personʵ����nameΪ��<s:property value="#p.name"/><br/>
Personʵ����ageΪ��<s:property value="#p.age"/><br/>
${requestScope.p}
</body>
</html>
