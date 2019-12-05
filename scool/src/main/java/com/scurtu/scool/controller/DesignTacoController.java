package com.scurtu.scool.controller;

import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.scurtu.scool.domain.Ingredient;
import com.scurtu.scool.domain.Ingredient.Type;
import com.scurtu.scool.domain.Taco;
import com.scurtu.scool.repository.IngredientRepository;
import com.scurtu.scool.repository.TacoRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/design")
@SessionAttributes("order")
public class DesignTacoController {
	
	@Autowired
	private IngredientRepository ingredientRepo;
	
	@Autowired
	private TacoRepository tacoRepository;

	@GetMapping
	public String showDesignForm(Model model) {
		
		List<Ingredient> ingredients = Arrays.asList();
		
		
		model.addAttribute("ingredients", ingredients);
	
		model.addAttribute("taco", new Taco());
		
		return "design";
	}
	
	@PostMapping
	public String processDesign(@Valid @ModelAttribute Taco taco, Errors errors) {
		
		if (errors.hasErrors()) {
			return "design";
		}
		
		log.info("Processing design: " + taco);
		tacoRepository.save(taco);
		return "redirect:/orders/current";
	}
	
	
}
