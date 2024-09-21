package Collections.Set.classwork;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
public static void main(String [] args) {
//	Set<Dog> dogs=new HashSet<>();
//	dogs.add(new Dog("tommy","mnr","white"));
//	dogs.add(new Dog("sanu","dhangadi","white"));
//	dogs.add(new Dog("tommy","mnr","white"));
//	dogs.add(new Dog("sanu","dhangadi","white"));
//	dogs.add(new Dog("sanu","dhangadi","white"));
//	for(Dog d:dogs) {
//		System.out.println(d);
//	}
	
	Set<Employee> employees=new HashSet<>();
	employees.add(new Employee(1,"laxman","mnr"));
	employees.add(new Employee(2,"rohit","chaumala"));
	employees.add(new Employee(1,"laxman","mnr"));
	employees.add(new Employee(2,"rohit","chaumala"));
	
	Iterator<Employee> iterator=employees.iterator();
	while(iterator.hasNext()) {
		System.out.println(iterator.next());
	}
}
}
