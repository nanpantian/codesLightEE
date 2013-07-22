package org.crazyit.app.action;

import java.io.InputStream;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.*;

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
public class FileDownloadAction
	extends ActionSupport 
{
	//�����Կ����������ļ��ж�ָ̬��������ֵ
	private String inputPath;
	//����ע�������ֵ��setter����
	public void setInputPath(String value)
	{
		inputPath = value;
	}
	/*
	����һ������InputStream�ķ�����
	�÷�������Ϊ�������ļ�����ڣ�
	����Ҫ����stream���ͽ��ʱָ��inputName������
	inputName������ֵ���Ƿ���ȥ��getǰ׺������ĸСд���ַ���
	*/
	public InputStream getTargetFile() throws Exception 
	{
		//ServletContext�ṩgetResourceAsStream()����
		//����ָ���ļ���Ӧ�������� 
		return ServletActionContext.getServletContext()
			.getResourceAsStream(inputPath);
	}
}
