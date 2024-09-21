package methods;

import java.util.Scanner;

public class AreaVolume {
public static int getArea(int l,int b) {
	int area=l*b;
	return area;
}
public static int volume(int area,int h) {
	System.out.println("Area="+area);
	int volume=area*h;
	return volume;
}

public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	int l,b,h;
	System.out.println("Enter length,breadth and height:");
	l=sc.nextInt();
	b=sc.nextInt();
	h=sc.nextInt();
	int a=getArea(l,b);
	System.out.println("Volume="+volume(a,h));
}
}
