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
		List<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("Spring");

		Map<String, Double> map = 
			new HashMap<String, Double>();
		map.put("Java" , 80.0);
		map.put("Spring" , 89.0);

		//����һ��ExpressionParser�������ڽ������ʽ
		ExpressionParser parser = new SpelExpressionParser();
		EvaluationContext ctx = new StandardEvaluationContext();
		//������������
		ctx.setVariable("mylist" , list);
		ctx.setVariable("mymap" , map);
		//����List���ϵĵڶ���Ԫ��
		System.out.println(parser
			.parseExpression("#mylist[1]").getValue(ctx));
		//����Map���ϵ�ָ��Ԫ��
		System.out.println(parser
			.parseExpression("#mymap['Java']").getValue(ctx));
	}
}