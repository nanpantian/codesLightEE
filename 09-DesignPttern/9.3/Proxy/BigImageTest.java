

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
public class BigImageTest
{
	public static void main(String[] args) 
	{
		long start = System.currentTimeMillis();
		//���򷵻�һ��Image���󣬸ö���ֻ��BigImage�Ĵ������
		Image image = new ImageProxy(null);
		System.out.println("ϵͳ�õ�Image�����ʱ�俪��:" + 
			 (System.currentTimeMillis() - start));
		//ֻ�е�ʵ�ʵ���image�����show()����ʱ������Ż������������������
		image.show();	
	}
}
