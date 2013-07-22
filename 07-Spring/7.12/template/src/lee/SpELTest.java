package lee;

import org.springframework.expression.*;
import org.springframework.expression.spel.standard.*;
import org.springframework.expression.spel.support.*;
import org.springframework.expression.common.*;

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
		Person p1 = new Person(1, "�����" , 162);
		Person p2 = new Person(1, "��˽�" , 182);
		Expression expr = parser
			.parseExpression("�ҵ�������#{name},�����#{height}"
			, new TemplateParserContext());
		//��ʹ��p1����name��height���������ʽģ���е�#{}
		System.out.println(expr.getValue(p1));
		//��ʹ��p2����name��height���������ʽģ���е�#{}
		System.out.println(expr.getValue(p2));
	}
}