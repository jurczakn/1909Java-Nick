package com.revature.dao;

import static org.hibernate.criterion.Restrictions.and;
import static org.hibernate.criterion.Restrictions.eq;
import static org.hibernate.criterion.Restrictions.lt;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import com.revature.domains.Bear;
import com.revature.util.SessionFactoryUtil;

public class BearDaoImpl {

	private static SessionFactory sf = SessionFactoryUtil.getSessionFactory();
	
	
	/*
	 * Query - allows us to work with our DataBase using HQL
	 * HQL - Hibernate Query Language, is similar to SQL, but is
	 * SQL Language agnostic, and refers to objects and fields
	 * opposed to Tables and Columns
	 */
	public void queryDemo() {
		Session sess = sf.openSession();
		
		String hql = "FROM Bear as b WHERE b.breed = :type";
		
		Query query = sess.createQuery(hql);
		
		String type = "polar";
		
		query.setParameter("type", type);
		
		List<Bear> bears = query.list();
		
		SQLQuery nativeSQLQuery = sess.createSQLQuery("Select * from bears where type = " + type);
		
		bears = nativeSQLQuery.list();
		
		Query query2 = sess.getNamedQuery("get_small_bears");
		
	}
	
	public List<Bear> getAllBears() {
		Session sess = sf.openSession();
		Criteria crit = sess.createCriteria(Bear.class);
		List<Bear> result = crit.list();
		sess.close();
		return result;
	}
	
	/*
	 * Criteria - robust read only api for Hibernate
	 * Allows us to grab out Java Objects from the database, based on restrictions we place on the criteria
	 */
	public List<Bear> getBearsByBreed(String breed) {
		Session sess = sf.openSession();
		Criteria crit = sess.createCriteria(Bear.class).add(Restrictions.eq("breed", breed));
		List<Bear> result = crit.list();
		sess.close();
		return result;
	}
	
	public List<Bear> getBearsByBreedAndWeightLessThan(String breed, int weight) {
		Session sess = sf.openSession();
		//without static import
		/*
		 * Criteria crit = sess.createCriteria(Bear.class) 
		 * 		.add(Restrictions.and(
		 * 			Restrictions.eq("breed", breed), 
		 * 			Restrictions.lt("weight", weight) ));
		 */
		//with static import
		Criteria crit = sess.createCriteria(Bear.class)
				.add(and(
						eq("breed", breed),
						lt("weight", weight)
						));
		List<Bear> result = crit.list();
		sess.close();
		return result;
	}
	
	
	
}
