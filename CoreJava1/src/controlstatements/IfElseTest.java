package controlstatements;

import java.util.Scanner;

public class IfElseTest {
	/*
	 * # Syntax: if(condition)
	 * { // statements } 
	 * else
	 * { // Statements }
	 * 
	 * OR
	 * 
	 * if(condition)
	 *  //Single Statement 
	 *  else // Single Statement
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the number");
		n = sc.nextInt();
		if (n % 2 == 0) {
			System.out.println(n + " is even");

		} else {
			System.out.println(n + " is odd");
		}
	}
}
