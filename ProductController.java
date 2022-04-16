package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Product;
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
public class ProductController {

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
	
	@GetMapping("product")
	public Product getProduct(@RequestParam ("prod_id") int prod_id ) {
		return pservice.getProductById(prod_id);
	}
	
	@GetMapping("/productsByCategory")
	public List<Product> getProductByCategory(@RequestParam("cat_id") int catid)
	{ 
		try {
		System.out.println(catid);
			return pservice.getProductByCategory(catid) ;
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
			
	} 
	
	@GetMapping("/allproducts")
	public List<Product> getProducts()
	{
		return cservice.getproducts();
	}
	
	@GetMapping("/searchproduct")
	public List<Product> searchProducts(@RequestParam ("search") String prodname)
	{
		try {
		return pservice.searchProduct(prodname);
		}
		catch(Exception e) {
			return null;
		}
	}
	
	@PostMapping("/addproduct")
	public String addProduct(@RequestBody Product p) {
		try {
			System.out.println(p.getCat_id());

			Product prod= new Product( p.getProd_name(),p.getProd_image(),p.getProd_desc(),p.getPrice(),p.getQty(),p.getCat_id());
       pservice.addProduct(prod);
       return "Product added  Successfully";
		}
		catch(Exception e) {
			return "could not add product to cart";
		}
}
	
	@GetMapping("/deleteproduct")
	public String deleteProduct(@RequestParam ("prod_id") int prodid)
	{
		try {
			pservice.deleteProduct(prodid);
			return "Product deleted successfully";

		}
		catch(Exception e) {
			return "could not delete product";
		}
	}
	
	
}
