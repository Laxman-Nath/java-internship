package OOPPractice;

public class Triangle2 {
	int a,b,c;
	public Triangle2(int a,int b,int c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	public int calculatePeri() {
		return a+b+c;
	}
	
    public float calculateArea() {
    	float s=this.calculatePeri()/2;
    	return (float)Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
public static void main(String [] args) {
	Triangle2 t=new Triangle2(3,4,5);
	System.out.println("Perimeter="+t.calculatePeri());
	System.out.println("Area="+t.calculateArea());
}
}
