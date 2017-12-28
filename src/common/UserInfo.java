package common;

import java.util.List;

import entity.*;

public class UserInfo
{
    private String cookieUser;
	private String title;
	private String content;
	private String select;
	//  当前页
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
	 * topic属性的getter方法
	 */
	public Topic getTopic()
	{
		return topic;
	}
	/**
	 * topic属性的setter方法
	 */
	public void setTopic(Topic topic)
	{
		this.topic = topic;
	}
	/**
	 * topicPath属性的getter方法
	 */
	public String getTopicPath()
	{
		return topicPath;
	}
	/**
	 * topicPath属性的setter方法
	 */
	public void setTopicPath(String topicPath)
	{
		this.topicPath = topicPath;
	}
	/**
	 * postTopicTime属性的getter方法
	 */
	public String getPostTopicTime()
	{
		return postTopicTime;
	}
	/**
	 * postTopicTime属性的setter方法
	 */
	public void setPostTopicTime(String postTopicTime)
	{
		this.postTopicTime = postTopicTime;
	}
	/**
	 * topicURL属性的getter方法
	 */
	public String getTopicURL()
	{
		return topicURL;
	}
	/**
	 * topicURL属性的setter方法
	 */
	public void setTopicURL(String topicURL)
	{
		this.topicURL = topicURL;
	}
	/**
	 * reviewURLs属性的getter方法
	 */
	public List<String> getReviewURLs()
	{
		return reviewURLs;
	}
	/**
	 * reviewURLs属性的setter方法
	 */
	public void setReviewURLs(List<String> reviewURLs)
	{
		this.reviewURLs = reviewURLs;
	}
	/**
	 * reviews属性的getter方法
	 */
	public List<Review> getReviews()
	{
		return reviews;
	}
	/**
	 * reviews属性的setter方法
	 */
	public void setReviews(List<Review> reviews)
	{
		this.reviews = reviews;
	}
	/**
	 * user属性的getter方法
	 */
	public String getUser()
	{
		return user;
	}
	/**
	 * user属性的setter方法
	 */
	public void setUser(String user)
	{
		this.user = user;
	}
	/**
	 * path属性的getter方法
	 */
	public String getPath()
	{
		return path;
	}
	/**
	 * path属性的setter方法
	 */
	public void setPath(String path)
	{
		this.path = path;
	}
	/**
	 * topics属性的getter方法
	 */
	public List<Topic> getTopics()
	{
		return topics;
	}
	/**
	 * topics属性的setter方法
	 */
	public void setTopics(List<Topic> topics)
	{
		this.topics = topics;
	}
	/**
	 * pageTopicNumber属性的getter方法
	 */
	public int getPageTopicNumber()
	{
		return pageTopicNumber;
	}
	/**
	 * pageTopicNumber属性的setter方法
	 */
	public void setPageTopicNumber(int pageTopicNumber)
	{
		this.pageTopicNumber = pageTopicNumber;
	}
	/**
	 * select属性的getter方法
	 */
	public String getSelect()
	{
		return select;
	}
	/**
	 * select属性的setter方法
	 */
	public void setSelect(String select)
	{
		this.select = select;
	}
	/**
	 * page属性的getter方法
	 */
	public int getPage()
	{
		return page;
	}
	/**
	 * page属性的setter方法
	 */
	public void setPage(int page)
	{
		this.page = page;
	}
	/**
	 * cookieUser属性的getter方法
	 */
	public String getCookieUser()
	{
		return cookieUser;
	}
	/**
	 * cookieUser属性的setter方法
	 */
	public void setCookieUser(String cookieUser)
	{
		this.cookieUser = cookieUser;
	}
	/**
	 * title属性的getter方法
	 */
	public String getTitle()
	{
		return title;
	}
	/**
	 * title属性的setter方法
	 */
	public void setTitle(String title)
	{
		this.title = title;
	}
	/**
	 * content属性的getter方法
	 */
	public String getContent()
	{
		return content;
	}
	/**
	 * content属性的setter方法
	 */
	public void setContent(String content)
	{
		this.content = content;
	}
	/**
	 * totalPage属性的getter方法
	 */
	public int getTotalPage()
	{
		return totalPage;
	}
	/**
	 * totalPage属性的setter方法
	 */
	public void setTotalPage(int totalPage)
	{
		this.totalPage = totalPage;
	}

	
}
