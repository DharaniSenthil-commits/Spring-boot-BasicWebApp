package com.amazkart.webapp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amazkart.webapp.Model.Product;
import com.amazkart.webapp.Service.ProductService;

@RestController
public class ProductController {
	@Autowired
	ProductService Service;
	
	@GetMapping("/products")
	public List<Product> getProducts() {
		return Service.getProducts();
		}
	
	
	@GetMapping("/products/{prodId}")
	public Product getProductById(@PathVariable int prodId) {
		System.out.print(prodId);
		return Service.getProductById(prodId);
		
	}
	
	@PostMapping("/products")
	public void addProduct(@RequestBody Product prod) {
		System.out.print(prod);
		Service.addProduct(prod);
	}
	
	@PutMapping("/products")
	public void updateProduct(@RequestBody Product prod) {
		Service.updateProduct(prod);
		
	}
	
	@DeleteMapping("/products/{prodId}")
    public void deleteProduct(@PathVariable int prodId) {
		Service.deleteProduct(prodId);
		
	}
}
