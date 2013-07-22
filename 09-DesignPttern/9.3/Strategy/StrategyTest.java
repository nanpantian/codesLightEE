

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
public class StrategyTest
{
	public static void main(String[] args) 
	{
		//�ͻ���û��ѡ����۲�����
		DiscountContext dc = new DiscountContext(null);
		double price1 = 79;
		//ʹ��Ĭ�ϵĴ��۲���
		System.out.println("79Ԫ����Ĭ�ϴ��ۺ�ļ۸��ǣ�" 
			+ dc.getDiscountPrice(price1));
		//�ͻ���ѡ����ʵ�VIP���۲���
		dc.changeDiscount(new VipDiscount());
		double price2 = 89;
		//ʹ��VIP���۵õ����ۼ۸�
		System.out.println("89Ԫ�����VIP�û��ļ۸��ǣ�" 
			+ dc.getDiscountPrice(price2));
	}
}
