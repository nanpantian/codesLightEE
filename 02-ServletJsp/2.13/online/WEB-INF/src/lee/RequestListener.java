package lee;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

import java.sql.*;

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
public class RequestListener
	implements ServletRequestListener
{
	//���û����󵽴����ʼ��ʱ�����÷���
	public void requestInitialized(ServletRequestEvent sre)  
	{
		HttpServletRequest request = (HttpServletRequest)
			sre.getServletRequest();
		HttpSession session = request.getSession();
		//��ȡsession ID
		String sessionId = session.getId();
		//��ȡ���ʵ�IP�����ڷ��ʵ�ҳ��
		String ip = request.getRemoteAddr(); 
		String page = request.getRequestURI();
		String user = (String)session.getAttribute("user");
		//δ��¼�û����οʹ���
		user = (user == null) ? "�ο�" : user;
		try
		{
			DbDao dd = new DbDao("com.mysql.jdbc.Driver"
				, "jdbc:mysql://localhost:3306/online_inf"
				, "root"
				, "32147");
			ResultSet rs = dd.query("select * from online_inf where session_id=?"
				, true , sessionId);
			//������û���Ӧ��session ID���ڣ������ǾɵĻỰ
			if (rs.next())
			{
				//���¼�¼
				rs.updateString(4, page);
				rs.updateLong(5, System.currentTimeMillis());
				rs.updateRow();
				rs.close();
			}
			else
			{
				//������û���������Ϣ
				dd.insert("insert into online_inf values(? , ? , ? , ? , ?)",
					sessionId , user , ip , page , System.currentTimeMillis());
			}
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}
	//���û����������������ʱ�����÷���
	public void requestDestroyed(ServletRequestEvent sre) 
	{
	}
}
