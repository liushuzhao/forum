package entity;

import common.MyFormat;


public class Topic 
{
    private int id;
    private String topic;
    private User user;
    private java.util.Date postTopicTime;
    private int viewCount;
    private int replyCount;
    private java.util.Date lastReplyTime;
    private User lastReplyUser;
    private String topicPath;
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{ 
		this.id = id;
	}
	public String getTopic()
	{
		return topic;
	}
	public void setTopic(String topic)
	{
		this.topic = topic;
	}
	public User getUser()
	{
		return user;
	}
	public void setUser(User user)
	{
		this.user = user;
	}
	public java.util.Date getPostTopicTime()
	{
		return postTopicTime;
	}
	public void setPostTopicTime(java.util.Date postTopicTime)
	{
		this.postTopicTime = postTopicTime;
	}
	public int getViewCount()
	{
		return viewCount;
	}
	public void setViewCount(int viewCount)
	{
		this.viewCount = viewCount;
	}
	public int getReplyCount()
	{
		return replyCount;
	}
	public void setReplyCount(int replyCount)
	{
		this.replyCount = replyCount;
	}
	public java.util.Date getLastReplyTime()
	{
		return lastReplyTime;
	}
	public void setLastReplyTime(java.util.Date lastReplyTime)
	{
		this.lastReplyTime = lastReplyTime;
	}
	public User getLastReplyUser()
	{
		return lastReplyUser;
	}
	public void setLastReplyUser(User lastReplyUser)
	{
		this.lastReplyUser = lastReplyUser;
	}
	public String getTopicPath()
	{
		return topicPath;
	}
	public void setTopicPath(String topicPath)
	{
		this.topicPath = topicPath;
	}

	public String getLastReplyTimeInterval()
	{
		long time = new java.util.Date().getTime() - lastReplyTime.getTime();
		return MyFormat.getTimeInterval(time);
	}
	public String getFormattedPostTopicTime()
	{
		return MyFormat.formatDate(postTopicTime);
	}
}
