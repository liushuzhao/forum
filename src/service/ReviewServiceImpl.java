package service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;

import common.*;
import dao.interfaces.*;
import entity.*;

public class ReviewServiceImpl implements service.interfaces.ReviewService
{
	private UserDAO userDAO;
	private TopicDAO topicDAO;
	private ReviewDAO reviewDAO;

	public ReviewServiceImpl(UserDAO userDAO, TopicDAO topicDAO,
			ReviewDAO reviewDAO)
	{
		this.topicDAO = topicDAO;
		this.reviewDAO = reviewDAO;
		this.userDAO = userDAO;
	}

	public void getReviews(UserInfo userInfo)
	{
		List<Topic> topics = topicDAO.query(
				"from Topic t where t.user.name = ? and t.topicPath = ?",
				userInfo.getUser(), userInfo.getPath());
		Topic topic = null;
		if (topics.size() > 0)
			topic = topics.get(0);

		topic.setViewCount(topic.getViewCount() + 1);

		topicDAO.save(topic);
		String topicPath = "/content/" + userInfo.getUser() + "/"
				+ userInfo.getPath() + "/";
		String topicURL = topicPath + "topic.txt";

		List<String> reviewURLs = new ArrayList<String>();
		List<Review> reviews = reviewDAO.query(
				"from Review r where r.topicId = ? order by review_time asc",
				topic.getId());
		for (Review review : reviews)
		{
			reviewURLs.add(topicPath + review.getId() + ".txt");
		}
		userInfo.setTopic(topic);
		userInfo.setTopicPath(topicPath);
		userInfo.setPostTopicTime(MyFormat.formatDate(topic.getPostTopicTime()));
		userInfo.setTopicURL(topicURL);
		userInfo.setReviewURLs(reviewURLs);
		userInfo.setReviews(reviews);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see service.interfaces.ReviewService#addReview(entity.Review)
	 */
	public void addReview(UserInfo userInfo, ServletContext servletContext) throws Exception
	{
		Review review = new Review();

		User reviewUser = userDAO.load(userInfo.getCookieUser());
		if (reviewUser == null)
			return;
		List<Topic> topics = topicDAO.query(
				"from Topic t where t.user.name = ? and t.topicPath = ?",
				userInfo.getUser(), userInfo.getPath());
		if (topics.size() == 0)
			return;
		Topic topic = topics.get(0);
		review.setReviewTime(new java.util.Date());
		review.setReviewUser(reviewUser);
		review.setTopicId(topic.getId());
		reviewDAO.save(review);
		topicDAO
				.execute(
						"update Topic t set t.replyCount = ?, t.lastReplyTime = ?, t.lastReplyUser.id = ? where t.id = ?",
						topic.getReplyCount() + 1, topic.getLastReplyTime(),
						topic.getUser().getId(), topic.getId());

		
		String fn = servletContext.getRealPath("/content");

		fn += File.separator + topic.getUser().getName() + File.separator
				+ topic.getTopicPath();

		fn += File.separator + String.valueOf(review.getId()).toString()
				+ ".txt";

		OutputStream os = new FileOutputStream(fn);
		OutputStreamWriter osw = new OutputStreamWriter(os);
		osw.write(userInfo.getContent());
		osw.close();
		os.close();
	}
}
