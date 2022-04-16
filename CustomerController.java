package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.CartService;
import com.example.demo.services.CategoryService;
import com.example.demo.services.CustomerService;
import com.example.demo.services.LoginService;
import com.example.demo.services.OrderItemService;
import com.example.demo.services.OrderService;
import com.example.demo.services.ProductsService;
import com.example.demo.services.ShipperService;

@CrossOrigin (origins = "http://localhost/:3000")
@RestController
public class CustomerController {
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
	/*@GetMapping("/checklogin")
	public String checkLogin(@RequestParam ("username") String username,@RequestParam ("password") String password)
	{
			return cservice.getLogin(username, password);
		
		

	}*/
}
