package OOPPractice;

import java.util.Scanner;

public class Complex {
  public int a;
  public int b;
  
  public Complex(int a,int b) {
	  this.a=a;
	  this.b=b;
  }
  
  public static Complex add(Complex x,Complex y) {
	 
	  return new Complex(x.a+y.a,x.b+y.b);
  }
  public static Complex subtract(Complex x,Complex y) {
		 
	  return new Complex(x.a-y.a,x.b-y.b);
  }
  
  public static Complex multiply(Complex x,Complex y) {
	  return new Complex(x.a*y.a-x.b*y.b,x.a*y.b+x.b*y.a);
  }
  public  String print() {
	  return a+"+"+b+"i";
  }
	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter real part:");
		a=sc.nextInt();
		System.out.println("Enter imaginary part:");
		b=sc.nextInt();
		Complex c1=new Complex(a,b);
		System.out.println("Enter real part:");
		a=sc.nextInt();
		System.out.println("Enter imaginary part:");
		b=sc.nextInt();
		Complex c2=new Complex(a,b);
		Complex c3=Complex.multiply(c1, c2);
		System.out.println(c3.print());

	}

}
