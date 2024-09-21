package datatype;

public class WrapperTest {
/*
 * -------------- Wrapper Classes ------------------------------
 * # every primitive data type has an associated Wrapper class
 * # wrapper class contains so many in built methods that are use to process
 * primtive values/data/
 * 
 * Primitive_type           Wrapper_type
 * --------------           ---------------------------
 * byte                       Byte
 * short                      Short
 * int                        Integer
 * long                        Long
 * double                      Double
 * char                        Character
 * boolean                     Boolean
 * 
 */
	
/*----------------------------- Auto-boxing--------------------------------
 * conversion of primitive to wrapper
 * long m=46666666666666666;
 * Long n=m;
 */
	
	/*----------------------------- Auto un-boxing--------------------------------
	 * conversion of  wrapper to primitive
	 * Double m=46666.6567;
	 * double n=m;
	 */
	
 public static void main(String [] args) {
	 System.out.println(Integer.toBinaryString(123454));
	 System.out.println(Integer.toHexString(438278));
 }
}
