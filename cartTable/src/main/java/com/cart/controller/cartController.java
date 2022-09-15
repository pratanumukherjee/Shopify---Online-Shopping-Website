package com.cart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cart.cartTable.*;
import com.cart.repository.*;

@RestController
@RequestMapping("/cart_tble")
public class cartController {
	
	@Autowired
	private cartRepository cartRepository;
	
	@PostMapping("/")
	public CartTableApplication saveCart(@RequestBody CartTableApplication cart) {
		return this.cartRepository.save(cart);
	}
	
	
	@GetMapping("/")
	public List<CartTableApplication> getAllCart(){
		return this.cartRepository.findAll();
	}

}