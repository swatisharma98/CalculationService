package com.example.demo.service;

import com.example.demo.model.CalculationPojo;

public interface CalculationService {

	CalculationPojo findPrice(String item, Integer quant);

}
