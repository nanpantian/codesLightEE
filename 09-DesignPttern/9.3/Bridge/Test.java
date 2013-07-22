

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
public class Test
{
	public static void main(String[] args) 
	{
		//���潫�õ�����ζ����ţ����
		AbstractNoodle noodle1 = new BeefNoodle(
			new PepperySytle());
		noodle1.eat();
		//���潫�õ�����������ţ����
		AbstractNoodle noodle2 = new BeefNoodle(
			new PlainStyle());
		noodle2.eat();
		//���潫�õ�����ζ����������
		AbstractNoodle noodle3 = new PorkyNoodle(
			new PepperySytle());
		noodle3.eat();
		//���潫�õ�����������������
		AbstractNoodle noodle4 = new PorkyNoodle(
			new PlainStyle());
		noodle4.eat();
	}
}
