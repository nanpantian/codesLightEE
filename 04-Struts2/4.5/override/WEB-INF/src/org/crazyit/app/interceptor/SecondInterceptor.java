package lee;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import java.util.*;

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
public class SecondInterceptor 
	extends AbstractInterceptor
{
	private String name;
	public void setName(String name)
	{
		this.name = name;
	}	
	
	public String intercept(ActionInvocation invocation)
		throws Exception
	{
		System.out.println(name + "�Ķ���");
		return invocation.invoke();
	}
}
