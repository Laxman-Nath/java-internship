package InnerClass.Anynomous;

@FunctionalInterface
interface Vehicle{
	int getNumber();

}
//interface Vehicle{
//	int getNumber();
//	int getMilage();
//}
public class AnynomousDemo  {

	public static void main(String[] args) {
		
//          Vehicle v=new Vehicle() {
//        	  public int getNumber() {
//        		  return 1234;
//        	  }
//
//			@Override
//			public int getMilage() {
//				// TODO Auto-generated method stub
//				return 23;
//			}
//          };
		
		 Vehicle v=new Vehicle() {

			@Override
			public int getNumber() {
				// TODO Auto-generated method stub
				return 1234343;
			}
			 
		 };

//		Vehicle v= () ->{
//			return 1234;
//		};
          
          System.out.println(v.getNumber());
	}

}
