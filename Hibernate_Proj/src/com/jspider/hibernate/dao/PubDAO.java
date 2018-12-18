package com.jspider.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.jspider.hibernate.dto.PubDTO;

public class PubDAO {

	public void savePub(PubDTO dto) {
		// COMPONENT-1
		Configuration conf = new Configuration();
		conf.configure();
		// COMPONENT-2
		SessionFactory factory = conf.buildSessionFactory();
		// COMPONENT-3
		Session session = factory.openSession();
		// SUB-COMPONENT 1 OF SESSION
		Transaction tx = session.beginTransaction();

		session.save(dto);

		tx.commit();

		System.out.println(dto.getPubName() + " saved successfully");
	}
}
