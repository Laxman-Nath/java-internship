package MethodOverloading;

/*Yes,method overloading in Java is a feature that allows a
class to
have more
than one
method with
the same name,as
long as
their parameter
lists are
different.This difference
in parameter
lists can
be in
the number
of parameters, the
types of parameters,
or the
order of parameters. */

public class Test {

		public static int sum(int a) {
			return a;
		}

		public static int sum(int a, int b) {
			return a + b;
		}

		public static float sum(float a) {
			return (int) a;
		}

		public static float sum(double a) {
			return (float) a;
		}

		public static void main(String[] args) {
			System.out.println(sum(5));
			System.out.println(sum(2, 3));
			System.out.println(sum(3.4f));

		}

}
