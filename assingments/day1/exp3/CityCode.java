package assingments.day1.exp3;

import java.util.Scanner;

public class CityCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number...");
		int number = sc.nextInt();
		sc.close();
		System.out.println(CityByCode.getCityByCode(number));

	}

}
