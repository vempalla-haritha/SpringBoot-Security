package com.pack.SpringBootSecurity.repository;

import org.springframework.data.repository.CrudRepository;

import com.pack.SpringBootSecurity.model.Product;



public interface ProductRepsitory extends CrudRepository<Product, Integer> {

}
