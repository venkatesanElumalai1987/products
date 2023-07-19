package com.tech.products.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.tech.products.entity.Product;
import com.tech.products.service.ProductService;

@RestController
public class ProductController {
@Autowired
ProductService pser;
@PostMapping(value="/setProduct")
public String setProduct(@RequestBody Product p)
{
	return pser.setProduct(p);
}
@PostMapping(value="/setAllProduct")
public String setAllProduct(@RequestBody List<Product>p )
{
	return pser.setAllProduct(p);
}
@GetMapping(value="/findPId/{pid}")
public Product getProductById(@PathVariable Integer pid)
{
	return pser.getProductById(pid);
}
@GetMapping(value="/findallpId")
public List<Product>getAllProduct()
{
	return pser.getAllProduct();
}



}
