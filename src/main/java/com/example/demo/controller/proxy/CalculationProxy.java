package com.example.demo.controller.proxy;

import com.example.demo.model.CalculationPojo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "ItemPriceService")
public interface CalculationProxy {

    @GetMapping("/item/{item}/quant/{quant}")
    public CalculationPojo findByItemAndQuantity(@PathVariable(value = "item") String item, @PathVariable(value = "quant") Integer quant);
}
