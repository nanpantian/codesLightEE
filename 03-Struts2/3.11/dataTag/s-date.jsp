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
	<title>ʹ��s:date��ǩ��ʽ������</title>
</head>
<body>
<s:bean var="now" name="java.util.Date"/>
nice="false"����ָ��format="dd/MM/yyyy"<br/>
<s:date name="#now" format="dd/MM/yyyy" nice="false"/><hr/>
nice="true"����ָ��format="dd/MM/yyyy"<br/>
<s:date name="#now" format="dd/MM/yyyy" nice="true"/><hr/>
ָ��nice="true"<br/>
<s:date name="#now" nice="true" /><hr/>
nice="false"����û��ָ��format����<br/>
<s:date name="#now" nice="false"/><hr/>
nice="false"��û��ָ��format���ԣ�ָ����var<br/>
<s:date name="#now" nice="false" var="abc"/><hr/>
${requestScope.abc} <s:property value="#abc"/>
</body>
</html>
