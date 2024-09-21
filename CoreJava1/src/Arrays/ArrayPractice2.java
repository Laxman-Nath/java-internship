package Arrays;

import java.util.Scanner;

public class ArrayPractice2 {

	public static void main(String[] args) {
		String []cities=new String[6];
		
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<cities.length;i++) {
			System.out.println("Enter name of city "+(i+1));
			cities[i]=sc.next();
		}
		
		System.out.println("The cities are:");
		for(String city:cities) {
			System.out.println(city);
		}

	}

}
