//package com.example.demo.entities;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "cart")
//public class Cart {
//
//    @Id
//    @GeneratedValue(strategy=GenerationType.IDENTITY)
//    private int cartid;
//
//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name="prod_id",insertable=false, updatable=false)
//    private Product  prod_id;
//    
//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name="cust_id",insertable=false, updatable=false)
//    private Customer  cust_id;
//    
//    @Column
//    private int quantity;
//    @Column
//    private double price;
//
//	public Cart() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	public Cart(Product prod_id, Customer cust_id, int quantity, double price) {
//		super();
//		this.prod_id = prod_id;
//		this.cust_id = cust_id;
//		this.quantity = quantity;
//		this.price = price;
//
//	}
//
//	public int getCartid() {
//		return cartid;
//	}
//
//	public void setCartid(int cartid) {
//		this.cartid = cartid;
//	}
//
//	public Product getProd_id() {
//		return prod_id;
//	}
//
//	public void setProd_id(Product prod_id) {
//		this.prod_id = prod_id;
//	}
//
//	public double getPrice() {
//		return price;
//	}
//
//	public void setPrice(double price) {
//		this.price = price;
//	}
//
//	public Customer getCust_id() {
//		return cust_id;
//	}
//
//	public void setCust_id(Customer cust_id) {
//		this.cust_id = cust_id;
//	}
//
//	public int getQuantity() {
//		return quantity;
//	}
//
//	public void setQuantity(int quantity) {
//		this.quantity = quantity;
//	}
//
//	@Override
//	public String toString() {
//		return "Cart [cartid=" + cartid + ", quantity=" + quantity + "]";
//	}
//    
//}
//
//
//
