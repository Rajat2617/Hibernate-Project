package com.hibernate.manyToMany.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.manyToMany.dto.MobileDTO;
import com.jspider.hibernate.util.HibernateUtil;

public class MobileDAO {

	private SessionFactory factory = HibernateUtil.getSessionFactory();

	public void saveMobile(MobileDTO mobileDTO) {
		Transaction tx = null;
		try (Session session = factory.openSession()) {
			tx = session.beginTransaction();
			session.persist(mobileDTO);
			tx.commit();
		} catch (HibernateException e) {
			tx.rollback();
			e.printStackTrace();
		}
	}
}
