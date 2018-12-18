package com.jspider.food.tester;

import com.jspider.food.dao.FoodDAO;
import com.jspider.food.dto.FoodDTO;

public class TestFood {

	public static void main(String[] args) {

		FoodDTO foodDTO = new FoodDTO();

		foodDTO.setFoodName("Veg-Rolls");
		foodDTO.setFoodType("Veg");
		foodDTO.setQuantity(100.89);
		foodDTO.setPrice(99.70);

		FoodDAO foodDAO = new FoodDAO();
		foodDAO.saveFood(foodDTO);

		// FoodDAO foodDAO = new FoodDAO();
		// FoodDTO foodDTO = foodDAO.getFoodById(2);
		// System.out.println("food name: " + foodDTO.getFoodName());
		// System.out.println("food type: " + foodDTO.getFoodType());

		// FoodDAO foodDAO = new FoodDAO();
		// foodDAO.updateFoodPriceById(000.00, 2);

		// FoodDAO foodDAO = new FoodDAO();
		// foodDAO.deleteFoodById(2);

	}
}
