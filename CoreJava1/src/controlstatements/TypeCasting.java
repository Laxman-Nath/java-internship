package controlstatements;

public class TypeCasting {
/*
 * --------------Type Casting -----------------------
 * # syntax:
 *            data_type variable=(data_type)value;
 * 1> Implicit(auto) Type casting:
 *        byte -> short -> int -> long -> float -> double
 * 
 * 2>  Explicit(by force) Type Casting:
 *       double -> float -> long -> int -> short -> byte -> char
 */
	
  public static void main(String [] args) {
	  // explicit type casting
	  int x=5678;
	  byte k=(byte)x;
	  
	  // implicit type casting 
	  byte p=124;
	  short q=p;
  }
}
