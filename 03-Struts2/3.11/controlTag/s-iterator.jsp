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
	<title>s:itertor��ǩ����</title>
</head>
<body>
<table border="1" width="300">
<!-- �������List���� -->
<s:iterator value="{'���Java����',
	'������Java EE��ҵӦ��ʵս',
	'����Java EE��ҵӦ��ʵս'}"
	id="name" status="st">
	<tr <s:if test="#st.odd">
		style="background-color:#bbbbbb"</s:if>>
		<td><s:property value="name"/></td>
	</tr>
</s:iterator>
</table>
<table border="1" width="350">
	<tr>
		<th>����</th>
		<th>����</th>
	</tr>
<!-- ��ָ����Map������е������,��ָ��status���� -->
<s:iterator value="#{'���Java����':'���',
	'������Java EE��ҵӦ��ʵս':'���' ,
	'����Java EE��ҵӦ��ʵս':'���'}"
	id="score" status="st">
	<!-- ���ݵ�ǰ������Ԫ�ص������Ƿ�Ϊ�����������Ƿ�ʹ�ñ���ɫ -->
	<tr <s:if test="#st.odd">
		style="background-color:#bbbbbb"</s:if>>
		<!-- ���Map������Entry��key -->
		<td><s:property value="key"/></td>
		<!-- ���Map������Entry��value -->
		<td><s:property value="value"/></td>
	</tr>
</s:iterator>
</table>
</body>
</html>
