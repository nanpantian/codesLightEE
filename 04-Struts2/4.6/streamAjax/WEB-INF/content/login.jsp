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
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>ʹ��JSON���</title>
	<script src="${pageContext.request.contextPath}/jquery-1.4.4.min.js" 
	type="text/javascript">
	</script>
</head>
<body>
<s:form id="loginForm">
	<s:textfield name="user" label="�û���"/>
	<s:textfield name="pass" label="����"/>
	<tr><td colspan="2">
	<input id="loginBn" type="button" value="�ύ"/>
	</td></tr>
</s:form>
<div id="show" style="display:none;">
</div>
<script type="text/javascript">
	//ΪidΪloginBn�İ�ť���¼�������
	$("#loginBn").click(function()
	{
		//ָ����loginPro����������idΪloginForm��������ؼ���Ϊ�������
		$.get("loginPro" , $("#loginForm").serializeArray() , 
			//ָ���ص�����
			function(data , statusText)
			{
				$("#show").height(80)
					.width(300)
					.css("border" , "1px solid black")
					.css("background-color" , "#efef99")
					.css("color" , "#ff0000")
					.css("padding" , "20px")
					.empty();
				$("#show").append("��¼�����" + data + "<br />");
				$("#show").show(2000);
			},
			//ָ����������ӦΪhtml
			"html");
	});
</script>
</body>
</html>
