package lee;

import org.quartz.Scheduler;
import org.quartz.Trigger;
import org.quartz.impl.StdSchedulerFactory;
import org.quartz.JobDetail;
import org.quartz.SchedulerException;
import org.quartz.SimpleTrigger;

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
public class MyQuartzServer
{
	public static void main(String[] args)
	{
		MyQuartzServer server = new MyQuartzServer();
		try
		{
			server.startScheduler();
		}
		catch (SchedulerException ex)
		{
			ex.printStackTrace();
		}
	}
	//ִ�е���
	private void startScheduler() throws SchedulerException 
	{
		//ʹ�ù�������������ʵ��
		Scheduler scheduler = StdSchedulerFactory
			.getDefaultScheduler(); 
		//����ҵ����JobDetailʵ��
		JobDetail jobDetail = new JobDetail("dd", 
			Scheduler.DEFAULT_GROUP , TestJob.class);
		//����trigger������һ���򵥵ĵ�����
		//ָ���������ظ�����50�Σ�ÿ�μ��2��
		Trigger trigger = new SimpleTrigger("dd" , 
			Scheduler.DEFAULT_GROUP, 50, 20000) ;
		//����������ҵ��trigger��������
		scheduler.scheduleJob(jobDetail, trigger ); 
		//��ʼ����
		scheduler.start();
	}
}