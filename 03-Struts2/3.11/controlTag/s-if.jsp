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
	<title>s:if��ǩ����</title>
</head>
<body>
<!-- ��Stack Context�ж���һ��age���ԣ���ֵΪ29 -->
<s:set name="age" value="29"/>
<!-- ���Stack Context�е�age���Դ���60 -->
<s:if test="#age>60">
	������
</s:if>
<!-- ���Stack Context�е�age���Դ���35 -->
<s:elseif test="#age>35">
	������
</s:elseif>
<!-- ���Stack Context�е�age���Դ���15 -->
<s:elseif test="#age>15">
	������
</s:elseif>
<s:else>
	����
</s:else>
</body>
</html>
