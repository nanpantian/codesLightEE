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

		List<String> list = new ArrayList<String>();
		list.add("���Java����");
		list.add("���Ajax����");
		list.add("���XML����");
		list.add("����Java EE��ҵӦ��ʵս");
		EvaluationContext ctx = new StandardEvaluationContext();
		ctx.setVariable("mylist" , list);
		//�õ����¼��ϵ�Ԫ����ԭ���ϵ�ÿ��Ԫ��length()��������ֵ
		Expression expr = parser.parseExpression
			("#mylist.![length()]");
		System.out.println(expr.getValue(ctx));

		List<Person> list2 = new ArrayList<Person>();
		list2.add(new Person(1, "�����" , 162));
		list2.add(new Person(1, "��˽�" , 182));
		list2.add(new Person(1, "ţħ��" , 195));
		ctx.setVariable("mylist2" , list2);
		//�õ����¼��ϵ�Ԫ����ԭ���ϵ�ÿ��Ԫ��name����ֵ
		expr = parser.parseExpression
			("#mylist2.![name]");
		System.out.println(expr.getValue(ctx));
	}
}