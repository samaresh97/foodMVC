package com.mindtree.foodApp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

import io.micrometer.core.lang.NonNull;

@Entity
public class Food {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  long foodId;
	@Size(min=3,message="minmum size of food must be 3")
	private String foodName;
	private String type;
	private double price;
	public Food() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getFoodId() {
		return foodId;
	}
	public void setFoodId(long foodId) {
		this.foodId = foodId;
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
