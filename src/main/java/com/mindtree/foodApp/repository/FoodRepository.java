package com.mindtree.foodApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.foodApp.entity.Food;
@Repository
public interface FoodRepository extends JpaRepository<Food, Long> {

}
