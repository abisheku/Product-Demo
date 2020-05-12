package com.products.controller;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.products.model.ConfigDetails;
import com.products.model.ProductInfo;

@RestController
@RequestMapping(path = "/api")
public class ProductController {

	private static final String productTemplate = "%s is the product";
	private static final String configTemplate = "%s is the configDetails";
	private final AtomicInteger productCounter = new AtomicInteger();
	private final AtomicInteger configCounter = new AtomicInteger();

	@GetMapping("/getProductDetails")
	public ProductInfo productInfo(@RequestParam(value = "name", defaultValue = "TestProduct") String name) {
		return new ProductInfo(productCounter.incrementAndGet(), String.format(productTemplate, name));
	}

	@GetMapping("/getConfigDetails")
	public ConfigDetails configDetails(@RequestParam(value = "name", defaultValue = "TestConfig") String name) {
		return new ConfigDetails(configCounter.incrementAndGet(), String.format(configTemplate, name));
	}

}
