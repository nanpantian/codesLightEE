package org.crazyit.hrsystem.schedule;

import java.util.Date;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import org.crazyit.hrsystem.service.EmpManager;

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
public class PunchJob
	extends QuartzJobBean 
{
	//�ж���ҵ�Ƿ�ִ�е����
	private boolean isRunning = false;
	//����ҵ����������ҵ���߼����
	private EmpManager empMgr;
	public void setEmpMgr(EmpManager empMgr)
	{
		this.empMgr = empMgr;
	}
	//��������ִ����
	public void executeInternal(JobExecutionContext ctx) 
		throws JobExecutionException 
	{
		if (!isRunning)
		{
			System.out.println("��ʼ�����Զ���");
			isRunning = true;
			//����ҵ���߼�����
			empMgr.autoPunch();
			isRunning = false;
		}
	}
}