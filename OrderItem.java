//package com.example.demo.entities;
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//@Entity
//@Table(name = "orderitem")
//public class OrderItem {
//
//    @Id
//    @GeneratedValue(strategy=GenerationType.IDENTITY)
//    private int orderitemid;
//
//    @ManyToOne (cascade = CascadeType.ALL)
//    @JoinColumn(name="prod_id" ,insertable=false, updatable=false)
//    private Product  prod_id;
//    
//    @ManyToOne (cascade = CascadeType.ALL)
//    @JoinColumn(name="oid" ,insertable=false, updatable=false)
//    private Order oid;
//    
//    @Column
//    private int quantity;
//
//	
//
//	public OrderItem() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//
//
//	public OrderItem(Product prod_id, Order oid, int quantity) {
//		super();
//		this.prod_id = prod_id;
//		this.oid = oid;
//		this.quantity = quantity;
//	}
//
//
//
//	public int getOrderitemid() {
//		return orderitemid;
//	}
//
//	public void setOrderitemid(int orderitemid) {
//		this.orderitemid = orderitemid;
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
//
//
//	public Order getOid() {
//		return oid;
//	}
//
//
//
//	public void setOid(Order oid) {
//		this.oid = oid;
//	}
//
//
//
//	public int getQuantity() {
//		return quantity;
//	}
//
//
//
//	public void setQuantity(int quantity) {
//		this.quantity = quantity;
//	}
//
//
//
//	@Override
//	public String toString() {
//		return "OrderItem [orderitemid=" + orderitemid + ", quantity=" + quantity + "]";
//	}
//
//	
//}
