package lee;

import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.*;
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
 
public class FragmentTag extends SimpleTagSupport 
{
	private JspFragment fragment;
	
	//fragment���Ե�setter��getter����
	public void setFragment(JspFragment fragment)
	{
		this.fragment = fragment;
	}
	public JspFragment getFragment()
	{
		return this.fragment;
	}
	@Override
	public void doTag() throws JspException, IOException
	{
		JspWriter out = getJspContext().getOut();
		out.println("<div style='padding:10px;border:1px solid black'>");
		out.println("<h3>�����Ƕ�̬�����JSPƬ��</h3>");
		//���á������ҳ��Ƭ�Ρ�
		fragment.invoke( null );
		out.println("</div");
	}
}