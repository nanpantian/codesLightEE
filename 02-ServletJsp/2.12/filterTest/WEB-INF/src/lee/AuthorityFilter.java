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
@WebFilter(filterName="authority"
	, urlPatterns={"/*"}
	, initParams={
		@WebInitParam(name="encoding", value="GBK"),
		@WebInitParam(name="loginPage", value="/login.jsp"),
		@WebInitParam(name="proLogin", value="/proLogin.jsp")})
public class AuthorityFilter implements Filter 
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
		//��ȡ��Filter�����ò���
		String encoding = config.getInitParameter("encoding");
		String loginPage = config.getInitParameter("loginPage");
		String proLogin = config.getInitParameter("proLogin");
		//����request�����õ��ַ���
		request.setCharacterEncoding(encoding);			//��
		HttpServletRequest requ = (HttpServletRequest)request;
		HttpSession session = requ.getSession(true);
		//��ȡ�ͻ������ҳ��
		String requestPath = requ.getServletPath();
		//���session��Χ��userΪnull��������û�е�¼
		//���û�����ļȲ��ǵ�¼ҳ�棬Ҳ���Ǵ����¼��ҳ��
		if( session.getAttribute("user") == null
			&& !requestPath.endsWith(loginPage)
			&& !requestPath.endsWith(proLogin))
		{
			//forward����¼ҳ��
			request.setAttribute("tip" , "����û�е�¼");
			request.getRequestDispatcher(loginPage)
				.forward(request, response);
		}
		//"����"����
		else
		{
			chain.doFilter(request, response);
		}
	} 
}
