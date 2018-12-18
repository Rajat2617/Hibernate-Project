package com.jspider.gun.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.jspider.gun.dto.GunDTO;
import com.jspider.hibernate.util.HibernateUtil;

public class GunDAO {

	private SessionFactory factory = HibernateUtil.getSessionFactory();

	public Integer saveGun(GunDTO gunDTO) {
		Session session = null;
		Transaction transaction = null;
		Integer identifier = null;
		try {
			session = factory.openSession();
			transaction = session.beginTransaction();
			identifier = (Integer) session.save(gunDTO);
			transaction.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return identifier;
	}

	// Fetching row
	public String getGunTypeByName(String gunName) {
		String gunType = null;
		String hql = "SELECT gun.gunType FROM GunDTO gun WHERE gun.gunName=:name";

		try (Session session = factory.openSession();) {
			Query query = session.createQuery(hql);
			// In Hibernate "placeholder" starts with ZERO/0
			// In Hibernate setParameter is replaced with setXXX();
			// i.e; NamedParameter in place of PositonalParameter
			query.setParameter("name", gunName); // work as key and value
			gunType = (String) query.uniqueResult();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return gunType;
	}

	public GunDTO getGunByName(String gunName) {
		GunDTO gunDTO = null;
		String hql = "SELECT gun FROM GunDTO gun WHERE gun.gunName=:name";

		try (Session session = factory.openSession();) {
			Query query = session.createQuery(hql);
			// In Hibernate "placeholder" starts with ZERO/0
			// In Hibernate setParameter is replaced with setXXX();
			// i.e; NamedParameter in place of PositonalParameter
			query.setParameter("name", gunName); // work as key and value
			gunDTO = (GunDTO) query.uniqueResult();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return gunDTO;
	}

}
