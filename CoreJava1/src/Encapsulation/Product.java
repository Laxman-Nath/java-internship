package Encapsulation;

public class Product {
private int id;
@Override
public String toString() {
	return "Product [id=" + id + ", name=" + name + ", company=" + company + "]";
}
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
private String name;
private String company;

}
