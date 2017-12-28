package common;

import java.util.List;

import entity.*;

public class UserInfo
{
    private String cookieUser;
	private String title;
	private String content;
	private String select;
	//  ��ǰҳ
	private int page;
	private int totalPage;
	private int pageTopicNumber;
	private List<Topic> topics;
	private String user;
	private String path;
	private Topic topic;
	private String topicPath;
	private String postTopicTime;
	private String topicURL;
	private List<String> reviewURLs; 
	private List<Review> reviews;

	/**
	 * topic���Ե�getter����
	 */
	public Topic getTopic()
	{
		return topic;
	}
	/**
	 * topic���Ե�setter����
	 */
	public void setTopic(Topic topic)
	{
		this.topic = topic;
	}
	/**
	 * topicPath���Ե�getter����
	 */
	public String getTopicPath()
	{
		return topicPath;
	}
	/**
	 * topicPath���Ե�setter����
	 */
	public void setTopicPath(String topicPath)
	{
		this.topicPath = topicPath;
	}
	/**
	 * postTopicTime���Ե�getter����
	 */
	public String getPostTopicTime()
	{
		return postTopicTime;
	}
	/**
	 * postTopicTime���Ե�setter����
	 */
	public void setPostTopicTime(String postTopicTime)
	{
		this.postTopicTime = postTopicTime;
	}
	/**
	 * topicURL���Ե�getter����
	 */
	public String getTopicURL()
	{
		return topicURL;
	}
	/**
	 * topicURL���Ե�setter����
	 */
	public void setTopicURL(String topicURL)
	{
		this.topicURL = topicURL;
	}
	/**
	 * reviewURLs���Ե�getter����
	 */
	public List<String> getReviewURLs()
	{
		return reviewURLs;
	}
	/**
	 * reviewURLs���Ե�setter����
	 */
	public void setReviewURLs(List<String> reviewURLs)
	{
		this.reviewURLs = reviewURLs;
	}
	/**
	 * reviews���Ե�getter����
	 */
	public List<Review> getReviews()
	{
		return reviews;
	}
	/**
	 * reviews���Ե�setter����
	 */
	public void setReviews(List<Review> reviews)
	{
		this.reviews = reviews;
	}
	/**
	 * user���Ե�getter����
	 */
	public String getUser()
	{
		return user;
	}
	/**
	 * user���Ե�setter����
	 */
	public void setUser(String user)
	{
		this.user = user;
	}
	/**
	 * path���Ե�getter����
	 */
	public String getPath()
	{
		return path;
	}
	/**
	 * path���Ե�setter����
	 */
	public void setPath(String path)
	{
		this.path = path;
	}
	/**
	 * topics���Ե�getter����
	 */
	public List<Topic> getTopics()
	{
		return topics;
	}
	/**
	 * topics���Ե�setter����
	 */
	public void setTopics(List<Topic> topics)
	{
		this.topics = topics;
	}
	/**
	 * pageTopicNumber���Ե�getter����
	 */
	public int getPageTopicNumber()
	{
		return pageTopicNumber;
	}
	/**
	 * pageTopicNumber���Ե�setter����
	 */
	public void setPageTopicNumber(int pageTopicNumber)
	{
		this.pageTopicNumber = pageTopicNumber;
	}
	/**
	 * select���Ե�getter����
	 */
	public String getSelect()
	{
		return select;
	}
	/**
	 * select���Ե�setter����
	 */
	public void setSelect(String select)
	{
		this.select = select;
	}
	/**
	 * page���Ե�getter����
	 */
	public int getPage()
	{
		return page;
	}
	/**
	 * page���Ե�setter����
	 */
	public void setPage(int page)
	{
		this.page = page;
	}
	/**
	 * cookieUser���Ե�getter����
	 */
	public String getCookieUser()
	{
		return cookieUser;
	}
	/**
	 * cookieUser���Ե�setter����
	 */
	public void setCookieUser(String cookieUser)
	{
		this.cookieUser = cookieUser;
	}
	/**
	 * title���Ե�getter����
	 */
	public String getTitle()
	{
		return title;
	}
	/**
	 * title���Ե�setter����
	 */
	public void setTitle(String title)
	{
		this.title = title;
	}
	/**
	 * content���Ե�getter����
	 */
	public String getContent()
	{
		return content;
	}
	/**
	 * content���Ե�setter����
	 */
	public void setContent(String content)
	{
		this.content = content;
	}
	/**
	 * totalPage���Ե�getter����
	 */
	public int getTotalPage()
	{
		return totalPage;
	}
	/**
	 * totalPage���Ե�setter����
	 */
	public void setTotalPage(int totalPage)
	{
		this.totalPage = totalPage;
	}

	
}
