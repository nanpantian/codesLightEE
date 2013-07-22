package lee;

import java.sql.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
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
@WebListener
public class GetConnListener implements ServletContextListener
{
	//Ӧ������ʱ���÷��������á�
	public void contextInitialized(ServletContextEvent sce)
	{
		try
		{
			//ȡ�ø�Ӧ�õ�ServletContextʵ��
			ServletContext application = sce.getServletContext();
			//�����ò����л�ȡ����
			String driver = application.getInitParameter("driver");
			//�����ò����л�ȡ���ݿ�url
			String url = application.getInitParameter("url");
			//�����ò����л�ȡ�û���
			String user = application.getInitParameter("user");
			//�����ò����л�ȡ����
			String pass = application.getInitParameter("pass");
			//ע������
			Class.forName(driver);
			//��ȡ���ݿ�����
			Connection conn = DriverManager.getConnection(url 
				, user , pass);
			//�����ݿ��������ó�application��Χ�ڵ�����
			application.setAttribute("conn" , conn);
		}
		catch (Exception ex)
		{
			System.out.println("Listener�л�ȡ���ݿ����ӳ����쳣"
				+ ex.getMessage());
		}
	}
	//Ӧ�ùر�ʱ���÷��������á�
	public void contextDestroyed(ServletContextEvent sce)
	{
		//ȡ�ø�Ӧ�õ�ServletContextʵ��
		ServletContext application = sce.getServletContext();
		Connection conn = (Connection)application.getAttribute("conn");
		//�ر����ݿ�����
		if (conn != null)
		{
			try
			{
				conn.close();
			}
			catch (SQLException ex)
			{
				ex.printStackTrace();
			}
		}
	}
}