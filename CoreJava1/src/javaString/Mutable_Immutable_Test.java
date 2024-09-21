package javaString;

public class Mutable_Immutable_Test {
	
	/*
	 * ------------- immutable-------------------------
	 * # we can't edit/modify or change the original state of object
	 * 
	 * 
	 * 
	 * #e.g String,Integer,Float,Double e.t.c
	 * 
	 * 
	 * ---------- Mutable -------------------
	 * # can change state of object at run time.
	 * 
	 * e.g StringBuffer,StringBuilder,ArrayList
	 */
public static void main(String [] args) {
	String s="Hello";
	s.concat("World");
	System.out.println(s);
}
}
