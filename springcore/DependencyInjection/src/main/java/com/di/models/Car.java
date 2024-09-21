package com.di.models;

public class Car {
private String color;
private String company;
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}
public Car(String color, String company) {
	super();
	this.color = color;
	this.company = company;
}
public Car() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Car [color=" + color + ", company=" + company + "]";
}


}
