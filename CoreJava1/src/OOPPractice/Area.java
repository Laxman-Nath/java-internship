package OOPPractice;
/*1.
Write a program to print the area of a rectangle by creating a class named 'Area' having two methods. 
First method named as 'setDim' takes length and breadth of rectangle as parameters and the second 
method named as 'getArea' returns the area of the rectangle. Length and breadth of rectangle are entered 
through keyboard. */

import java.util.Scanner;

public class Area {
	int length;
	int breadth;
public void setDim(int length,int breadth) {
	this.length=length;
	this.breadth=breadth;
}

public int getArea() {
	return length*breadth;
}
public static void main(String [] args) {
	int length,breadth;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter length of rectangle:");
	length=sc.nextInt();
	System.out.println("Enter breadth of rectangle:");
	breadth=sc.nextInt();
	Area a=new Area();
	a.setDim(length, breadth);
	System.out.println("The area of rectangle is:"+a.getArea());
}
}
