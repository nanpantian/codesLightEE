package lee;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import java.util.*;

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
public class TestJob
	implements Job
{
	//�ж���ҵ�Ƿ�ִ�е����
	private boolean isRunning = false;
	public void execute(JobExecutionContext context) 
		throws JobExecutionException
	{
		//�����ҵû�б�����
		if (!isRunning)
		{
			System.out.println(new Date() + "  ��ҵ�����ȡ�");
			//ѭ��100����ģ�������ִ��
			for (int i = 0; i < 100 ; i++)
			{
				System.out.println("��ҵ���" + (i + 1) + "%");
				try
				{
					Thread.sleep(100);
				}
				catch (InterruptedException ex)
				{
					ex.printStackTrace();
				}
			}
			System.out.println(new Date() + "  ��ҵ���Ƚ�����");
		}
		//�����ҵ�������У���ʹ��õ��ȣ�Ҳ�����˳�
		else
		{
			System.out.println(new Date() + "�����˳�");
		}
	}
}
