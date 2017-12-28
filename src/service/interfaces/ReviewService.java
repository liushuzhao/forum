package service.interfaces;

import javax.servlet.ServletContext;

import common.*;

public interface ReviewService
{
	public void getReviews(UserInfo userInfo);

	public void addReview(UserInfo userInfo, ServletContext servletContext)
			throws Exception;
}
