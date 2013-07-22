

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
public class NewsReview
{
	//��Ϣ�ظ�������
	private Long id;
	//��Ϣ�ظ�������
	private String content;
	//��Ϣ�ظ��Ļظ�ʱ��
	private Date postDate;
	//�ظ�������޸�ʱ��
	private Date lastModifyDate;
	//��Ϣ�ظ���Ӧ����Ϣ
	private News news;
	//�˴�ʡ���˸����Ե�setter��getter����
	...
	//��дNewsReview��equals����
	public boolean equals(Object object)
	{
		if(this == object)
		{
			return true;
		}
		if (object != null && 
			object.getClass() == NewsReview.class)
		{
			NewsReview rhs = (NewsReview) object;
			return this.poster.equals(rhs.getPoster()) 
				&& this.postDate.equals(rhs.getPostDate());
		}
		return false;
	}
	//��дNewsReview��hashCode����
	public int hashCode() 
	{
		return this.poster.hashCode()
			+ this.postDate.hashCode() * 29;
	}
	//��дNewsReview��toString����
	public String toString()
	{
		return new ToStringBuilder(this)
			.append("id" , this.id)
			.append("postDate" , this.postDate)
			.append("lastModifyDate" , this.lastModifyDate)
			.append("content" , this.content)
			.append("poster" , this.poster)
			.append("news" , this.news).toString();
	}
}
