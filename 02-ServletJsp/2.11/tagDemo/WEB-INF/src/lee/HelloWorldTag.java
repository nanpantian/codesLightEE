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
public class HelloWorldTag extends SimpleTagSupport
{
	//��дdoTag�������÷����ڱ�ǩ��������ҳ������
	public void doTag()throws JspException,
		IOException
	{
		//��ȡҳ���������������ַ���
		getJspContext().getOut().write("Hello World "
			+ new java.util.Date());
	}
}
