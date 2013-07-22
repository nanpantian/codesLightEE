package lee;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

import java.sql.*;
import java.awt.event.*;

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
public class OnlineListener 
	implements ServletContextListener
{
	//������ʱ�䣨10���ӣ�û�з��ʱ�վ����Ϊ�û��Ѿ�����
	public final int MAX_MILLIS = 10 * 60 * 1000;
	//Ӧ������ʱ�����÷���
	public void contextInitialized(ServletContextEvent sce) 
	{
		//ÿ5����һ��
		new javax.swing.Timer(1000 * 5 , new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					DbDao dd = new DbDao("com.mysql.jdbc.Driver"
						, "jdbc:mysql://localhost:3306/online_inf"
						, "root"
						, "32147");
					ResultSet rs = dd.query("select * from online_inf" , false);
					StringBuffer beRemove = new StringBuffer("(");
					while(rs.next())
					{
						//��������ϴη���ʱ�䳬����ָ��ʱ��
						if ((System.currentTimeMillis() - rs.getLong(5))
							> MAX_MILLIS)
						{
							//����Ҫ��ɾ����session ID��ӽ���
							beRemove.append("'");
							beRemove.append(rs.getString(1));
							beRemove.append("' , ");
						}
					}
					//����Ҫɾ���ļ�¼
					if (beRemove.length() > 3)
					{
						beRemove.setLength(beRemove.length() - 3);
						beRemove.append(")");
						//ɾ�����С�����ָ��ʱ��δ��������ļ�¼��
						dd.modify("delete from online_inf where session_id in "
							+ beRemove.toString());
					}
					dd.closeConn();
				}
				catch (Exception ex)
				{
					ex.printStackTrace();
				}
			}
		}).start();
	}
	public void contextDestroyed(ServletContextEvent sce) 
	{
	}
}
