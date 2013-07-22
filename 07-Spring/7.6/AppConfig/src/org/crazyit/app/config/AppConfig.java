package org.crazyit.app.config;

import org.springframework.context.annotation.*;
import org.springframework.beans.factory.annotation.*;

import org.crazyit.app.service.*;
import org.crazyit.app.service.impl.*;
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
@Configuration
public class AppConfig 
{
	//������Ҫ����ע�������ֵ
	@Value("�����") String personName; 
	//����һ��Bean��chinese
	@Bean(name="chinese") 
	public Person person() 
	{ 
		Chinese p = new Chinese();
		p.setAxe(stoneAxe());
		p.setName(personName);
		return p;
	}
	//����Bean��stoneAxe
	@Bean(name="stoneAxe")
	public Axe stoneAxe()
	{ 
		return new StoneAxe();
	}
	//����Bean��steelAxe
	@Bean(name="steelAxe")
	public Axe steelAxe()
	{ 
		return new SteelAxe();
	}
} 

