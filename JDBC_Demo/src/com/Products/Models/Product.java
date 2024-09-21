package com.Products.Models;

import java.sql.Date;
import java.time.LocalDate;

public class Product {
private int id;
private String name;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}
public Date getManufacturedDate() {
	return manufacturedDate;
}
@Override
public String toString() {
	return "Product [id=" + id + ", name=" + name + ", company=" + company + ", manufacturedDate=" + manufacturedDate
			+ ", expiryDate=" + expiryDate + "]";
}
public void setManufacturedDate(Date manufacturedDate) {
	this.manufacturedDate = manufacturedDate;
}
public Date getExpiryDate() {
	return expiryDate;
}
public void setExpiryDate(Date expiryDate) {
	this.expiryDate = expiryDate;
}
private String company;
private Date manufacturedDate;
private Date expiryDate;



}
