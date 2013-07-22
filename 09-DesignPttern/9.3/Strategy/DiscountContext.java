

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
public class DiscountContext
{
	//���һ��DiscountStrategy����
	private DiscountStrategy strategy;
	//������������һ��DiscountStrategy����
	public DiscountContext(DiscountStrategy strategy)
	{
		this.strategy  = strategy;
	}
	//����ʵ����ʹ�õ�DiscountStrategy����õ��ۿۼ�
	public double getDiscountPrice(double price) 
	{
		//���strategyΪnull��ϵͳ�Զ�ѡ��OldDiscount��
		if (strategy == null)
		{
			strategy = new OldDiscount();
		}
		return this.strategy.getDiscount(price);
	}
	//�ṩ�л��㷨�ķ���
	public void changeDiscount(DiscountStrategy strategy)
	{
		this.strategy = strategy;
	}
}
 

