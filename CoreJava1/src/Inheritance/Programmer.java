package Inheritance;

public class Programmer extends Employee {
String language;
String project;
int bonus;
void print() {
	super.print();
	System.out.println("Language="+this.language);
	System.out.println("Project="+this.project);
	System.out.println("Bonus="+this.bonus);
}
}
