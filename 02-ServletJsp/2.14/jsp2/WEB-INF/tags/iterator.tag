<%@ tag pageEncoding="GBK" import="java.util.List"%>
<!-- �������ĸ���ǩ���� -->
<%@ attribute name="bgColor" %>
<%@ attribute name="cellColor" %>
<%@ attribute name="title" %>
<%@ attribute name="bean" %>
<table border="1" bgcolor="${bgColor}">
<tr>
	<td><b>${title}</b></td>
</tr>
<%List<String> list = (List<String>)
	request.getAttribute("a");
//�������list���ϵ�Ԫ��
for (Object ele : list){%>
	<tr>
		<td bgcolor="${cellColor}">
		<%=ele%>
		</td>
	</tr>
<%}%>
</table>