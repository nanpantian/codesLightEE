<%@ page language="java" contentType="text/html; charset=GBK"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
	<title>ת���ɹ�</title>
</head>
<body>
	<s:property value="tip"/><br/>
	<s:property value="users"/>
<!-- ����user������������������ֵΪcrazyit.org��Ԫ�ص�name����-->
�û�crazyit.org���û���Ϊ��<s:property value="users('crazyit.org').name"/><br/>
<!-- ����user������������������ֵΪcrazyit.org��Ԫ�ص�pass����-->
�û�crazyit.org������Ϊ��<s:property value="users('crazyit.org').pass"/><br/>
<!-- ����user������������������ֵΪb��Ԫ�ص�name����-->
�û�b���û���Ϊ��<s:property value="users('b').name"/><br/>
<!-- ����user������������������ֵΪb��Ԫ�ص�pass����-->
�û�b������Ϊ��<s:property value="users('b').pass"/><br/>
����Ϊ��<s:property value="birth"/><br/>
</body>
</html>
