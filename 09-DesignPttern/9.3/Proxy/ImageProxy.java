

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
public class ImageProxy implements Image
{
	//���һ��imageʵ������Ϊ������Ķ���
	private Image image;
	//ʹ�ó���ʵ������ʼ���������
	public ImageProxy(Image image) 
	{
		this.image = image;
	}
	/**
	 * ��дImage�ӿڵ�show()����
	 * �÷������ڿ��ƶԱ��������ķ��ʣ�
	 * ��������Ҫ���𴴽���ɾ�����������
	 */
	public void show()
	{
		//ֻ�е�������Ҫ����image��show����ʱ�Ŵ������������
		if (image == null) 
		{
			image = new BigImage();
		}
		image.show();
	}
}