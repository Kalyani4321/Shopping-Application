package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Category;
import com.example.demo.services.CartService;
import com.example.demo.services.CategoryService;
import com.example.demo.services.CustomerService;
import com.example.demo.services.LoginService;
import com.example.demo.services.OrderItemService;
import com.example.demo.services.OrderService;
import com.example.demo.services.ProductsService;
import com.example.demo.services.ShipperService;

@CrossOrigin (origins = "http://localhost:3000")
@RestController
public class CategoryController {

	@Autowired
	CategoryService catservice;
	@Autowired
	LoginService lservice;
	@Autowired
	OrderService oservice;
	@Autowired
	OrderItemService oiservice;
//	@Autowired
//	CartService cartservice;
	@Autowired
	CustomerService cservice;
	@Autowired
	ProductsService pservice;
	@Autowired
	ShipperService sservice;
	
	
	@GetMapping("/getAllCategory")
	public List<Category> getProductCategory()
	{
		return catservice.getcategory();
	}
	
	@PostMapping("/addcategory")
	public String addProduct(Category cat)
	{
		try {
			Category category= new Category(cat.getCategory_name(),cat.getCat_image());
			catservice.addcategory(category);
			return "Category added successfully";

		}
		catch(Exception e) {
			return "could not add category";
		}
	}
	
	
}
