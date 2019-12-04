package com.scurtu.scool.controller;

import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.scurtu.scool.domain.Ingredient;
import com.scurtu.scool.domain.Ingredient.Type;
import com.scurtu.scool.domain.Taco;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/design")
public class DesignTacoController {

	@GetMapping
	public String showDesignForm(Model model) {
		
		List<Ingredient> ingredients = Arrays.asList(
		
		new Ingredient("FLTO", "Flour Tortilla", Type.WRAP),
		new Ingredient("COTO", "Corn Tortilla", Type.WRAP),
		new Ingredient("GRBF", "Ground Beef", Type.PROTEIN),
		new Ingredient("CARN", "Carnitas", Type.PROTEIN),
		new Ingredient("TMTO", "Diced Tomates", Type.VEGGIES),
		new Ingredient("LETC", "Lettuche", Type.CHEESE),
		new Ingredient("CHED", "Chedar", Type.CHEESE)
		
		);
		
		model.addAttribute("ingredients", ingredients);
		
//		Type[] types = Ingredient.Type.values();
//		for (Type type : types) {
//			model.addAttribute(type.toString().toLowerCase(), filterByType(ingredients, new Taco()));
//		}
//		
		model.addAttribute("taco", new Taco());
		
		return "design";
	}
	
	@PostMapping
	public String processDesign(@Valid Taco taco, Errors errors) {
		
		if (errors.hasErrors()) {
			return "design";
		}
		
		log.info("Processing design: " + taco);
		
		return "redirect:/orders/current";
	}
	
	
}
