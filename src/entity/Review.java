package entity;

import common.*;

public class Review
{
	private int id;
	private int topicId;
	private User reviewUser;
	private java.util.Date reviewTime;

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public int getTopicId()
	{
		return topicId;
	}

	public void setTopicId(int topicId)
	{
		this.topicId = topicId;
	}

	public User getReviewUser()
	{
		return reviewUser;
	}

	public void setReviewUser(User reviewUser)
	{
		this.reviewUser = reviewUser;
	}

	public java.util.Date getReviewTime()
	{
		return reviewTime;
	}

	public void setReviewTime(java.util.Date reviewTime)
	{
		this.reviewTime = reviewTime;
	}

	public String getFormattedReviewTime()
	{
		return MyFormat.formatDate(reviewTime);
	}

	public String getReviewTimeInterval()
	{
		return MyFormat.getTimeInterval(new java.util.Date().getTime()
				- reviewTime.getTime());
	}
}
