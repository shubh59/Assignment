package ass3.Day2.org.demo.client;

import ass3.Day2.org.demo.tools.Calculator;

public class MathTester {

	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		System.out.println(calculator.add(57, 78));
		System.out.println(calculator.multiply(43, 23));
		System.out.println(calculator.subtract(598, 468));

	}

}
