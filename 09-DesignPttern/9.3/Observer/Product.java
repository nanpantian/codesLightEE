
import java.util.Iterator;
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
public class Product extends Observable
{
	//������������
	private String name;
	private double price;
	//�޲����Ĺ�����
	public Product(){}
	public Product(String name , double price)
	{
		this.name = name;
		this.price = price;
	}
	public String getName()
	{
		return name;
	}
	//���������name��setter�������޸�Product��name����ʱ
	//������Ȼ�����ö�����ע������й۲���
	public void setName(String name)
	{
		this.name = name;
		notifyObservers(name);
	}
	public double getPrice()
	{
		return price;
	}
	//���������price��setter�������޸�Product��price����ʱ
	//������Ȼ�����ö�����ע������й۲���
	public void setPrice(double price)
	{
		this.price = price;
		notifyObservers(price);
	}
}