package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.example.demo.entities.Cart;
import com.example.demo.entities.Customer;
import com.example.demo.entities.Product;
import com.example.demo.entities.Shipper;
//import com.example.demo.repositories.CartRepository;
import com.example.demo.repositories.CustomerRepository;
import com.example.demo.repositories.ProductRepository;

@Service
public class CartService {
	
//	@Autowired
//	CartRepository cartrepo;
//	@Autowired
//	ProductRepository prepo;
//	@Autowired
//	CustomerRepository crepo;
	
//	public List<Cart> findbyCustomer(int cid) {
//		return cartrepo.findbyCustomer(cid);
//	}
//	
//	public String addToCart(Cart c) {
//	     try{
//	    	 int cid= c.getCust_id().getCust_id();
//	    	 int pid = c.getProd_id().getProd_id(); 
//	    	int qty=c.getQuantity();
//	    	Cart cart = new Cart();
//	    
//	    	cart.setQuantity(qty);
//	    	cartrepo.addtoCart(qty,cid,pid);
//	     return "added to cart";}
//	     catch(Exception e) {
//	    	 return "could not add to cart";
//	     }
//	}
	
	
}

