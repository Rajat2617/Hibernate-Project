package com.jspider.food.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.jspider.food.dto.FoodDTO;
import com.jspider.hibernate.util.HibernateUtil;

public class FoodDAO {

	private SessionFactory factory = HibernateUtil.getSessionFactory();

	public void saveFood(FoodDTO foodDTO) {
		Session session = null;
		Transaction transaction = null;
		try {
			session = factory.openSession();

			transaction = session.beginTransaction();

			System.out.println(foodDTO);
			session.save(foodDTO);

			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public FoodDTO getFoodById(int primaryKey) {
		FoodDTO foodDTO = null;
		// Try with Resources
		try (Session session = factory.openSession();) {
			foodDTO = session.get(FoodDTO.class, new Integer(primaryKey));
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return foodDTO;
	}

	public void updateFoodPriceById(double price, int primaryKey) {
		FoodDTO foodDTO = null;
		Transaction transaction = null;
		// Try with Resources
		try (Session session = factory.openSession();) {
			transaction = session.beginTransaction();
			foodDTO = session.get(FoodDTO.class, new Integer(primaryKey));
			foodDTO.setPrice(price);
			session.update(foodDTO);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		}
	}

	public void deleteFoodById(int primaryKey) {
		FoodDTO foodDTO = null;
		Transaction transaction = null;
		// Try with Resources
		try (Session session = factory.openSession();) {
			transaction = session.beginTransaction();
			foodDTO = session.load(FoodDTO.class, new Integer(primaryKey));
			foodDTO.setFoodID(primaryKey);
			session.delete(foodDTO);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		}
	}
}
