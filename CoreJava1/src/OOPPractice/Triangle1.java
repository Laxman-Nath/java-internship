package OOPPractice;

/*Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating a 
class named 'Triangle' without any parameter in its constructor. */
public class Triangle1 {
	int a, b, c;

	public Triangle1() {
		a = 3;
		b = 4;
		c = 5;
		int perimeter = a + b + c;
		float s = perimeter / 2;
		float area = 0.0f;
		area = (float) Math.sqrt(s * (s - a) * (s - b) * (s - c));
		System.out.println("The perimeter of rectangle is:" + perimeter);
		System.out.println("The area of traingle is:" + area);

	}

	public static void main(String[] args) {
		Triangle1 t1 = new Triangle1();

	}

}
