package MethodOverriding;

public class Test {
	public static void main(String[] args) {
		// static or early binding of object
		NabilBank nb = new NabilBank();
        nb.getBankName();
        nb.getInterestRate();
        
        //up-casting
        CentralBank b=new NMBBank();
        b.getBankName();
	}
	
	// late or dynamic binding of object
	void printBankInfo(CentralBank b) {
		b.getBankName();
		b.getInterestRate();
	}
}
