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
	<title>ʹ��s:push����ĳ��ֵ����ValueStack��ջ��</title>
</head>
<body>
<h2>ʹ��s:push����ĳ��ֵ����ValueStack��ջ��</h2>
<!-- ʹ��bean��ǩ����һ��JavaBeanʵ����
	ָ��var���ԣ����������Stack Context�� -->
<s:bean name="org.crazyit.app.dto.Person" var="p">
	<s:param name="name" value="'yeeku'"/>
	<s:param name="age" value="29"/>
</s:bean>
<!-- ��Stack Context�е�p�������ValueStackջ��-->
<s:push value="#p">
	<!-- ���ValueStackջ�������name��age���� -->
	ValueStackջ�������name���ԣ�<s:property value="name"/><br/>
	ValueStackջ�������age���ԣ�<s:property value="age"/><br/>
</s:push>
</body>
</html>
