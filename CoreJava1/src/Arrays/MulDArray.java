package Arrays;

import java.util.Scanner;

public class MulDArray {
/*
 * --------------------- MultiD Array ---------------------------------------
 * # use to represent data in row and  column form/table/matrix
 * 
 * # Syntax:
 * 
 *          data_type array_name[][]=new data_type[][]
 */
	
	public static void main(String [] args) {
		int mat[][]=new int[2][2];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array elements:");
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				mat[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("The array elements are:");
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(mat[i][j]+"  ");
			}
			System.out.println();
		}
	}
}
