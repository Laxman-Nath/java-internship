package javaString;

public class StringTest2 {
public static void main(String [] args) {
	String s1="Laxman";
	String s2="Laxman";
	String s3=new String("Laxman");
	System.out.println(s1==s2);
	System.out.println(s1.equals(s2));
	System.out.println(s1==s3);
	System.out.println(s1.equals(s3));
}
}
