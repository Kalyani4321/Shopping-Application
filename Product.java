package com.example.demo.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name="product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int prod_id;
	@Column
	private String prod_name;
	@Column
	private String prod_image;
	@Column
	private String prod_desc;
	@Column
	private double price;
	@Column
	private int qty;
	@Column 
	private int cat_id;
//	@ManyToOne(cascade = CascadeType.ALL)//important
//    //@OnDelete(action = OnDeleteAction.CASCADE)
//	@JoinColumn(name="cat_id",insertable=false, updatable=false)
//	public Category category;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String prod_name, String image,String prod_desc, double price, int qty, int cat_id, Category category ) {
		super();
		this.prod_name = prod_name;
		this.prod_desc = prod_desc;
		this.prod_image=image;
		this.price = price;
		this.qty = qty;
		this.cat_id = cat_id;
		//this.category=category;
	}
	public Product(String prod_name,String image, String prod_desc, double price, int qty, int cat_id) {
		super();
		this.prod_name = prod_name;
		this.prod_desc = prod_desc;
		this.prod_image=image;
		this.price = price;
		this.qty = qty;
		this.cat_id = cat_id;
	}
	public int getProd_id() {
		return prod_id;
	}
	public void setProd_id(int prod_id) {
		this.prod_id = prod_id;
	}
	public String getProd_name() {
		return prod_name;
	}
	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}
	public String getProd_desc() {
		return prod_desc;
	}
	public void setProd_desc(String prod_desc) {
		this.prod_desc = prod_desc;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}

	public String getProd_image() {
		return prod_image;
	}
	public void setProd_image(String prod_image) {
		this.prod_image = prod_image;
	}
	
	
	public int getCat_id() {
		return cat_id;
	}
	public void setCat_id(int cat_id) {
		this.cat_id = cat_id;
	}
//	public Category getCategory() {
//		return category ;
//	}
//	public void setCategory(Category cat_id) {
//		this.category = cat_id;
//	}



}
