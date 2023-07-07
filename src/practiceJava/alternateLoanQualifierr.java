package practiceJava;

import java.util.Scanner;

public class alternateLoanQualifierr {

	public static void main(String[] args) {
		int requiredsalary = 30000;
		int requiredyear = 2;

		System.out.println("Enter your salary:");
		Scanner sanam = new Scanner(System.in);
		double salary = sanam.nextInt();
		System.out.println("Enter your work experience");
		double year = sanam.nextInt();
		sanam.close();
		if (salary >= requiredsalary && year >= requiredyear) {
			System.out.println("congrats u are qualified for loan");
		} else {
			System.out.println("u must have more than 2 yr experience and 30000 salary");
		}
	}
}
