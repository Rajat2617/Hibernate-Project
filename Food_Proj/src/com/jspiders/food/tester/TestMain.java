package com.jspiders.food.tester;

import com.jspiders.food.dao.FoodDAO;
import com.jspiders.food.dto.FoodDTO;

public class TestMain {

	public static void main(String[] args) {

		 FoodDTO foodDTO = new FoodDTO();
		
		 foodDTO.setFoodID(4);
		 foodDTO.setFoodName("Chicken-Rolls");
		 foodDTO.setFoodType("Non-Veg");
		 foodDTO.setQuantity(100.89);
		 foodDTO.setPrice(199.70);
		
		 FoodDAO foodDAO = new FoodDAO();
		 foodDAO.saveFood(foodDTO);

		// FoodDAO foodDAO = new FoodDAO();
		// FoodDTO foodDTO = foodDAO.getFoodById(2);
		// System.out.println("food name: " + foodDTO.getFoodName());
		// System.out.println("food type: " + foodDTO.getFoodType());

//		FoodDAO foodDAO = new FoodDAO();
//		foodDAO.updateFoodPriceById(000.00, 2);

//		 FoodDAO foodDAO = new FoodDAO();
//		 foodDAO.deleteFoodById(2);

	}

}
