package dao;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import dao.interfaces.ReviewDAO;
import entity.Review;

public class ReviewDAOImpl extends DAOSupport implements ReviewDAO
{
	public  ReviewDAOImpl(HibernateTemplate template)
	{
		super(template);
	}
	public List query(String hql, Object... params)
	{		
		return template.find(hql, params);
	}

	public void save(Review review)
	{
		template.saveOrUpdate(review);
	}

}
