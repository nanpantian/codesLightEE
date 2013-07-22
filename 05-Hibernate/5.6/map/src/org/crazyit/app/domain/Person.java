package org.crazyit.app.domain;import java.util.HashMap;
import java.util.Map;
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
public class Person
{
	//��ʶ����
	private Integer id;
	//��ͨ����name
	private String name;
	//��ͨ����age
	private int age;
	//�������ԣ������ö�������Ŀ��Գɼ�
	private Map<String ,Float> scores
		= new HashMap<String ,Float>();

	//id���Ե�setter��getter����
	public void setId(Integer id)
	{
		this.id = id;
	}
	public Integer getId()
	{
		return this.id;
	}
	
	//name���Ե�setter��getter����
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}
	
	//age���Ե�setter��getter����
	public void setAge(int age)
	{
		this.age = age;
	}
	public int getAge()
	{
		return this.age;
	}
	
	//scores���Ե�setter��getter����
	public void setScores(Map<String ,Float> scores)
	{
		this.scores = scores;
	}
	public Map<String ,Float> getScores()
	{
		return this.scores;
	}
}