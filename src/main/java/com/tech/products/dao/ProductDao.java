package com.tech.products.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.tech.products.entity.Product;
import com.tech.products.repository.ProductRepository;
@Repository
public class ProductDao {
	@Autowired
	ProductRepository pRepo;
	public String setProduct(Product p)
	{
		pRepo.save(p);
		return "Successfully Injected ";
	}
	public String setAllProduct( List<Product>p )
	{
		pRepo.saveAll(p);
		return "Successfully Injected All the Values";
	}
	public Product getProductById(Integer pid)
	{
		return pRepo.findById(pid).get();
	}
	public List<Product>getAllProduct()
	{
		return pRepo.findAll();
	}

	

}
