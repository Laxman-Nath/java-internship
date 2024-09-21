package Arrays;

public class Result {
	public static float[] calculateTotal(float [][] A){
		float B[]=new float[5];
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				B[i]=B[i]+A[i][j];
			}
		}
		 return B;
	}
	
	public static float[] calculatePercentage(float []A) {
		float []B=new float[5];
		for(int i=0;i<A.length;i++) {
			B[i]=(A[i]/500)*100;
		}
		return B;
	}
	
	public static String[] checkResult(float A[][] ) {
	   String B[]=new String[5];
	   for(int i=0;i<5;i++) {
		   B[i]="pass";
		   for(int j=0;j<5;j++) {
			   if(A[i][j]<32.0) {
				   B[i]="fail";
				   break;
			   }
			   
		   }
			   
	   }
	   return B;
	}
	
	public static void printTable(String [] students,String [] subjects,float[][] marks,float [] totalMarks,float[] percentage,String[] remarks)
	{	
		for(int i=0;i<103;i++) {
		    System.out.printf("%c",'_');
			}
			System.out.println();
			
		    System.out.printf("%14s |","Students");
		    System.out.printf("%40s %47s", "Subjects","|");
//		    System.out.printf("%47s", );
		    System.out.println();
		    for(int i=0;i<103;i++) {
		        System.out.printf("%c",'_');
		    	}
		    System.out.println();
		    System.out.printf("%15s|","");
		    for(int i=0;i<5;i++) {
		    	
		    	System.out.printf("%10s|",subjects[i]);
		    }
		    System.out.printf("%10s|","Total");
		    System.out.printf("%10s|","Percentage");
		    System.out.printf("%10s|","Remarks");
		   System.out.println();
			for(int i=0;i<103;i++) {
			    System.out.printf("%c",'_');
				}
			 System.out.println();
		    for(int i=0;i<5;i++) {
		    	System.out.printf("%15s|",students[i]);
		    	for(int j=0;j<5;j++) {
		    		
		    		System.out.printf("%10s|",marks[i][j]);
		    	}
		    	System.out.printf("%10s|", totalMarks[i]);
		    	System.out.printf("%10s|", percentage[i]);
		    	System.out.printf("%10s|",remarks[i]);
		    	System.out.println();
		    }
		    for(int i=0;i<103;i++) {
			    System.out.printf("%c",'_');
				}
	}
 
public static void main(String [] args) {
	String [] students= {"Bikash chand","Laxman nath","Rohit budha","Ramesh bhatt","Bibek chataut"};
	String [] subjects= {"maths","java","physics","dotnet","dsa"};
	float [] []marks= {{90,90,34,56,78},{34,56,78,89,65},{90,78,56,34,32},{90,87,65,43,21},{29,90,87,56,34,78}};
	float totalMarks[]=new float[5];
	float percentage[]=new float[5];
	String remarks[]=new String[5];
	
	totalMarks=calculateTotal(marks);

	
	percentage=calculatePercentage(totalMarks);
	
	remarks=checkResult(marks);
	printTable(students,subjects,marks,totalMarks,percentage,remarks);
	
	
}
	
}