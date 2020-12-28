package com.mindtree.foodApp.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.foodApp.entity.Food;
import com.mindtree.foodApp.repository.FoodRepository;
import com.mindtree.foodApp.service.FoodService;
@Service
public class FoodServiceImpl implements FoodService {
	@Autowired
 private FoodRepository foodRepo;

	@Override
	public List<Food> getAllFood() {
		return foodRepo.findAll();
	}

	@Override
	public Food updateFood(long id) {
		return foodRepo.findById(id).get();
	}

	@Override
	public Food saveFood(Food food) {
		
		return foodRepo.save(food);
	}
}
