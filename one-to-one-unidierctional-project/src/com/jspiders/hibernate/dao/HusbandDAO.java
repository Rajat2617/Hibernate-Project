package com.jspiders.hibernate.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.jspider.hibernate.util.HibernateUtil;
import com.jspiders.hibernate.dto.HusbandDTO;
import com.jspiders.hibernate.dto.WifeDTO;

public class HusbandDAO {

	private SessionFactory factory = HibernateUtil.getSessionFactory();

	public void saveHusband(HusbandDTO husbandDTO, WifeDTO wifeDTO) {
		Transaction transaction = null;
		try (Session session = factory.openSession()) {
			transaction = session.beginTransaction();
			session.save(husbandDTO);
			session.save(wifeDTO);
			transaction.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			transaction.rollback();
		}
	}
}
