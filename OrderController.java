package com.example.demo.controllers;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Customer;
import com.example.demo.entities.Order;
import com.example.demo.entities.Product;
import com.example.demo.entities.Shipper;
//import com.example.demo.services.CartService;
import com.example.demo.services.CategoryService;
import com.example.demo.services.CustomerService;
import com.example.demo.services.LoginService;
import com.example.demo.services.OrderItemService;
import com.example.demo.services.OrderService;
import com.example.demo.services.ProductsService;
import com.example.demo.services.ShipperService;

@CrossOrigin (origins = "http://localhost:3000")
@RestController
public class OrderController {

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
	
	@GetMapping("/admin/getorders")
	public List<Order> getOrders()
	{
			return oservice.getOrders() ;
			
	}
	
	@GetMapping("orders")
	public List<Order> getOrderByCustId(@RequestParam ("cust_id") int cust_id)
	{
			return oservice.getOrderByCustId(cust_id) ;
			
	}
	
	@GetMapping("/getShipperOrders")
	public List<Order> getShipperOrderDetails()
	{
			return oservice.getShipperOrders() ;
			
	} 
	
	
	@PostMapping("/order")
	public Order placeOrder (@RequestBody Order o)
	{	int ship_id;
	Shipper shipper;
	    int custid= o.getCust_id();
	    System.out.println(o.getCust_id());
	    System.out.println(o.getAmount());
	    System.out.println(o.getQuantity());
	    System.out.println(o.getProd_id());

	   Customer customer = cservice.getcustInfo(custid);
	  
	   try {
		 ship_id= sservice.getShipperByCity(customer.getCity());
		 shipper = (Shipper) sservice.getShipperInfo(ship_id);
	   }
	   catch(Exception e){
		    ship_id= 1;
			 shipper = (Shipper) sservice.getShipperInfo(ship_id);

	   }
		int prod_id=o.getProd_id();
		Product product= pservice.getProductById(prod_id);
		
		String status="ordered";
		
		int quantity=o.getQuantity();
		
		String orderdate;
	    String deliverydate;
	    
		Date date= new Date();
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DATE, 7);
		
		
	    orderdate=dateFormat.format(date);
	    deliverydate=dateFormat.format(c.getTime());
					
					Order order = new Order(o.getAmount(),status,orderdate,deliverydate,quantity,custid,ship_id, prod_id,product,customer,shipper);

				
		return oservice.addOrder(order);		
	}
}
