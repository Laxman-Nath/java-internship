package controlstatements;

import java.util.Scanner;

/*
 * # Syntax:
 *         if(condition){
 *             // statements
 *         }
 *         
 *         OR
 *         
 *         if(condition)
 *             //Single Statement
 */
public class IfTest {
	public static void main(String[] args) {
		int salary ;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the salary");
		salary=sc.nextInt();
		if (salary < 40000)
			    salary += 8000;

		System.out.println("Your total salary is:" + salary);
	}
}
