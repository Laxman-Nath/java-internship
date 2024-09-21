package Arrays;

import java.util.Scanner;

public class ArrayPractice1 {
public static void main(String [] args) {
	float price[]=new float[10];
	float total=0.0f;
	float avg=0.0f;
	
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<price.length;i++) {
		System.out.println("Enter price for book "+(i+1));
		price[i]=sc.nextFloat();
	}
	

	for(float a:price) {
	  total=total+a;
	}
	
	avg=total/price.length;
	System.out.println("The price of books are:");
	for(float a:price) {
		  System.out.println(a);
		}
	
	System.out.println("The total price of books are:"+total);
	System.out.println("The average price of book is:"+avg);
	
}
}
