package practiceJava;

import java.util.Scanner;

public class salaryCalculator {

	public static void main(String[] args) {
		int salary=1000;
		System.out.println("enter number of sales");
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		scanner.close();
		if (i > 10) {
			int totalsalary = salary+250;
			System.out.println(totalsalary);
		} else {
			System.out.println(salary);
		}

	}

}
