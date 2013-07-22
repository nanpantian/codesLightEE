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

		List<String> list = new ArrayList<String>();
		list.add("���Java����");
		list.add("���Ajax����");
		list.add("���XML����");
		list.add("����Java EE��ҵӦ��ʵս");
		EvaluationContext ctx = new StandardEvaluationContext();
		ctx.setVariable("mylist" , list);
		//�жϼ���Ԫ��length()�����ĳ��ȴ���7�������XML���塱���޳�
		Expression expr = parser.parseExpression
			("#mylist.?[length()>7]");
		System.out.println(expr.getValue(ctx));

		Map<String, Double> map = new HashMap<String ,Double>();
		map.put("Java" , 89.0);
		map.put("Spring" , 82.0);
		map.put("Ӣ��" , 75.0);
		ctx.setVariable("mymap" , map);
		//�ж�Map���ϵ�valueֵ����80��ֻ����ǰ��2��Entry
		expr = parser.parseExpression
			("#mymap.?[value>80]");
		System.out.println(expr.getValue(ctx));
	}
}