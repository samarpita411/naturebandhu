package com.teamsankya.naturebandhuproject.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.teamsankya.naturebandhuproject.dto.ProductCategoryBean;
import com.teamsankya.naturebandhuproject.dto.ProductDetailsBean;
import com.teamsankya.naturebandhuproject.service.NatureBandhuServiceImpl;

@Repository
public class NatureBandhuDaoHibernateImpl implements NatureBandhuDao {
	
	/**
	 * Default Constructor
	 */
		public NatureBandhuDaoHibernateImpl() {	}
		
	/**
	 * SessionFactory is usually created during application start up and kept for
	 * later use.
	 */
	@Autowired
	private SessionFactory sessionFactory;
	
	final static Logger LOGGER = Logger.getLogger(NatureBandhuDaoHibernateImpl.class);
	
	@Override
	public List<ProductDetailsBean> getProduct(String productName)
	{
		LOGGER.info("inside NatureBandhuDaoHibernateImpl class");
		LOGGER.info("productName : "+productName);
		Session session;
		
		try {
			session=sessionFactory.openSession();
			
		}
		catch(HibernateException e)
		{
			session=sessionFactory.getCurrentSession();
		}
		
		Transaction transaction=session.beginTransaction();
		
//		@SuppressWarnings("deprecation")
		Criteria criteria = session.createCriteria(ProductDetailsBean.class);
		
//		criteria.setFirstResult(firstResult);
//		criteria.setMaxResults(maxResults);
		
		criteria.add(Restrictions.like("productName",("%"+productName+"%")));
		List<ProductDetailsBean> results=criteria.list();
		
		transaction.commit();
		
		
		return results;
	}

	 

}
