

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
//ʵ��DiscountStrategy�ӿڣ�ʵ�ֶ�VIP���۵��㷨
public class VipDiscount 
	implements DiscountStrategy
{
	//��дgetDiscount()�������ṩVIP�����㷨
	public double getDiscount(double originPrice)
	{
		System.out.println("ʹ��VIP�ۿ�...");
		return originPrice * 0.5;
	}
}
