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
	<title>ʹ��s:generator���ɼ���</title>
</head>
<body>
<table border="1" width="240">
<!-- ʹ��generator��ǩ��ָ���ַ���������Iterator����
	��generator��ǩ�ڣ��õ���List����λ��ValueStack���� -->
<s:generator val="'���Java����
	,������Java EE��ҵӦ��ʵս,
	����Java EE��ҵӦ��ʵս'" separator=",">
<!-- û��ָ�������ĸ����ϣ�ֱ�ӵ���ValueStack���˵ļ��� -->
<s:iterator status="st">
	<tr <s:if test="#st.odd">
		style="background-color:#bbbbbb"</s:if>>
		<td><s:property/></td>
	</tr>
</s:iterator>
</s:generator>
</table>
</body>
</html>
