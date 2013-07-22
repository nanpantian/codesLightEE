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
	<script src="${pageContext.request.contextPath}/prototype-1.6.1.js" 
	type="text/javascript">
	</script>
	<script type="text/javascript">
		function gotClick()
		{
			//����ĵ�ַ
			var url = 'JSONExample.action';
			//��favorite�����ֵת��Ϊ�������
			var params = Form.serialize('form1');
			//����Ajax.Request���󣬶�Ӧ�ڷ�������
			var myAjax = new Ajax.Request(
			url,
			{
				//����ʽ��POST
				method:'post',
				//�������
				parameters:params,
				//ָ���ص�����
				onComplete: processResponse,
				//�Ƿ��첽��������
				asynchronous:true
			});
		}
		function processResponse(request)
		{
			//ʹ��JSON���󽫷�������Ӧ������JSON����
			var res = request.responseText.evalJSON();
			alert(res);
			//����JSON�����ÿ������
			for(var propName in res)
			{
				$("show").innerHTML += propName + " --> " 
					+ res[propName] + "<br/>";
			}		
		}	
	</script>
</head>
<body>
<s:form id="form1">
	<s:textfield name="field1" label="Field 1"/>
	<s:textfield name="field2" label="Field 2"/>
	<s:textfield name="field3" label="Field 3"/>
	<tr><td colspan="2">
	<input type="button" value="�ύ" onclick="gotClick();"/>
	</td></tr>
</s:form>
<div id="show">
</div>
</body>
</html>
