<%@ page contentType="text/html; charset=gb2312" language="java" %>
<%@ page import="java.util.*"%>
<%
//ȡ��session��Χ��itemMap����
Map<String,Integer> itemMap = (Map<String,Integer>)session
	.getAttribute("itemMap");
//���Map����Ϊ�գ����ʼ��Map����
if (itemMap == null)
{
	itemMap = new HashMap<String,Integer>();
	itemMap.put("�鼮" , 0);
	itemMap.put("����" , 0);
	itemMap.put("����" , 0);
}
//��ȡ�ϸ�ҳ����������
String[] buys = request.getParameterValues("item");
//��������ĸ�Ԫ��
for (String item : buys)
{
	//���itemΪbook����ʾѡ�����鼮
	if(item.equals("book"))
	{
		int num1 = itemMap.get("�鼮").intValue();
		//���鼮key��Ӧ��������1
		itemMap.put("�鼮" , num1 + 1);
	}
	//���itemΪcomputer����ʾѡ�������
	else if (item.equals("computer"))
	{
		int num2 = itemMap.get("����").intValue();
		//������key��Ӧ��������1
		itemMap.put("����" , num2 + 1);
	}
	//���itemΪcar����ʾѡ��������
	else if (item.equals("car"))
	{
		int num3 = itemMap.get("����").intValue();
		//������key��Ӧ��������1
		itemMap.put("����" , num3 + 1);
	}
}
//��itemMap����ŵ����ó�session��Χ��itemMap����
session.setAttribute("itemMap" , itemMap);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title> �������Ʒ�б� </title>
	<meta name="website" content="http://www.crazyit.org" />
</head>
<body>
�����������Ʒ��<br/>
�鼮��<%=itemMap.get("�鼮")%>��<br/>
���ԣ�<%=itemMap.get("����")%>̨<br/>
������<%=itemMap.get("����")%>��
<p><a href="shop.jsp">�ٴι���</a></p>
</body>
</html>
