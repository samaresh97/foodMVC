package com.mindtree.foodApp.service;

import java.util.List;

import com.mindtree.foodApp.entity.Food;

public interface FoodService {

	List<Food> getAllFood();

	Food updateFood(long id);

	Food saveFood(Food food);

}
