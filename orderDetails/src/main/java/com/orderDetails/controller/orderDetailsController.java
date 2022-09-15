package com.orderDetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orderDetails.application.*;
import com.orderDetails.repository.*;

@RestController
@RequestMapping("/order")
public class orderDetailsController {
	
	@Autowired
	private orderRepository orderRepository;
	private addressRepository addressRepository;
	private statusRepository statusRepository;
	
	@PostMapping("/")
	public order saveOrder(@RequestBody order order) {
		return this.orderRepository.save(order);
	}
	
	
	@GetMapping("/")
	public List<order> getAllOrder(){
		return this.orderRepository.findAll();
	}

	
	@PostMapping("/")
	public address saveAddress(@RequestBody address address) {
		return this.addressRepository.save(address);
	}
	
	
	@GetMapping("/")
	public List<address> getAllAddress(){
		return this.addressRepository.findAll();
	}
	
	@PostMapping("/")
	public status saveStatus(@RequestBody status status) {
		return this.statusRepository.save(status);
	}
	
	
	@GetMapping("/")
	public List<status> getAllstatus(){
		return this.statusRepository.findAll();
	}
}