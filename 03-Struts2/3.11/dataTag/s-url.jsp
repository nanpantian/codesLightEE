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
	<title>ʹ��s:url������һ��URL��ַ</title>
</head>
<body>
<h2>s:url������һ��URL��ַ</h2>
ָֻ��value���Ե���ʽ��<br/>
<s:url value="editGadget.action"/>
<hr/>
ָ��action����,��ʹ��param�����������ʽ��<br/>
<s:url action="showBook">
	<s:param name="author" value="'yeeku'" />
</s:url>
<hr/>
�Ȳ�ָ��action����,Ҳ��ָ��value����,��ʹ��param�����������ʽ��<br/>
<s:url includeParams="get"  >
	<s:param name="id" value="%{'22'}"/>
</s:url>
<hr/>
ͬʱָ��action���Ժ�value����,��ʹ��param�����������ʽ��<br/>
<s:url action="showBook" value="xxxx">
	<s:param name="author" value="'yeeku'" />
</s:url>
</body>
</html>
