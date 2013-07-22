package lee;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;import java.util.*;/**
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
public class OnlineListener 
	implements HttpSessionListener
{
	//���û��������֮�俪ʼsessionʱ�����÷���
	public void sessionCreated(HttpSessionEvent se) 
	{
		HttpSession session = se.getSession();
		ServletContext application = session.getServletContext();
		//��ȡsession ID
		String sessionId = session.getId();
		//�����һ���µĻỰ
		if (session.isNew())
		{
			String user = (String)session.getAttribute("user");
			//δ��¼�û����οʹ���
			user = (user == null) ? "�ο�" : user;
			Map<String , String> online = (Map<String , String>)
				application.getAttribute("online");
			if (online == null)
			{
				online = new Hashtable<String , String>();
			}
			//���û�������Ϣ����Map��
			online.put(sessionId , user);
			application.setAttribute("online" , online);
		}
	}
	//���û��������֮��session�Ͽ�ʱ�����÷���
	public void sessionDestroyed(HttpSessionEvent se)
	{
		HttpSession session = se.getSession();
		ServletContext application = session.getServletContext();
		String sessionId = session.getId();
		Map<String , String> online = (Map<String , String>)
			application.getAttribute("online");
		if (online != null)
		{
			//ɾ�����û���������Ϣ
			online.remove(sessionId);
		}
		application.setAttribute("online" , online);
	}
}
