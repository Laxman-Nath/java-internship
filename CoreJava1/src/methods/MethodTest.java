package methods;

import java.util.Scanner;

public class MethodTest {

    // 1. no return type with no arguments
	static void sum() {
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("Enter value of a:");
		a=sc.nextInt();
		System.out.println("Enter value of b:");
		b=sc.nextInt();
		System.out.println("The sum of "+ a+" and "+ b+ " is "+(a+b) );

	}
	
	// 2.no return type with arguments
	 static void printTable(int num) {
		
			int i=1;
			do {
			System.out.println(num+ " X " + i+" = "+num*i);
			i++;
			}while(i<=10);
	 }
	 
	 // 3.return type with no arguments
	 static int getSumOf1To100() {
		 int sum=0;
		 for(int i=1;i<=100;i++) {
			 sum+=i;
		 }
		 return sum;
	 }
	 
	 // 4.return type with arguments
	 static int getSmallestValue(int a,int b) {
		 if (a < b){
			 return a;
		 }
		 return b;
	 }
	public static void main(String[] args) {
//      sum();
//      printTable(5);
//		System.out.println("Sum="+getSumOf1To100());
		System.out.println(getSmallestValue(10000,20000));
	}

}
