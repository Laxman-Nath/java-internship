package FunctionalInteface;

import java.util.UUID;

public class Test {
public static void main(String [] args) {
//	AccountService service=new ABCBank();
//	System.out.println(service.getAccountNumber());
	
//	AccountService service=new AccountService() {
//		@Override
//		public String getAccountNumber() {
//			return UUID.randomUUID().toString().substring(1,8);
//		}
//	};
//	System.out.println(service.getAccountNumber());
	
	AccountService service = () ->{
		return UUID.randomUUID().toString().substring(1,8);
	};
	System.out.println(service.getAccountNumber());
}
}
