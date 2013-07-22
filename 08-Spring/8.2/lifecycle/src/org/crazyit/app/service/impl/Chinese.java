package org.crazyit.app.service.impl;

import org.springframework.stereotype.*;

import javax.annotation.*;

import org.crazyit.app.service.*;
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
@Component
public class Chinese
	implements Person
{
	//ִ��Fieldע��
	@Resource(name="steelAxe")
	private Axe axe;
	//ʵ��Person�ӿڵ�useAxe����
	public void useAxe()
	{
		//����axe��chop()������
		//����Person����������axe����
		System.out.println(axe.chop());
	}
	@PostConstruct
	public void init()
	{
		System.out.println("����ִ�г�ʼ����init����...");
	}
	@PreDestroy
	public void close()
	{
		System.out.println("����ִ������֮ǰ��close����...");
	}
}