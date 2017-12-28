package action;

import java.util.ArrayList;
import java.util.List;
import com.opensymphony.xwork2.ModelDriven;
import service.interfaces.*;
import common.*;

import dao.interfaces.TopicDAO;

public class ViewTopicAction extends BaseAction  implements ModelDriven<UserInfo>
{
	public UserInfo getModel()
	{	
		return userInfo;
	}

	public String execute() throws Exception
	{
		try
		{
			
			ReviewService reviewService = serviceManager.getReviewService();
			reviewService.getReviews(userInfo);
			common.WebEditor.createFCKEditor(request, "800", "350");

		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		return SUCCESS;
	}


}