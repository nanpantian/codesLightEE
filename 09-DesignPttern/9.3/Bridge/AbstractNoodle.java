

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

public abstract class AbstractNoodle
{
	//���һ��Peppery���������ڽ���ά�ȵı仯��������
	protected Peppery style;
	//ÿ��Noodle�������һ��Peppery����
	public AbstractNoodle(Peppery style)
	{
		this.style = style;
	}
	public abstract void eat();
}