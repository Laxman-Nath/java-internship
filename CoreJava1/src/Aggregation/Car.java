package Aggregation;

public class Car {
private String color;
private String Model;
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
@Override
public String toString() {
	return "Car [color=" + color + ", Model=" + Model + ", price=" + price + "]";
}
public String getModel() {
	return Model;
}
public void setModel(String model) {
	Model = model;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
private int price;
}
