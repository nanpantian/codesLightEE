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
	<title>ʹ��s:subset��ǩ��ȡ����Ԫ��</title>
</head>
<body>
<table border="1" width="300">
<!-- ʹ��subset��ǩ��ȡĿ�꼯�ϵ�4��Ԫ�أ��ӵ�2��Ԫ�ؿ�ʼ��ȡ -->
<s:subset source="{'���Java����'
	,'������Java EE��ҵӦ��ʵս'
	,'����Java EE��ҵӦ��ʵս'
	,'���Ajax����'
	,'���XML����'}" 
	start="1" count="4">
	<!-- ʹ��iterator��ǩ������Ŀ�꼯�ϣ���Ϊû��ָ��value����ֵ��
		�ʵ���ValueStackջ���ļ��� -->
	<s:iterator status="st">
		<!-- ���ݵ�ǰ����Ԫ�ص������Ƿ�Ϊ���������Ƿ�ʹ��CSS��ʽ -->
		<tr <s:if test="#st.odd">
			style="background-color:#bbbbbb"</s:if>>
			<td><s:property/></td>
		</tr>
	</s:iterator>
</s:subset>
</table>
</body>
</html>
