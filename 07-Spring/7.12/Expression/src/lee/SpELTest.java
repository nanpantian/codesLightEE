package lee;

import org.springframework.expression.*;
import org.springframework.expression.spel.standard.*;
import org.springframework.expression.spel.support.*;

import java.util.*;

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
public class SpELTest
{
	public static void main(String[] args)
	{
		//����һ��ExpressionParser�������ڽ������ʽ
		ExpressionParser parser = new SpelExpressionParser();
		//��򵥵��ַ������ʽ
		Expression exp = parser.parseExpression("'HelloWorld'");
		System.out.println("'HelloWorld'�Ľ���� " + exp.getValue());
		//���÷����ı��ʽ
		exp = parser.parseExpression("'HelloWorld'.concat('!')");
		System.out.println("'HelloWorld'.concat('!')�Ľ���� "
			+ exp.getValue());
		//���ö����getter����
		exp = parser.parseExpression("'HelloWorld'.bytes");
		System.out.println("'HelloWorld'.bytes�Ľ���� "
			+ exp.getValue());
		//���ʶ��������(d�൱��HelloWorld.getBytes().length)
		exp = parser.parseExpression("'HelloWorld'.bytes.length");
		System.out.println("'HelloWorld'.bytes.length�Ľ����"
			+ exp.getValue());
		//ʹ�ù���������������
		exp = parser.parseExpression("new String('helloworld')"
			+ ".toUpperCase()");
		System.out.println("new String('helloworld')"
			+ ".toUpperCase()�Ľ���ǣ� "
			+ exp.getValue(String.class));

		Person person = new Person(1 , "�����", new Date());
		exp = parser.parseExpression("name");
		//��ָ��������Ϊroot��������ʽ��ֵ
		//�൱�ڵ���person.name���ʽ��ֵ
		System.out.println("��persnΪroot��name���ʽ��ֵ�ǣ� "
			+ exp.getValue(person , String.class));		
		exp = parser.parseExpression("name=='�����'");
		StandardEvaluationContext ctx = new StandardEvaluationContext();
		ctx.setRootObject(person);
		//��ָ��Context��������ʽ��ֵ
		System.out.println(exp.getValue(ctx , Boolean.class));

		List<Boolean> list = new ArrayList<Boolean>();
		list.add(true);
		EvaluationContext ctx2 = new StandardEvaluationContext();
		//��list���ó�EvaluationContext��һ������
		ctx2.setVariable("list" , list);
		//����list�����ĵ�һ��Ԫ�ص�ֵ
		parser.parseExpression("#list[0]").setValue(ctx2 , "false");
		//list���ϵĵ�һ��Ԫ�ر��ı�
		System.out.println("list���ϵĵ�һ��Ԫ��Ϊ�� "
			+ list.get(0));
	}
}