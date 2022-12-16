package com.code.main.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.code.main.model.Product;

@RestController
@RequestMapping("/product/")
public class ProductController {

	@GetMapping
	public ResponseEntity<List<Product>> getListOfProduct() {

		List<Product> products = Arrays.asList(new Product(111, "laptop", 34000), new Product(222, "Processor", 8000),
				new Product(222, "Mobile&Accessories", 10000));

		return new ResponseEntity<List<Product>>(products, HttpStatus.OK);
	}

	// springboot pathvariable

	@GetMapping("{id}/{product-name}/{amount}")
	public Product productPathVariable(@PathVariable int id, @PathVariable("product-name") String productName,
			@PathVariable int amount) {

		return new Product(id, productName, amount);
	}

	// SpringBoot RequestPram

	@GetMapping("asc")
	public Product requestProductPram(@RequestParam int id) {

		return new Product(id, "Lenovo", 35000);
	}

	@PostMapping("save")
	@ResponseStatus(HttpStatus.CREATED)
	public Product saveProduct(@RequestBody Product product) {

		System.out.println(product.getId());
		System.out.println(product.getProductName());
		System.out.println(product.getAmount());

		return product;
	}

}
