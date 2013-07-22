

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
public class Facade
{
	//���屻Facade��װ����������
	Payment pay;
	Cook cook;
	Waiter waiter;
	//������
	public Facade()
	{
		this.pay = new PaymentImpl();
		this.cook = new CookImpl();
		this.waiter = new WaiterImpl();
	}
	public void serveFood()
	{
		//���ε����������ŵķ�������װ��һ��serveFood()����
		String food = pay.pay();
		food = cook.cook(food);
		waiter.serve(food);
	}
}
