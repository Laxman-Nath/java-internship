package oops;

public class User {
// instance variable
  String username;
  String password;
  
  // default constructor
    User(){
    	username="admin";
    	password="admin123";
    }
    
    User(String username,String password){
    	this(); // calling parameterized constructor
    	this.username=username;
    	this.password=password; // calling instance variable
    	this.printUser(); // calling instance methods.
    }
    
    User(String username){
    	this.username=username;
    }
    
    /*
     * # this keyword represent current object.
     * # we can call instance variable using this keyword.
     * # we can call instance method.
     * # we can call constructors.
     */
  
  void printUser() {
	  System.out.println("User name:"+username);
	  System.out.println("Password:"+password);
  }
  public static void main(String [] args) {
//	  User u=new User();
	  User u=new User("Laxman","csharp@123");
	  u.printUser();
  }
}
