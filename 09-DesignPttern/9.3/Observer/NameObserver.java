import javax.swing.JFrame;
import javax.swing.JLabel;
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
public class NameObserver implements Observer
{
	//ʵ�ֹ۲��߱���ʵ�ֵ�update����
	public void update(Observable o , Object arg)
	{
		if (arg instanceof String )
		{
			//��Ʒ���Ƹı�ֵ��name��
			String name = (String)arg;
			//����һ��JFrame��������ʾ���۲�����״̬�ı�
			JFrame f = new JFrame("�۲���");
			JLabel l = new JLabel("���Ƹı�Ϊ��" + name);
			f.add(l);
			f.pack();
			f.setVisible(true);
			System.out.println("���ƹ۲���:" +
				o + "��Ʒ�����Ѿ��ı�Ϊ: " + name);
		}
	}
}