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
public class Computer
{
	private Output out;
	private String name;

	public Computer(){}

	//out���Ե�setter��getter����
	public void setOut(Output out)
	{
		this.out = out;
	}
	//name���Ե�setter��getter����
	public void setName(String name)
	{
		this.name = name;
	}
	//����һ��ģ���ȡ�ַ�������ķ���
	public void keyIn(String msg)
	{
		out.getData(msg);
	}
	//����һ��ģ���ӡ�ķ���
	public void print()
	{
		System.out.println(name + "��ʼ��ӡ..."); 
		out.out();
	}
}