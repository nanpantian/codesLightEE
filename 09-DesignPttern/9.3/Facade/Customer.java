

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
public class Customer
{
	public void haveDinner()
	{
		//���δ�����������ʵ��
		Payment pay = new PaymentImpl();
		Cook cook = new CookImpl();
		Waiter waiter = new WaiterImpl();
		//���ε�����������ʵ���ķ�����ʵ���ò͹���
		String food = pay.pay();
		food = cook.cook(food);
		waiter.serve(food);
		//ֱ��������Facade����ʵ���òͷ���
		Facade f = new Facade();
		f.serveFood();
	}
	public static void main(String[] args)
	{
		new Customer().haveDinner();
	}
}
