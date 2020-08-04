package com.learn.boot.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.boot.model.Customer;

@RestController
@RequestMapping("/customers")
public class CustomerAPI {

	@RequestMapping("/list")
	public List<Customer> hello() {
		return Arrays.asList(new Customer("1","Raj","Pune"), new Customer("2","John","Europe")				
		);
	}
}
