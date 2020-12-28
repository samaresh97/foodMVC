package com.mindtree.foodApp.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mindtree.foodApp.entity.Food;
import com.mindtree.foodApp.service.FoodService;

@Controller
public class FoodController {
	@Autowired
	 private FoodService foodService;
	
	
	@RequestMapping("/")
	public String goIndex() {
		return "index";
	}
	@RequestMapping("/addFood")
	public ModelAndView newFood() {
		ModelAndView mav=new ModelAndView("addFood");
		Food food=new Food();
		mav.addObject("food", food);
		return mav;
	}
	
	@RequestMapping("/showFood")
	public ModelAndView showFoodList() {
		ModelAndView mav=new ModelAndView("foodDetails");
		List<Food> flist=foodService.getAllFood();
		mav.addObject("flist", flist);
		return mav;
	}
	@RequestMapping("/edit")
	public ModelAndView updateFood(@RequestParam  long id)
	{
		ModelAndView mav=new ModelAndView("edit");
		Food food=foodService.updateFood(id);
		mav.addObject("command", food);
		return mav;
	}
	@RequestMapping(value="/save",method = RequestMethod.POST)
	public String saveFood(@Valid @ModelAttribute("food") Food food,  BindingResult br) {
		
		if(br.hasErrors()) {
			return "addFood";
		}
		else {
		foodService.saveFood(food);
		return "redirect:/showFood";
		}
		
	}
	

}
