package FunctionalInteface;

import java.util.UUID;

@FunctionalInterface
public interface AccountService {
   String getAccountNumber();
   
}

//class ABCBank implements AccountService{
//
//	@Override
//	public String getAccountNumber() {
//		// TODO Auto-generated method stub
//		return UUID.randomUUID().toString().substring(1,8);
//	}
//	
//}


