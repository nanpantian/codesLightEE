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
	<title>ͼ����Ϣ</title>
</head>
<body>
<table border="1" width="360">
<caption>ͼ����Ϣ</caption>
<s:iterator value="books" status="index">
	<s:if test="#index.odd == true"> 
	<tr style="background-color:#cccccc">
	</s:if> 
	<s:else> 
	<tr>
	</s:else>
	<td>����</td>
	<td><s:property/></td>
</tr>
</s:iterator>
</table>
</body>
</html>