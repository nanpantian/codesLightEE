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
<!DOCtype html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title> �ռ������ı�ҳ </title>
	<meta name="website" content="http://www.crazyit.org" />
</head>
<body>
<form id="form1" method="post" action="request1.jsp">
�û�����<br/>
<input type="text" name="name"><hr/>
�Ա�<br/>
�У�<input type="radio" name="gender" value="��">
Ů��<input type="radio" name="gender" value="Ů"><hr/>
ϲ������ɫ��<br/>
�죺<input type="checkbox" name="color" value="��">
�̣�<input type="checkbox" name="color" value="��">
����<input type="checkbox" name="color" value="��"><hr/>
���ԵĹ��ң�<br/>
<select name="country">
	<option value="�й�">�й�</option>
	<option value="����">����</option>
	<option value="����˹">����˹</option>
</select><hr/>
<input type="submit" value="�ύ">
<input type="reset" value="����">
</form>
</body>
</html>