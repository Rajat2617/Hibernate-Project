package com.jspiders.food.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "food_table")
public class FoodDTO implements Serializable {

	@Id
	@GenericGenerator(name = "auto", strategy = "increment") // it will create an object of IncrementGenerator auto =
																// Select max(pk) from table_name +1
	@GeneratedValue(generator = "auto")
	@Column(name = "food_id")
	private int foodID;
	@Column(name = "food_type")
	private String foodType;
	@Column(name = "quantity")
	private double quantity;
	@Column(name = "price")
	private double price;
	@Column(name = "food_name")
	private String foodName;

	public FoodDTO() {
		System.out.println(this.getClass().getSimpleName() + " object created");
	}

	public int getFoodID() {
		return foodID;
	}

	public void setFoodID(int foodID) {
		this.foodID = foodID;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	@Override
	public String toString() {
		return "FoodDTO [foodID=" + foodID + ", foodType=" + foodType + ", quantity=" + quantity + ", price=" + price
				+ ", foodName=" + foodName + "]";
	}

}
