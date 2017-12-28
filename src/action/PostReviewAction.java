package action;

import com.opensymphony.xwork2.ModelDriven;
import service.interfaces.*;
import common.*;

public class PostReviewAction extends BaseAction implements
		ModelDriven<UserInfo>
{
	public String execute() throws Exception
	{
		ReviewService reviewService = serviceManager.getReviewService();
		reviewService.addReview(userInfo, servletContext);
		return SUCCESS;
	}

	public UserInfo getModel()
	{
		return userInfo;
	}
}