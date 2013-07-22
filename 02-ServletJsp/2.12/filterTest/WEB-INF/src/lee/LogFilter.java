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

@WebFilter(filterName="log"
	,urlPatterns={"/*"})
public class LogFilter implements Filter 
{
	//FilterConfig�����ڷ���Filter��������Ϣ
	private FilterConfig config;
	//ʵ�ֳ�ʼ������
	public void init(FilterConfig config)
	{
		this.config = config; 
	}
	//ʵ�����ٷ���
	public void destroy()
	{
		this.config = null; 
	}
	//ִ�й��˵ĺ��ķ���
	public void doFilter(ServletRequest request,
		ServletResponse response, FilterChain chain)
		throws IOException,ServletException
	{
		//---------����������ڶ��û�����ִ��Ԥ����---------
		//��ȡServletContext�������ڼ�¼��־
		ServletContext context = this.config.getServletContext(); 
		long before = System.currentTimeMillis();
		System.out.println("��ʼ����...");
		//������ת����HttpServletRequest����
		HttpServletRequest hrequest = (HttpServletRequest)request;
		//�����ʾ��Ϣ
		System.out.println("Filter�Ѿ��ػ��û�������ĵ�ַ�� " + 
			hrequest.getServletPath());
		//Filterֻ����ʽ����������Ȼ���е�Ŀ�ĵ�ַ
		chain.doFilter(request, response);
		//---------����������ڶԷ�������Ӧִ�к���---------
		long after = System.currentTimeMillis();
		//�����ʾ��Ϣ
		System.out.println("���˽���");
		//�����ʾ��Ϣ
		System.out.println("���󱻶�λ��" + hrequest.getRequestURI() + 
			"   ������ʱ��Ϊ: " + (after - before)); 
	} 
}