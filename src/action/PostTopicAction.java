package action;

import com.opensymphony.xwork2.ModelDriven;
import service.interfaces.*;
import common.*;

public class PostTopicAction extends BaseAction implements ModelDriven<UserInfo>
{

	public String execute() throws Exception
	{
		try
		{
			TopicService topicService = serviceManager.getTopicService();
			topicService.addTopic(userInfo, servletContext);
			return SUCCESS;
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		return ERROR;
	}


	public UserInfo getModel()
	{

		return userInfo;
	}
}