package com.example.demo.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class Order    {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int oid;
	@Column
	private double amount;
	@Column
	private String status;
	@Column
	private String Orderdate;
	@Column
	private String deliverydate;
	@Column
	private int quantity;
	@Column
	private int cust_id;
	@Column
	private int ship_id;
	@Column
	private int prod_id;
	@OneToOne(cascade = CascadeType.ALL)//important
	@JoinColumn(name="prod_id",insertable=false, updatable=false)
	Product product;
	@OneToOne(cascade = CascadeType.ALL)//important
	@JoinColumn(name="cust_id",insertable=false, updatable=false)
	Customer customer;
	@OneToOne(cascade = CascadeType.ALL)//important
	@JoinColumn(name="ship_id",insertable=false, updatable=false)
	Shipper shipper;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	
	public Order(double amount, String status, String orderdate, String deliverydate, int quantity, int cust_id,
			int ship_id, int prod_id, Product product, Customer customer, Shipper shipper) {
		super();
		this.amount = amount;
		this.status = status;
		Orderdate = orderdate;
		this.deliverydate = deliverydate;
		this.quantity = quantity;
		this.cust_id = cust_id;
		this.ship_id = ship_id;
		this.prod_id = prod_id;
		this.product = product;
		this.customer = customer;
		this.shipper = shipper;
	}




	public Order(double amount, String status, String orderdate, String deliverydate, int quantity, int cust_id,
			int ship_id, int prod_id) {
		super();
		this.amount = amount;
		this.status = status;
		Orderdate = orderdate;
		this.deliverydate = deliverydate;
		this.quantity = quantity;
		this.cust_id = cust_id;
		this.ship_id = ship_id;
		this.prod_id = prod_id;
	}




	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getOrderdate() {
		return Orderdate;
	}
	public void setOrderdate(String orderdate) {
		Orderdate = orderdate;
	}
	public String getDeliverydate() {
		return deliverydate;
	}
	public void setDeliverydate(String deliverydate) {
		this.deliverydate = deliverydate;
	}
	public int getCust_id() {
		return cust_id;
	}
	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}
	public int getShip_id() {
		return ship_id;
	}
	public void setShip_id(int ship_id) {
		this.ship_id = ship_id;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Shipper getShipper() {
		return shipper;
	}
	public void setShipper(Shipper shipper) {
		this.shipper = shipper;
	}
	
	
	public int getQuantity() {
		return quantity;
	}




	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}




	public int getProd_id() {
		return prod_id;
	}




	public void setProd_id(int prod_id) {
		this.prod_id = prod_id;
	}




	public Product getProduct() {
		return product;
	}




	public void setProduct(Product product) {
		this.product = product;
	}




	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Order [oid=" + oid + ", amount=" + amount + ", Orderdate=" + Orderdate + ", deliverydate="
				+ deliverydate + ", cust_id=" + cust_id + ", ship_id=" + ship_id + ", customer=" + customer
				+ ", shipper=" + shipper + "]";
	}
	
	
}
