

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
public class News
{
	//�˴�ʡ��������������
	...
	//�˴�ʡ�������Զ�Ӧ��setter��getter����
	...
	//�������Żظ���ҵ���߼�����
	public NewsReview addNewsReview(String content)
	{
		//��Ĭ�Ϲ������������Żظ�ʵ��
		NewsReview review = new NewsReview();
		//���ûظ�����
		review.setContent(content);
		//���ûظ��ķ�������
		review.setPostDate(new Date());
		//���ûظ�������޸�����
		review.setLastModifyDate(new Date());
		//���ûظ�����Ϣ�Ĺ���
		review.setNews(this);
		//ֱ�ӵ���newsReviewsDao�����Ϣ�ظ��ĳ־û�
		newsReviewsDao.save(review);
		return review;
	}
	//�˴�ʡ������д��hashCode��equals�ȷ���
	...
}
