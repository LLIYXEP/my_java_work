package com.scurtu.scool.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.scurtu.scool.domain.Order;
import com.scurtu.scool.repository.OrderRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/orders")
public class OrderController {
	
	@Autowired
	private OrderRepository orderRepository;

	@GetMapping("/current")
	public String orderForm(Model model) {
		model.addAttribute("order", new Order());
		return "orderForm";
	}
	
	@PostMapping
	public String processOrder(@Valid Order order, Errors errors) {
		
		if (errors.hasErrors()) {
			return "orderForm";
		}
		
		log.info("Order submitted: " + order);
		orderRepository.save(order);
		return "redirect:/orders/current";
	}
}
