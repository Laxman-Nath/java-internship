package controlstatements;

public class ForTest {
public static void main(String [] args) {
//	int x=7;
//	int y=9;
//	 x=x+y;
//	 y=x-y;
//	 x=x-y;
//	 System.out.println(x);
//	 System.out.println(y);
	
	int es=0;
	int os=0;
	for(int i=1;i<=100;i++) {
		if(i%2 ==0) {
			es=es+i;
		}
		else {
			os=os+i;
		}
	}
	System.out.println(es);
	System.out.println(os);
}
}