package ArrayOfObjects;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static  Employee[] createEmployeeArray(Scanner sc) {
	
		Employee[] employees=new Employee[10];
		for(int i=0;i<10;i++) {
			System.out.println("Enter id for employee "+(i+1));
			int id=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter name of employee "+(i+1));
			String  name=sc.nextLine();
			System.out.println("Enter salary employee "+(i+1));
			double salary=sc.nextDouble();
			sc.nextLine();
			System.out.println("Enter department of employee "+(i+1));
			String department=sc.nextLine();
			System.out.println("Enter post of employee "+(i+1));
			String post=sc.nextLine();
			System.out.println("Enter city of employee "+(i+1));
			String city=sc.nextLine();
			employees[i]=new Employee(id,name,salary,department,post,city);
		}
		return employees;
	}
	
	public static void printEmployees(Employee[] employees) {
		for(int i=0;i<employees.length;i++) {
			System.out.println("Id of Employee "+"i "+employees[i].getId());
			System.out.println("Name of Employee "+"i "+employees[i].getName());
			System.out.println("Salary of Employee "+"i "+employees[i].getSalary());
			System.out.println("Department of Employee "+"i "+employees[i].getDepartment());
			System.out.println("Post of Employee "+"i "+employees[i].getPost());
			System.out.println("City of Employee "+"i "+employees[i].getCity());
		}
		
	}
	
	public static double calculateSalary(Employee [] employees) {
		double totalSalary=0.0;
		for(int i=0;i<employees.length;i++) {
			totalSalary+=employees[i].getSalary();
		}
		return totalSalary;
	}
	
	public static int countAdmin(Employee [] employees) {
		int adminCount=0;
		for(int i=0;i<employees.length;i++) {
			if(employees[i].getDepartment().equalsIgnoreCase("admin")) {
				adminCount++;
			}
		}
		return adminCount;
		
	}
	
	public static void countAndPrintParticular(Employee [] employees,Scanner sc) {
		int count=0;
		ArrayList<String> names=new ArrayList<>();
		System.out.println("Enter city");
		String city=sc.nextLine();
		for(int i=0;i<employees.length;i++) {
			if(employees[i].getCity().equalsIgnoreCase(city)) {
				count++;
				names.add(employees[i].getCity());
			}
		}
		
		System.out.println("The total number of employees from "+city+" are");
		System.out.println("The employees from this city are:");
		for(String name:names) {
			System.out.println(name);
		}
	}
	
	public static double calculateSalary(Employee [] emp,Scanner sc) {
		double totalSalary=0.0;
		System.out.println("Enter department");
		String department=sc.next();
		for(int i=0;i<emp.length;i++) {
			if(emp[i].getDepartment().equalsIgnoreCase(department)) {
				totalSalary += emp[i].getSalary();
			}
		}
		return totalSalary;
	}
	
	public static void minMax(Employee emp[]) {
		double minSalary=emp[0].getSalary();
		double maxSalary=emp[0].getSalary();
		for(int i=1;i<emp.length;i++) {
			if(emp[i].getSalary()<minSalary) {
				minSalary=emp[i].getSalary();
			}
			if(emp[i].getSalary()>maxSalary) {
				maxSalary=emp[i].getSalary();
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Employee [] employees=createEmployeeArray(sc);
		printEmployees(employees);

	}

}
