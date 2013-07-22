package org.crazyit.app.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import java.io.File;
import java.io.*;

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
 
public class UploadAction extends ActionSupport
{
	//��װ�ļ������������������
	private String title;
	//��װ�ϴ��ļ��������
	private File upload;
	//��װ�ϴ��ļ����͵�����
	private String uploadContentType;
	//��װ�ϴ��ļ���������
	private String uploadFileName;
	//ֱ����struts.xml�ļ������õ�����
	private String savePath;
	//�����Action�����ϴ����ļ�����
	private String allowTypes;
	//allowTypes���Ե�setter��getter����
	public String getAllowTypes()
	{
		return allowTypes;
	}
	public void setAllowTypes(String allowTypes)
	{
		this.allowTypes = allowTypes;
	}

	//����struts.xml�ļ�����ֵ�ķ���
	public void setSavePath(String value)
	{
		this.savePath = value;
	}
	//�����ϴ��ļ��ı���λ��
	private String getSavePath() throws Exception 
	{
		return ServletActionContext.getServletContext()
			.getRealPath(savePath);
	}

	//�ļ������setter��getter����
	public void setTitle(String title) 
	{
		this.title = title; 
	}
	public String getTitle()
	{
		return (this.title); 
	}

	//�ϴ��ļ���Ӧ�ļ����ݵ�setter��getter����
	public void setUpload(File upload) 
	{
		this.upload = upload; 
	}
	public File getUpload() 
	{
		return (this.upload); 
	}

	//�ϴ��ļ����ļ����͵�setter��getter����
	public void setUploadContentType(String uploadContentType) 
	{
		this.uploadContentType = uploadContentType; 
	}
	public String getUploadContentType()
	{
		return (this.uploadContentType); 
	}

	//�ϴ��ļ����ļ�����setter��getter����
	public void setUploadFileName(String uploadFileName) 
	{
		this.uploadFileName = uploadFileName; 
	}
	public String getUploadFileName() 
	{
		return (this.uploadFileName); 
	}
	
	@Override
	public String execute() throws Exception
	{
		//�Է��������ļ������ַ��ԭ�ļ��������ϴ��ļ������
		FileOutputStream fos = new FileOutputStream(getSavePath()
			+ "\\" + getUploadFileName());
		FileInputStream fis = new FileInputStream(getUpload());
		byte[] buffer = new byte[1024];
		int len = 0;
		while ((len = fis.read(buffer)) > 0)
		{
			fos.write(buffer , 0 , len);
		}
		fos.close();
		return SUCCESS;
	}

	/**
	 * �����ļ�����
	 * @param types ϵͳ���������ϴ����ļ�����
	 * @return ����ϴ��ļ����ļ����������ϴ���
	 *		 ����null�����򷵻�error�ַ���
	 */
	public String filterTypes(String[] types)
	{
		//��ȡϣ���ϴ����ļ�����
		String fileType = getUploadContentType();
		for (String type : types)
		{
			if (type.equals(fileType))
			{
				return null;
			}
		}
		return ERROR;
	}

//ִ������У��
public void validate()
{
	//�������ϴ��ļ����͵��ַ�����Ӣ�Ķ��ţ�,��
	//�ֽ���ַ�������Ӷ��жϵ�ǰ�ļ������Ƿ������ϴ�
	String filterResult = filterType(getAllowTypes().split(","));
	//�����ǰ�ļ����Ͳ������ϴ�
	if (filterResult != null)
	{
		//���FieldError
		addFieldError("upload" , "��Ҫ�ϴ����ļ����Ͳ���ȷ��");
	}
}
}