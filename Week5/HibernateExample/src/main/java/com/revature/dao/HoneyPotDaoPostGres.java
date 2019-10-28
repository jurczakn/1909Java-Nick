package com.revature.dao;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.revature.domains.HoneyPot;
import com.revature.util.SessionFactoryUtil;

public class HoneyPotDaoPostGres implements HoneyPotDao {
	
	SessionFactory sf = SessionFactoryUtil.getSessionFactory();

	@Override
	public void updateHoneyPot(HoneyPot hp) {
		Session sess = sf.openSession();
		sess.update(hp);
		sess.close();
	}

	@Override
	public void insertHoneyPot(HoneyPot hp) {
		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();
		sess.save(hp);
		tx.commit();
		sess.close();
		
	}

	@Override
	public void deleteHoneyPot(HoneyPot hp) {
		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();
		sess.delete(hp);
		tx.commit();
		sess.close();
	}

	@Override
	public HoneyPot getHoneyPotById(int id) {
		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();
		HoneyPot hp = (HoneyPot) sess.get(HoneyPot.class, id);
		tx.commit();
		sess.close();
		return hp;
	}

	public List<HoneyPot> getAllHoneyPots() {
		Session sess = sf.openSession();
		Criteria crit = sess.createCriteria(HoneyPot.class);
		List<HoneyPot> result = crit.list();
		sess.close();
		return result;
	}
	
}

