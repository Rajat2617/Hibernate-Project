package com.jspiders.hibernate.gmailApp.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.jspider.hibernate.util.HibernateUtil;
import com.jspiders.hibernate.gmailApp.dto.GmailAppDTO;

public class GmailAppDAO {

	private SessionFactory factory = HibernateUtil.getSessionFactory();

	public void saveGamilApp(GmailAppDTO gmailAppDTO) {
		Transaction tx = null;
		try (Session session = factory.openSession()) {
			tx = session.beginTransaction();
			session.save(gmailAppDTO);
			tx.commit();
		} catch (HibernateException e) {
			tx.rollback();
			e.printStackTrace();
		}

	}
}
