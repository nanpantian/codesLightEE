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
	<title>ʹ��s:sort�Լ���Ԫ�ؽ�������</title>
</head>
<body>
<!-- ����һ��Comparatorʵ�� -->
<s:bean var="mycomparator" name="org.crazyit.app.util.MyComparator"/>
<!-- ʹ���Զ������������Ŀ�꼯�Ͻ������� -->
<s:sort source="{'���Java����'
	,'������Java EE��ҵӦ��ʵս'
	,'����Java EE��ҵӦ��ʵս'
	,'���Ajax����'
	,'���XML����'}" 
	comparator="#mycomparator"
	var="sortedList"/>
���page��Χ��sortedList���ԣ�<br/>
${pageScope.sortedList}
<table border="1" width="300">
<!-- ����page��Χ�ڵ�sortedList���� -->
<s:iterator status="st" value="#attr.sortedList">	
	<tr <s:if test="#st.odd">
		style="background-color:#bbbbbb"</s:if>>
		<td><s:property/></td>
	</tr>
</s:iterator>
</table>
</body>
</html>
