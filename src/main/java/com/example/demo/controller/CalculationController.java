package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.CalculationPojo;
import com.example.demo.service.CalculationService;

@RestController
public class CalculationController {
	
	
	@Autowired
	CalculationService calculationService;
	
	@GetMapping("/calculate/{item}/{quant}")
	private CalculationPojo findCalculatedPrice(@PathVariable String item, @PathVariable(required=false)  Integer quant) {
		
		
		return calculationService.findPrice(item,quant);
		
	}

}
