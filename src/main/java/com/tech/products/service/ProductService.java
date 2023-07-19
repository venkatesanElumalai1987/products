package com.tech.products.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.tech.products.dao.ProductDao;
import com.tech.products.entity.Product;

@Service
public class ProductService {
	@Autowired
	ProductDao pdao;
	public String setProduct(Product p)
	{
		return pdao.setProduct(p);
	}
	public String setAllProduct(List<Product>p )
	{
		return pdao.setAllProduct(p);
	}
	public Product getProductById(Integer pid)
	{
		return pdao.getProductById(pid);
	}
	public List<Product>getAllProduct()
	{
		return pdao.getAllProduct();
	}

}
