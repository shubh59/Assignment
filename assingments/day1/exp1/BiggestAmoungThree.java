package assingments.day1.exp1;

import java.util.Scanner;

public class BiggestAmoungThree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Three positive numbers");
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int number3 = sc.nextInt();
		sc.close();
		
		if(number1>number2)
		{
			if(number1>number3)
			{
				System.out.println("The Biggest Number is Number1 "+number1);
			}
			else
			{
				System.out.println("The Biggest Number is Number3 "+number3);
			}
		}
		else
		{
			if(number2>number3)
			{
				System.out.println("The Biggest Number is Number2 "+number2);
			}
			else
			{
				System.out.println("The Biggest Number is Number3 "+number3);
			}
		}
	}

}
