package lee;

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
public aspect LogAspect 
{
	//����һ��PointCut������ΪlogPointcut
	//��PointCut��Ӧ��ָ��Hello�����sayHello����
	pointcut logPointcut()
		:execution(void Hello.sayHello());
	//��logPointcut֮��ִ����������
	after():logPointcut()
	{
		System.out.println("��¼��־...");
	}
}
