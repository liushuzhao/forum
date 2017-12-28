package dao;

import java.sql.SQLException;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;
import dao.interfaces.*;
import entity.*;

public class TopicDAOImpl extends DAOSupport implements TopicDAO
{
	public TopicDAOImpl(HibernateTemplate template)
	{
		super(template);
	}

	public List query(String hql, Object... params)
	{		
		return template.find(hql, params);
	}

	public List query(final String hql, final int firstRow, final int maxRow,
			final Object... params)
	{
		return template.executeFind(new HibernateCallback()
		{

			public Object doInHibernate(Session session)
					throws HibernateException, SQLException
			{
				Query query = session.createQuery(hql);
				if (params != null)
				{
					for (int i = 0; i < params.length; i++)
					{
						query.setParameter(i, params[i]);
					}
				}				
				query.setFirstResult(firstRow);
				query.setMaxResults(maxRow);
				return query.list();
			}

		});
	}

	public void save(Topic topic)
	{
		template.saveOrUpdate(topic);
		


	}

	public void execute(final String hql, final Object... params)
	{
		template.bulkUpdate(hql, params);
	}

}
