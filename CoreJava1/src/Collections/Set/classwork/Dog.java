package Collections.Set.classwork;

import java.util.Objects;

public class Dog {
private String name;
private String address;
private String color;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public Dog(String name, String address, String color) {
	super();
	this.name = name;
	this.address = address;
	this.color = color;
}
@Override
public int hashCode() {
	return Objects.hash(address, color, name);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Dog other = (Dog) obj;
	return Objects.equals(address, other.address) && Objects.equals(color, other.color)
			&& Objects.equals(name, other.name);
}
@Override
public String toString() {
	return "Dog [name=" + name + ", address=" + address + ", color=" + color + "]";
}
public Dog() {
	super();
	// TODO Auto-generated constructor stub
}

}
