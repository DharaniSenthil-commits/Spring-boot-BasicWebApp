package com.amazkart.webapp.Service;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.amazkart.webapp.Model.Product;
import com.amazkart.webapp.Repository.ProductRepo;

@Service
public class ProductService {
	
	@Autowired
	ProductRepo repo;
	
//	List<Product> products=new ArrayList<>(Arrays.asList(
//			new Product(1,"MacBook",50000),
//			new Product(2,"Dell",40000),
//			new Product(3,"Lenova",30000)));
//			

	public List<Product> getProducts(){
		return repo.findAll();
		}


	public Product getProductById(int prodId) {
		return repo.findById(prodId).orElse(new Product());
				}
	
	public void addProduct(Product prod) {
		repo.save(prod);
	}


	public void updateProduct(Product prod) {
		repo.save(prod);
	}


	public void deleteProduct(int prodId) {
		repo.deleteById(prodId);
	}
	
	
	
}
 
