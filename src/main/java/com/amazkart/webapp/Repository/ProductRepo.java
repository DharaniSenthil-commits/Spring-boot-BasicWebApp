package com.amazkart.webapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amazkart.webapp.Model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer>{

}
