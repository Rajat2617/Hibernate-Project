package com.jspiders.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.jspiders.hibernate.dto.RelationShipDTO;

public class RelationShipDAO {

	public void saveRelationShip(RelationShipDTO relationShipDTO) {
		Configuration cfg = new Configuration();
		cfg.configure();

		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();

		session.save(relationShipDTO);
		tx.commit();
	}
	
	/*
	static{
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
	}*/

}
