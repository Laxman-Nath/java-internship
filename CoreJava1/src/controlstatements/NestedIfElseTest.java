package controlstatements;

public class NestedIfElseTest {
	public static void main(String[] args) {
      String citizen="Nepali";
      int age=30;
      boolean haveVoterId=false;
      
      if(citizen.equals("Nepali")) {
    	  if(age >= 18) {
    		  if(haveVoterId) {
    		  System.out.println("You can vote");
    		  }
    		  else {
    			  System.out.println("You dont't have voter id");
    		  }
    	  }
    	  else {
    		  System.out.println("You are under age !!!!!!!");
    	  }
      }
      else {
    	  System.out.println("Invalid citizen");
      }
	}
}
