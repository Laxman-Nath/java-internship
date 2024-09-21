package Collections.Set.classwork;

import java.util.Objects;

public class Employee {
private int id;
private String name;
private String address;
public Employee(int id, String name, String address) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
}
@Override
public int hashCode() {
	return Objects.hash(address, id, name);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	return Objects.equals(address, other.address) && id == other.id && Objects.equals(name, other.name);
}

}
