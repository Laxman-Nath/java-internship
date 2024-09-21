package Arrays;

public class ArrayPractice4 {

	public static void main(String[] args) {
		int evens[]=new int[50];
		int j=0;
		for(int i=1;i<=100;i++) {
			if(i%2 == 0) {
				evens[j]=i;
				j++;
			}
		}
     
		for(int e:evens) {
			System.out.println(e);
		}
	}

}
