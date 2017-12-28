package action;

import com.opensymphony.xwork2.ModelDriven;
import service.interfaces.*;
import common.*;

public class MainAction extends BaseAction implements ModelDriven<UserInfo>
{    
	public String execute() throws Exception
	{
		try
		{			
			TopicService topicService = serviceManager.getTopicService();
			userInfo.setTopics(topicService.getTopics(userInfo));
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		return SUCCESS;
	}
	public UserInfo getModel()
	{

		return userInfo;
	}
}