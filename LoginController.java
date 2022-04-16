package com.example.demo.controllers;
import com.example.demo.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//import com.example.demo.entities.Cart;
import com.example.demo.entities.Category;
import com.example.demo.entities.Customer;
import com.example.demo.entities.CustomerRegister;
import com.example.demo.entities.Login;
import com.example.demo.entities.LoginInfo;
import com.example.demo.entities.Order;
//import com.example.demo.entities.OrderItem;
import com.example.demo.entities.Product;
//import com.example.demo.entities.Shipper;
import com.example.demo.entities.Shipper;
import com.example.demo.services.CartService;
import com.example.demo.services.CategoryService;
import com.example.demo.services.CustomerService;
import com.example.demo.services.LoginService;
import com.example.demo.services.OrderItemService;
import com.example.demo.services.OrderService;
import com.example.demo.services.ProductsService;
//import com.example.demo.services.ShipperService;
import com.example.demo.services.ShipperService;

@CrossOrigin (origins = "http://localhost:3000")
@RestController
public class LoginController {

	@Autowired
	CategoryService catservice;
	@Autowired
	LoginService lservice;
	@Autowired
	OrderService oservice;
	@Autowired
	OrderItemService oiservice;
	@Autowired
	CartService cartservice;
	@Autowired
	CustomerService cservice;
	@Autowired
	ProductsService pservice;
	@Autowired
	ShipperService sservice;
	
	@PostMapping("/registercust")
	public Object registerCustomer(@RequestBody CustomerRegister cr)
	{	
		try {
		Login l = new Login(cr.getEmail(), cr.getPassword(),cr.getType());
				Login inserted = lservice.add(l);
				System.out.println(cr.getEmail());
				
		Customer c = new Customer(cr.getName(),cr.getEmail(),cr.getContact(),cr.getAddress(),
        cr.getCity(),inserted);
		System.out.println(cr.getName());
	
		return cservice.addcustomer(c);	

		
		}
		catch(Exception e) {
			return "customer can not be added due to invalid inputs";
		}
	}
	
	
	
	
	
	@PostMapping("/registership")
	public Object registerShipper(@RequestBody CustomerRegister cr)
	{
		try {
		Login l = new Login(cr.getEmail(), cr.getPassword(),cr.getType());
				Login inserted = lservice.add(l);
		Shipper s = new Shipper(cr.getName(),cr.getCity(),cr.getContact(),inserted);
	    return cservice.addshipper(s);
		}
	
	catch(Exception e) {
		return "customer can not be added due to invalid inputs";
	}
	}
	
	@PostMapping("/checklogin")
	public Object checkLogin(@RequestBody Login l)
	{ try {
			return (Object)lservice.getLoggedInUserInfo(l.getUseremail(), l.getPassword()) ;	
	}
	catch(Exception e) {
		return "could not login";
	}
	}

	
	@PostMapping("/admin/checklogin")
	public Object checkAdminLogin(@RequestBody Login l)
	{ 
		if(l.getUseremail().equals("admin@gmail.com") && l.getPassword().equals("admin@123"))
			return "login successful";	

		else 
			return "could not login";
	      
	}
	
	
	
	
	
	
	
//	@GetMapping("/cart")
//	public List<Cart> getCartItems(int cid) {
//		   
//		return  cartservice.findbyCustomer(cid);
//		
//	}
    //for post method
//		@PostMapping("/addtocart")
//		public String addToCart(@RequestBody Cart c) {
//			try {
//	       cartservice.addToCart(c);
//	       return "Product added to cart Successfully";
//			}
//			catch(Exception e) {
//				return "could not add product to cart";
//			}
//	}
//		
//	

		
		
		//get or post method you decide
		//for get method
//		@GetMapping("/getOrderDetails")
//		public List<OrderItem> getOrderDetails(int oid) {
//			   
//			return  oiservice.findbyOrder( oid);
//			
//		}
//	    //for post method
//			@PostMapping("/addOrderItems")
//			public String addOrderItem(@RequestBody OrderItem oi) {
//				
//			try {
//		       oiservice.addOrederItems(oi);
//		       return "Product added to cart Successfully";
//
//			}
//			catch(Exception e){
//				return "Order did not get added";
//			}
//			
//		}
//	@GetMapping("/changepassword")
//	public void changepassword(@RequestParam ("password") String password, @RequestParam ("useremail") String useremail)
//	{
//		lservice.changePassword(password,useremail);
//	}
//	@PostMapping("/changepassword")
//	public void changepassword1(@RequestBody Login l)
//	{
//		lservice.changePassword(l.getPassword(), l.getUseremail());
//	}
//	@GetMapping("/checkpassword")
//	public String checkPassword(String useremail)
//	{
//		return lservice.checkPassword(useremail);
//	}
//	@PostMapping("/checkpassword")
//	public String checkPassword1(String useremail) {
//		return lservice.checkPassword(useremail);
//	}
//	
//	@PostMapping("/addproduct")
//	public String
}
