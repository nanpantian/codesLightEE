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
	<title>ʹ��s:action��ǩ��ҳ���е���Action</title>
</head>
<body>
������õ�һ��Action�����������������ҳ���С�<br/>
<s:action name="tag1" executeResult="true"/>
<hr/>
������õڶ���Action�����������������ҳ���С�<br/>
����ֹ��ҳ�������������Action��<br/>
<s:action name="tag2" executeResult="true"
	ignoreContextParams="true"/>
<hr/>
������õ�����Action���Ҳ����������������ҳ���С�<br/>
<s:action name="tag2" executeResult="false"/>
��ҳ���Ƿ�ɷ��ʣ�<s:property value="author"/>
</body>
</html>
