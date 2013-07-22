package lee;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

import java.io.*;

/**
 * Description:
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a> 
 * <br/>Copyright (C), 2001-2012, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
//Servlet����̳�HttpServlet��
@WebServlet(name="firstServlet" 
	, urlPatterns={"/firstServlet"})
public class FirstServlet extends HttpServlet
{
	//�ͻ��˵���Ӧ������ʹ�ø÷���������Ӧ�ͻ����������͵�����
	public void service(HttpServletRequest request,
		HttpServletResponse response) 
		throws ServletException,java.io.IOException
	{
		//���ý��뷽ʽ
		request.setCharacterEncoding("GBK");
		response.setContentType("text/html;charSet=GBK");
		//��ȡname���������ֵ
		String name = request.getParameter("name");
		//��ȡgender���������ֵ
		String gender = request.getParameter("gender");
		//��ȡcolor���������ֵ
		String[] color = request.getParameterValues("color");
		//��ȡcountry���������ֵ
		String national = request.getParameter("country"); 
		//��ȡҳ�������
		PrintStream out = new PrintStream(response.getOutputStream());
		//���HTMLҳ���ǩ
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Servlet����</title>");
		out.println("</head>");
		out.println("<body>");
		//������������ֵ��name
		out.println("�������֣�" + name + "<hr/>");
		//������������ֵ��gender
		out.println("�����Ա�" + gender + "<hr/>");
		//������������ֵ��color
		out.println("��ϲ������ɫ��");
		for(String c : color)
		{
			out.println(c + " ");
		}
		out.println("<hr/>");
		out.println("��ϲ������ɫ��");
		//������������ֵ��national
		out.println("�����ԵĹ��ң�" + national + "<hr/>");
		out.println("</body>");
		out.println("</html>");
	}
}
