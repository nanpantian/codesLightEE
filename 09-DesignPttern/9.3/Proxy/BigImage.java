

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

//ʹ�ø�BigImageģ��һ���ܴ�ͼƬ
public class BigImage implements Image
{
	public BigImage()
	{
		try
		{
			//������ͣ3sģʽģ��ϵͳ����
			Thread.sleep(3000);
			System.out.println("ͼƬװ�سɹ�...");
		}
		catch (InterruptedException ex)
		{
			ex.printStackTrace();
		}
	}
	//ʵ��Image���show()����
	public void show()
	{
		System.out.println("����ʵ�ʵĴ�ͼƬ");
	}
}