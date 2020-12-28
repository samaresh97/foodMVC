package com.mindtree.foodApp.foodControllerTest;


import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.mindtree.foodApp.controller.FoodController;
import com.mindtree.foodApp.entity.Food;
import com.mindtree.foodApp.service.FoodService;

//@RunWith(MockitoJUnitRunner.class)
//@WebMvcTest(FoodController.class)
@SpringBootTest
class TestFoodController {
	
//	@InjectMocks
//	private FoodController foodController;
	@Mock
	private FoodService foodService;
	

	
	@Test
	public void saveFoodTest() {
		Food food=new Food();
		food.setFoodId(1);
		food.setFoodName("biriyani");
		food.setPrice(180);
		food.setType("non veg");
		
		when(foodService.saveFood(food)).thenReturn(food);
		assertEquals( "biriyani",foodService.saveFood(food).getFoodName());
		
	}
	@Test
	public void getAllFoodTest() {
		List<Food> foods=new ArrayList<Food>();
		Food food=new Food();
		food.setFoodId(1);
		food.setFoodName("biriyani");
		food.setPrice(180);
		food.setType("non veg");
		foods.add(food);
		food.setFoodId(2);
		food.setFoodName("momo");
		food.setPrice(100);
		food.setType("non veg");
		foods.add(food);
		food.setFoodId(3);
		food.setFoodName("veg noodles");
		food.setPrice(120);
		food.setType(" veg");
		foods.add(food);
		
		when(foodService.getAllFood()).thenReturn(foods);
		assertEquals(3, foodService.getAllFood().size());
		
	}
	@Test
	public void updateFoodTest() {
		Food food=new Food();
		food.setFoodId(1);
		food.setFoodName("biriyani2");
		food.setPrice(500);
		food.setType("non veg");
		
		when(foodService.updateFood(1)).thenReturn(food);
		assertEquals( "biriyani2",foodService.updateFood(1).getFoodName());
		
	}

}
