package CoreJava1;

public class Sum1 {
protected int a=200;
private int b=980;

}
public class Sum2 extends Sum1{
	
}
public class Sum{
public static void main(String [] args) {
Sum2 s=new Sum2();
System.out.println(s.a);
}
}
