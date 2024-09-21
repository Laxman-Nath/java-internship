package controlstatements;

public class SwitchTest2 {
public static void main(String [] args) {
	String day="ghghgh";
	
	switch(day) {
	case "Sunday":
	case "Monday":
	case "Tuesday":
		System.out.println("System implementation");
		break;
	
	case "Wednesday":
	case "Thursday":
	case "Friday":
		System.out.println("System testing");
		break;
	default:
		System.out.println("Invalid");
		break;
	case "Saturday":
		System.out.println("Day test");
		break;
	}
}
}
