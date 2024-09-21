package Arrays;

public class ArrayWithMethod {

	/* ---------- Array with methods -------------------------------
	 * 1.Array as return type
	 * 2.Array as parameter
	 * 
	 */
	public static void printArray(int A[]) {
		System.out.println("The array elements are:");
		for(int i=0;i<A.length;i++) {
			System.out.println(A[i]);
		}
	}
	
	public static int[] makeArray() {
		int B[]= {1,2,3,4,5,6};
		return B;
	}
	
	public static void main(String [] args) {
//		int B[]= {1,2,3,4,5,6};
//		printArray(B);
		int A[]=makeArray();
		for(int i=0;i<A.length;i++) {
			System.out.println(A[i]);
		}
	}
	
}
