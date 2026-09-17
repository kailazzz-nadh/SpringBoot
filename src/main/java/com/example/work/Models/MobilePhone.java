package com.example.work.Models;
import jakarta.persistence.Entity;


import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
@Entity
public class MobilePhone {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int id;
	private String phonename;
	private String brand;
	private float price;
	private String type;
	
	public void setId(int id) {
		this.id=id;
	}
	public String getPhonename() {
		return phonename;
	}
	public void setPhonename(String phonename) {
		this.phonename=phonename;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price=price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type=type;
	}

}
