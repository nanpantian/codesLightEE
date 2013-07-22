package org.crazyit.app.dao.impl;

import javax.sql.DataSource;
import java.sql.Connection;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.*;

import org.crazyit.app.dao.*;
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
public class NewsDaoImpl
	implements NewsDao
{
	private DataSource ds;
	public void setDs(DataSource ds)
	{
		this.ds = ds;
	}
	@Transactional(propagation=Propagation.REQUIRED)
	public void insert(String title 
		, String content)
	{
		JdbcTemplate jt = new JdbcTemplate(ds);
		jt.update("insert into news_inf"
			+ " values(null , ? , ?)" 
			, title , content);
		//���β��������Υ��Ψһ��Լ��
		jt.update("insert into news_inf"
			+ " values(null , ? , ?)" 
			, title , content);
		//�������������ƣ����Ƿ��ֵ�һ����¼Ҳ�岻��ȥ��
		//���û��������ƣ����һ����¼���Ա�����
	}
}