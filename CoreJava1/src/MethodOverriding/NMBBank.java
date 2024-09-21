package MethodOverriding;

public class NMBBank extends CentralBank {
	@Override
	void getBankName() {
		System.out.println("NMB bank");
	}

	@Override
	void getInterestRate() {
		System.out.println("20%");
	}
}
