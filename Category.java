package com.example.demo.entities;

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
@Table(name="category")
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cat_id;
	@Column
	private String category_name;
	@Column
	private String cat_image;
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Category(String category_name,String cat_image) {
		super();
		this.category_name = category_name;
		this.cat_image=cat_image;
	}


	public int getCat_id() {
		return cat_id;
	}
	public void setCat_id(int cat_id) {
		this.cat_id = cat_id;
	}
	public String getCategory_name() {
		return category_name;
	}
	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}


	public String getCat_image() {
		return cat_image;
	}


	public void setCat_image(String cat_image) {
		this.cat_image = cat_image;
	}
	
	
}
