package OOPPractice;
/*Assign and print the roll number, phone number and address of two students having names "Sam" and 
"John" respectively by creating two objects of class 'Student'.*/
public class Student2 {
  int rollno;
  long phoneno;
  String address;
  public Student2(int rollno,long phoneno,String address) {
	this.rollno=rollno;
	this.phoneno=phoneno;
	this.address=address;
  }
  
  public void printData() {
	  System.out.println("Rollno="+this.rollno);
	  System.out.println("Phoneno="+this.phoneno);
	  System.out.println("Address="+this.address);
  }
  
  public static void main(String [] args) {
	Student2 st1=new Student2(1,9848885111l,"Daijee");
	Student2 st2=new Student2(2,78438643674l,"Bangaun");
	st1.printData();
	st2.printData();
  }
}
