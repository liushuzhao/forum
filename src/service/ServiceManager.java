package service;

import service.interfaces.*;

public class ServiceManager
{
    private UserService userService;
    private TopicService topicService;
    private ReviewService reviewService;
	/**
	 * reviewService属性的getter方法
	 */
	public ReviewService getReviewService()
	{
		return reviewService;
	}
	/**
	 * reviewService属性的setter方法
	 */
	public void setReviewService(ReviewService reviewService)
	{
		this.reviewService = reviewService;
	}
	/**
	 * userService属性的getter方法
	 */
	public UserService getUserService()
	{
		return userService;
	}
	/**
	 * userService属性的setter方法
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
