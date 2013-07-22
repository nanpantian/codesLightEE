package org.crazyit.app.dao.impl;

import org.springframework.orm.jpa.support.JpaDaoSupport;

import java.util.*;

import org.crazyit.app.dao.*;
import org.crazyit.app.domain.*;

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
public class PersonDaoJpa
	extends JpaDaoSupport implements PersonDao
{
	/**
	 * ����Personʵ��
	 * @param id ��Ҫ���ص�Personʵ���ı�ʶ����ֵ
	 * @return ָ��id��Ӧ��Personʵ��
	 */ 
	public Person get(Integer id)
	{
		return getJpaTemplate()
			.find(Person.class, id); 
	}
	
	/**
	 * ����Personʵ��
	 * @param person ��Ҫ�����Personʵ��
	 * @return �ոձ����Personʵ���ı�ʶ����ֵ
	 */   
	public Integer save(Person person)
	{
		getJpaTemplate().persist(person);
		return person.getId();
	}
	
	/**
	 * �޸�Personʵ��
	 * @param person ��Ҫ�޸ĵ�Personʵ��
	 */
	public void update(Person person)
	{
		getJpaTemplate().merge(person);
	}
	
	/**
	 * ɾ��Personʵ��
	 * @param id ��Ҫɾ����Personʵ���ı�ʶ����ֵ
	 */
	public void delete(Integer id)
	{
		getJpaTemplate().remove(get(id));
	}
	
	/**
	 * ɾ��Personʵ��
	 * @param person ��Ҫɾ����Personʵ��
	 */
	public void delete(Person person)
	{
		getJpaTemplate().remove(person);
	}
	
	/**
	 * �����û�������Person
	 * @param name ��ѯ������
	 * @return ָ���û�����Ӧ��ȫ��Person
	 */
	public List<Person> findByName(String name)
	{
		return (List<Person>)getJpaTemplate()
			.find("select obj from Person obj where obj.name = ?1"
			, name);
	}
	
	/**
	 * ��ѯȫ��Personʵ��
	 * @return ȫ��Personʵ��
	 */
	public List<Person> findAllPerson()
	{
		return (List<Person>)getJpaTemplate()
			.find("select obj from Person obj");
	}
}