package calculator;

public class Calculator {

	public static void main(String[] args) {
		System.out.println(addNums(2, 4));
		System.out.println(productNums(5, 2));
		System.out.println(subtractNums(10, 5));
		divideNums(100, 10);

	}

	public static int addNums(int a, int b) {
		return a + b;
	}

	public static int productNums(int a, int b) {
		return a * b;
	}

	public static void divideNums(double a, double b) {
		if (a > b) {
			System.out.println(a / b);
		} else {
			System.out.println("The calculation cannot be performed");
		}
	}

	public static int subtractNums(int a, int b) {
		return a - b;
	}

}
