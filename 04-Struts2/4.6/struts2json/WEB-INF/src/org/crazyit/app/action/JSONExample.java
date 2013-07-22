package org.crazyit.app.action;

import java.util.HashMap;
import java.util.Map;

import com.opensymphony.xwork2.Action;
import org.apache.struts2.json.annotations.JSON;
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
public class JSONExample
{
	//ģ�⴦����������
	private int[] ints = {10, 20};
	private Map<String , String> map
		= new HashMap<String , String>();
	private String customName = "�˿�";
	//��װ�����������������
	private String field1;
	//'transient'���ε����Բ��ᱻ���л�
	private transient String field2;
	//û��setter��getter�������ֶβ��ᱻ���л�
	private String field3;
	
	public String execute()
	{
		map.put("name", "���Java����");
		return Action.SUCCESS;
	}

	//ʹ��ע���﷨���ı���������л����������
	@JSON(name="newName")
	public Map getMap()
	{
		return this.map;
	}
	
	//customName���Ե�setter��getter����
	public void setCustomName(String customName)
	{
		this.customName = customName;
	}
	public String getCustomName()
	{
		return this.customName;
	}

	//field1���Ե�setter��getter����
	public void setField1(String field1)
	{
		this.field1 = field1;
	}
	public String getField1()
	{
		return this.field1;
	}

	//field2���Ե�setter��getter����
	public void setField2(String field2)
	{
		this.field2 = field2;
	}
	public String getField2()
	{
		return this.field2;
	}

	//field3���Ե�setter��getter����
	public void setField3(String field3)
	{
		this.field3 = field3;
	}
	public String getField3()
	{
		return this.field3;
	}
}