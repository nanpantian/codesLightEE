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
<!-- ����һ��Decider Bean -->
<s:bean var="mydecider" name="org.crazyit.app.util.MyDecider"/>
<!-- ʹ���Զ����Deciderʵ������ȡĿ�꼯�ϣ������Ӽ�
	ָ��var���ԣ������ɵ�Itertor����pageScope�� -->
<s:subset source="{'���Java����'
	,'������Java EE��ҵӦ��ʵս'
	,'����Java EE��ҵӦ��ʵս'
	,'���Ajax����'
	,'���XML����'}" 
	decider="#mydecider"
	var="newList"/>
ֱ�����page��Χ��newList���ԣ�<br/>
${pageScope.newList}
<table border="1" width="240">
<!-- ����page��Χ�ڵ�newList���� -->
<s:iterator status="st" value="#attr.newList">
	<tr <s:if test="#st.odd">
		style="background-color:#bbbbbb"</s:if>>
		<td><s:property/></td>
	</tr>
</s:iterator>
</table>
</body>
</html>
