package Arrays;

import java.util.Scanner;

public class ArrayTest {
public static void main(String [] args) {
	// store and print age of 5 students.
	
	int age[]=new int[5];
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<age.length;i++) {
		System.out.println("Enter age for student "+i);
		age[i]=sc.nextInt();
	}
	
	System.out.println("The age of students are:");
	for(int a:age) {
		System.out.println(a);
	}
}
}
