package Arrays;
import java.util.Arrays;
public class ArraysUtil {

	public static void main(String[] args) {
		int data[]= {23,45,67,9,12,34,56,77};
         
		Arrays.fill(data,500);
		System.out.println(Arrays.toString(data));
		
		Arrays.fill(data,2,6 ,800);
		System.out.println(Arrays.toString(data));
		
		System.out.println(Arrays.toString(Arrays.copyOf(data, 5)));
	}

}
