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
	<title>ʹ��s:set����һ���±���</title>
</head>
<body>
<h2>ʹ��s:set����һ���±���</h2>
<!-- ʹ��bean��ǩ����һ��JavaBeanʵ�� -->
<s:bean name="org.crazyit.app.dto.Person" id="p">
	<s:param name="name" value="'yeeku'"/>
	<s:param name="age" value="29"/>
</s:bean>
��Stack Context�е�pֵ����Ĭ�Ϸ�Χ��action���ڡ�<br/>
<s:set value="#p" name="xxx"/>
Stack Context��xxx�����name���ԣ�<s:property value="#xxx.name"/><br/>
Stack Context��xxx�����age���ԣ�<s:property value="#xxx.age"/><br/>
request��Χ��xxx�����name���ԣ�${requestScope.xxx.name}<br/>
request��Χ��xxx�����age���ԣ�${requestScope.xxx.age}<hr/>
��Stack Context�е�pֵ����application��Χ�ڡ�<br/>
<s:set value="#p" name="yyy" scope="application"/>
application��Χ��yyy�����name���ԣ�${applicationScope.yyy.name}<br/>
application��Χ��yyy�����age���ԣ�${applicationScope.yyy.age}<hr/>
��Stack Context�е�pֵ����session��Χ�ڡ�<br/>
<s:set value="#p" name="zzz" scope="session"/>
session��Χ��zzz�����name���ԣ�${sessionScope.zzz.name}<br/>
session��Χ��zzz�����age���ԣ�${sessionScope.zzz.age}
</body>
</html>
