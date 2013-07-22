package lee;

import org.springframework.expression.*;
import org.springframework.expression.spel.standard.*;
import org.springframework.expression.spel.support.*;

import java.util.*;
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
		EvaluationContext ctx = new StandardEvaluationContext();
		List<String> list = new ArrayList<String>();
		list.add("java");
		list.add("struts");
		list.add("spring");
		list.add("hibernate");		
		//����һ������
		ctx.setVariable("mylist" , list);
		//�Լ��ϵĵ�һ��Ԫ�ؽ��и�ֵ
		parser.parseExpression("#mylist[0]='���Java����'")
			.getValue(ctx);
		//���潫��� ���Java����
		System.out.println(list.get(0));
		//ʹ����Ŀ�����
		System.out.println(parser.parseExpression("#mylist.size()>3?"
			+ "'myList���ȴ���3':'myList���Ȳ�����3'")
			.getValue(ctx));

	}
}