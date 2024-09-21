package Aggregation;

public class Test {
public static void main(String [] args) {
	Car c=new Car();
	c.setColor("Yellow");
	c.setModel("TATA");
	c.setPrice(1000000);
	
	Employee emp=new Employee();
	emp.setId(8458);
	emp.setName("Laxman");
	emp.setCity("Ktm");
	emp.setCar(c);
	emp.setSalary(40000);
	
	System.out.println("Id "+emp.getId());
	System.out.println("Name "+emp.getName());
	System.out.println("City "+emp.getCity());
	System.out.println("Salary "+emp.getSalary());
	System.out.println("Car "+c);
}
}
