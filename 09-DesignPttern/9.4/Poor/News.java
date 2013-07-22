

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
	//����
	private Long id;
	//��Ϣ����
	private String title;
	//��Ϣ����
	private String content;
	//��Ϣ�ķ���ʱ��
	private Date postDate;
	//��Ϣ������޸�ʱ��
	private Date lastModifyDate;
	//��Ϣ��������
	private Category category;
	//��Ϣ������
	private User poster;
	//��Ϣ��Ӧ�Ļظ�
	private Set newsReviews;
	//����ʡ�Ը����Ե�setter��getter����
	...
	//��дDomain Object��equals����
	public boolean equals(Object object) 
	{
		if(this == object)
		{
			return true;
		}
		if (object != null && 
			object.getClass() == News.class)
		{
			News rhs = (News) object;
			return this.poster.equals(rhs.getPoster())
				&& this.postDate.equals(rhs.getPostDate());
		}
		return false;
	}
	//��дNews���hashCode����
	public int hashCode()
	{
		return this.poster.hashCode() +
			this.postDate.hashCode() * 29;
	}
	//��дNews���toString����
	public String toString()
	{
		return new ToStringBuilder(this).append("id", this.id)
			.append("title" , this.title)
			.append("postDate" , this.postDate)
			.append("content" , this.content)
			.append("lastModifyDate" , this.lastModifyDate)
			.append("poster" , this.poster)
			.append("category" , this.category)
			.append("newsReviews" , this.newsReviews)
			.toString();
	}
}
