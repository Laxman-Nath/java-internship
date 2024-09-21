package Aggregation;

public class Employee {
private int id;
private String name;
private int Salary;
private String city;

private Car car; // has a relationship

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

public int getSalary() {
	return Salary;
}

public void setSalary(int salary) {
	Salary = salary;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public Car getCar() {
	return car;
}

public void setCar(Car car) {
	this.car = car;
}
}
