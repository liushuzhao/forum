package service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.List;
import java.util.Random;

import javax.servlet.ServletContext;

import common.UserInfo;

import entity.*;
import dao.interfaces.*;
import service.interfaces.*;

public class TopicServiceImpl implements TopicService
{
	private TopicDAO topicDAO;
	private UserDAO userDAO;

	public TopicServiceImpl(TopicDAO topicDAO, UserDAO userDAO)
	{
		this.topicDAO = topicDAO;
		this.userDAO = userDAO;
	}

	public void addTopic(UserInfo userInfo, ServletContext servletContext)
			throws Exception
	{
		User user = userDAO.load(userInfo.getCookieUser());
		if (user == null)
			return;
		Topic topic = new Topic();
		topic.setUser(user);
		java.util.Date date = new java.util.Date();
		topic.setLastReplyTime(date);
		topic.setPostTopicTime(date);
		topic.setLastReplyUser(user);
		topic.setTopic(userInfo.getTitle());
		Random random = new Random();
		String randomStr = String.valueOf(random.nextInt(Integer.MAX_VALUE));
		topic.setTopicPath(randomStr);
		topicDAO.save(topic);
		String fn = servletContext.getRealPath("/content");
		fn += File.separator + userInfo.getCookieUser() + File.separator
				+ randomStr;
		File dir = new File(fn);
		if (!dir.exists())
		{
			dir.mkdirs();
		}
		fn += File.separator + "topic.txt";
		OutputStream os = new FileOutputStream(fn);
		OutputStreamWriter osw = new OutputStreamWriter(os);
		osw.write(userInfo.getContent());
		osw.close();
		os.close();

	}

	public int getPageNumber(int pageTopicNumber, String select)
	{
		int count = 1;
		List<Long> cc = null;
		if (select == null)
			cc = topicDAO.query("select count(id) from Topic");
		else
			cc = topicDAO.query(
					"select count(id) from Topic where topic like ?", "%"
							+ select + "%");
		if (cc.size() > 0)
		{
			count = Integer.parseInt(cc.get(0).toString());
			int n = count % pageTopicNumber;
			count = count / pageTopicNumber;
			if (n != 0)
				count++;
		}
		return count;
	}


	public List<Topic> getTopics(UserInfo userInfo)
	{

		int totalPage = 1;

		if (userInfo.getSelect() != null && !userInfo.getSelect().equals(""))
			totalPage = getPageNumber(userInfo.getPageTopicNumber(), userInfo
					.getSelect());
		else
			totalPage = getPageNumber(userInfo.getPageTopicNumber(), null);
		userInfo.setTotalPage(totalPage);
		if (userInfo.getPage() > totalPage)
			userInfo.setPage(totalPage);
		if (userInfo.getPage() < 1)
			userInfo.setPage(1);
		List<Topic> topics = null;
		String hql1 = "from Topic t where t.topic like ? order by t.lastReplyTime desc";
		String hql2 = "from Topic t order by t.lastReplyTime desc";
		if (userInfo.getSelect() != null && !userInfo.getSelect().equals(""))
		{

			topics = topicDAO.query(hql1, (userInfo
					.getPage() - 1)
					* userInfo.getPageTopicNumber(),userInfo
					.getPageTopicNumber(),"%" + userInfo.getSelect() + "%");
		}
		else
		{

			topics = topicDAO.query(hql2,(userInfo.getPage() - 1)
					* userInfo.getPageTopicNumber(), userInfo.getPageTopicNumber(),null);

		}

		return topics;
	}

}
