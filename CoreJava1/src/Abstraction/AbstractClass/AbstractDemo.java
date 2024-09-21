package Abstraction.AbstractClass;
abstract class Vehicle{
    abstract void getNumber();
    abstract void getPrice();
    void getCompany() {
    	System.out.println("TATA");
    }
}

class Car extends Vehicle{

	@Override
	void getNumber() {
		System.out.println("454342df");
		
	}

	@Override
	void getPrice() {
		System.out.println("123456");
		
		
	}
	void getMilage() {
		System.out.println("121");
	}
	
}
public class AbstractDemo {


public static void main(String [] args) {
	Vehicle v=new Car();
	v.getCompany();
	v.getPrice();
	((Car) v).getMilage();
	
}
}
