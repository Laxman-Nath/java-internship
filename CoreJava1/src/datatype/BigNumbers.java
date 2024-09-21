package datatype;

import java.math.BigInteger;

public class BigNumbers {
	/*
	 * ------------------- For Big Numbers------------------------
	 * a> BigInteger
	 * b> BigDecimal
	 */

	public static void main(String[] args) {
		long sum=Long.MAX_VALUE +Long.MAX_VALUE;
		System.out.println(sum);
		
		BigInteger a=BigInteger.valueOf(Long.MAX_VALUE);
		BigInteger b=BigInteger.valueOf(Long.MAX_VALUE);
		
		BigInteger c=a.add(b);
		System.out.println(c);

	}

}
