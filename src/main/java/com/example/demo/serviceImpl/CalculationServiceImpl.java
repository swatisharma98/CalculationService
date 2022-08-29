package com.example.demo.serviceImpl;

import java.util.UUID;

import com.example.demo.controller.proxy.CalculationProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.CalculationPojo;
import com.example.demo.service.CalculationService;


@Service
public class CalculationServiceImpl implements CalculationService{
	
	@Autowired
	RestTemplate restTemplate;

	@Autowired
	private CalculationProxy calculationProxy;
	

	@Override
	public CalculationPojo findPrice(String item, Integer quant) {
		
//		CalculationPojo pojo = restTemplate.getForObject(
//				   "http://localhost:9091/item/{item}/quant/{quant}", CalculationPojo.class, item, quant);
		CalculationPojo pojo=calculationProxy.findByItemAndQuantity(item,quant);
		pojo.setId(UUID.randomUUID().toString());
		
		return pojo;
	}

}
