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
	<title>ʹ��s:append��ǩƴ����������</title>
</head>
<body>
<!-- ʹ��append��ǩ����������ƴ�ӳ��µļ��ϣ�
	�¼��ϵ�������newList���¼��Ϸ���Stack Context�� -->
<s:append var="newList">
	<s:param value="{'���Java����',
		'������Java EE��ҵӦ��ʵս',
		'����Java EE��ҵӦ��ʵս'}" />
	<s:param value="{'http://www.crazyit.org', 
		'http://blog.crazyit.org'}" />
</s:append>
<table border="1" width="260">
<!-- ʹ��iterator����newList���� -->
<s:iterator value="#newList" status="st" id="ele">
	<tr>
		<td><s:property value="#st.count"/></td>
		<td><s:property value="ele"/></td>
	</tr>
</s:iterator>
</table>
</body>
</html>
