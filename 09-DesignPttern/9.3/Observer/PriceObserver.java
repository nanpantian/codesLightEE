
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
public class PriceObserver implements Observer
{
	//ʵ�ֹ۲��߱���ʵ�ֵ�update����
	public void update(Observable o , Object arg)
	{	
		if(arg instanceof Double)
		{
			System.out.println("�۸�۲���:" +
				o + "��Ʒ�۸��Ѿ��ı�Ϊ: " + arg);
		}
	}
}
