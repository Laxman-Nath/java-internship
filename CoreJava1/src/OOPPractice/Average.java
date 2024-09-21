package OOPPractice;
/*Print the average of three numbers entered by user by creating a class named 'Average' having a method 
to calculate and print the average.*/
public class Average {
int a,b,c;
public Average(int a,int b,int c) {
	this.a=a;
	this.b=b;
	this.c=c;
}

public float avg() {
	return (a+b+c)/3;
}
public void print() {
	System.out.println("Average is:"+this.avg());
}

public static void main(String [] args) {
	Average a=new Average(2,3,4);
	a.print();
}
}
