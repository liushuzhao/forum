package service;

import service.interfaces.*;

public class ServiceManager
{
    private UserService userService;
    private TopicService topicService;
    private ReviewService reviewService;
	/**
	 * reviewService���Ե�getter����
	 */
	public ReviewService getReviewService()
	{
		return reviewService;
	}
	/**
	 * reviewService���Ե�setter����
	 */
	public void setReviewService(ReviewService reviewService)
	{
		this.reviewService = reviewService;
	}
	/**
	 * userService���Ե�getter����
	 */
	public UserService getUserService()
	{
		return userService;
	}
	/**
	 * userService���Ե�setter����
	 */
	public void setUserService(UserService userService)
	{
		this.userService = userService;
	}
	public TopicService getTopicService()
	{
		return topicService;
	}
	public void setTopicService(TopicService topicService)
	{
		this.topicService = topicService;
	}
}
