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
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title> ����Cookie </title>
	<meta name="website" content="http://www.crazyit.org" />
</head>
<body>
<%
//�Ա������ַ���Ϊֵ������һ��Cookie����
Cookie c = new Cookie("cnName" 
	, java.net.URLEncoder.encode("�����" , "gbk"));
//����Cookie�������������
c.setMaxAge(24 * 3600);
//��ͻ�������Cookie����
response.addCookie(c);

//��ȡ��վ�ڿͻ����ϱ���������Cookie
Cookie[] cookies = request.getCookies();
//�����ͻ����ϵ�ÿ��Cookie
for (Cookie cookie : cookies)
{
	//���Cookie����Ϊusername��������Cookie��������Ҫ���ʵ�Cookie
	if(cookie.getName().equals("cnName"))
	{
		//ʹ��java.util.URLDecoder��Cookieֵ���н���
		out.println(java.net.URLDecoder
			.decode(cookie.getValue()));
	}
}
%>
</body>
</html>