package com.jspider.manyToOne.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.jspider.hibernate.util.HibernateUtil;
import com.jspider.manyToOne.dto.LeafDTO;

public class LeafDAO {

	private SessionFactory factory = HibernateUtil.getSessionFactory();

	public void saveLeaf(LeafDTO leafDTO) {
		Transaction tx = null;
		try (Session session = factory.openSession();) {
			tx = session.beginTransaction();
			session.save(leafDTO);
			tx.commit();
		} catch (HibernateException e) {
			tx.rollback();
			e.printStackTrace();
		}
	}
}
