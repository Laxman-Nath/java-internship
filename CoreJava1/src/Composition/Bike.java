package Composition;

public class Bike {
     private int price;
     private String color;
     private String company;
     
     // Bike has Engine
     
     class Engine{
    	 int cc;
    	 int number;
    	 String type;
    	 
    	 void printEngine() {
    		 System.out.println("CC="+cc);
    		 System.out.println("Number="+number);
    		 System.out.println("Type="+type);
    	 }
     }
     
     public static void main(String [] args) {
    	 Bike bike=new Bike();
    	 Bike.Engine engine=bike.new Engine();
    	 engine.cc=3443;
    	 engine.number=343545;
    	 engine.type="petrol";
    	 bike.price=50000;
    	 bike.color="red";
    	 bike.company="honda";
    	 engine.printEngine();
    	 
     }
}
