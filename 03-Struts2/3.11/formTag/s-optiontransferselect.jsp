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
	<title>ʹ��s:optiontransferselect�����ɿ��ƶ��б���������б��</title>
	<s:head/>
</head>
<body>
<h3>ʹ��s:optiontransferselect�����ɿ��ƶ��б���������б��</h3>
<s:form>
<!-- ʹ�ü򵥼��϶��������ɿ��ƶ��������б�� -->
 <s:optiontransferselect 
  	label="��ѡ����ϲ����ͼ��"
	name="cnbook" 
	leftTitle="����ͼ�飺"
	rightTitle="����ͼ��"
	list="{'���Java����' ,'Struts 2Ȩ��ָ��',
		'������Java EE��ҵӦ��ʵս','����Java EE��ҵӦ��ʵս'}" 
	multiple="true"
	addToLeftLabel="�����ƶ�"
	selectAllLabel="ȫ��ѡ��"
	addAllToRightLabel="ȫ������"
	headerKey="cnKey"
	headerValue="--- ѡ������ͼ�� ---"
	emptyOption="true"
	doubleList="{'Expert One-on-One J2EE Design and Development',
		'JavaScript: The Definitive Guide'}" 
	doubleName="enBook"
	doubleHeaderKey="enKey"
	doubleHeaderValue="--- ѡ������ͼ�� ---" 
	doubleEmptyOption="true"
	doubleMultiple="true"
/>
</s:form>
</body>
</html>
