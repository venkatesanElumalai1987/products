package com.tech.products.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tech.products.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
