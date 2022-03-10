package assingments.day1.exp2;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		sc.close();
		int factorial = 1;
		for(int i=1;i<=number;i++)
		{
			factorial = factorial*i;
		}
		System.out.println("The Factorial of "+number+" is "+factorial);

	}

}
