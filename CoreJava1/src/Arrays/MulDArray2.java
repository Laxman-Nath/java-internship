package Arrays;

public class MulDArray2 {
public static void main(String [] args) {
	int mat1[][]= {{12,13,14},{1,24,45},{2,3,4}};
	int mat2[][]= {{1,3,4},{1,2,5},{21,33,45}};
    int sum[][]=new int[3][3];
    for(int i=0;i<3;i++) {
    	for(int j=0;j<3;j++) {
    		sum[i][j]=mat1[i][j]+mat2[i][j];
    	}
    }
    for(int i=0;i<3;i++) {
    	for(int j=0;j<3;j++) {
    		System.out.print(sum[i][j]+" ");
    	}
    	System.out.println();
    }
}
}
