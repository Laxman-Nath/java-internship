package Abstraction.Interface;

interface Vehicle {
	void getNumber();

	void getPrice();

	default void getCompany() {
		System.out.println("TATA");
	}
	static void getSpeed() {
		System.out.println("high speed");
	}
}

class Car implements Vehicle {

	@Override
	public void getNumber() {
		System.out.println("454342df");

	}

	@Override
	public void getPrice() {
		System.out.println("123456");

	}

	void getMilage() {
		System.out.println("121");
	}

}

public class InterfaceDemo {
	public static void main(String[] args) {
		Vehicle v = new Car();
		v.getNumber();
		v.getCompany();
		Vehicle.getSpeed();
		((Car) v).getMilage();
	}
}
