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
	<title>ʹ��s:doubleselect���ɼ��������б��</title>
	<s:head/>
</head>
<body>
<h3>ʹ��s:doubleselect���ɼ��������б��</h3>
<!-- ����һ�����ӵ�Map����keyΪ��ͨ�ַ�����valueΪ���� -->
<s:set name="bs" value="#{'���': {'���Java����', 
	'������Java EE��ҵӦ��ʵս','����Java EE��ҵӦ��ʵս'},
	'David': {'JavaScript: The Definitive Guide'},
	'Johnson': {'Expert One-on-One J2EE Design and Development'}}"/>
<!-- ʹ��Map���������ɼ����б�� -->
<s:form action="x">
	<s:doubleselect
		label="��ѡ����ϲ����ͼ��"
		size="3"
		name="author" list="#bs.keySet()"
		doubleList="#bs[top]" 
		doubleSize="3"
		doubleName="book"/>	
</s:form>
</body>
</html>
