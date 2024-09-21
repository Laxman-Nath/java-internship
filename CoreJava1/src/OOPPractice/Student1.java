package OOPPractice;
/*Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. Assign the value 
of roll_no as '2' and that of name as "John" by creating an object of the class Student */
public class Student1 {
    String  name;
    int roll;
	public Student1(String name,int roll) {
		this.name=name;
		this.roll=roll;
	}
	
	public void printData() {
		System.out.println("Name="+this.name);
		System.out.println("Roll="+this.roll);
	}
	public static void main(String[] args) {
		Student1 st=new Student1("Laxman",1);
         st.printData();
	}

}
