package practiceJava;

import java.util.Scanner;

public class whileLoop {
	public static void main(String[] args) {
		int rate = 15;
		int maxHour = 40;
		System.out.println("Enter the hour u worked");
		Scanner scanner = new Scanner(System.in);
		int workhour = scanner.nextInt();

		while (workhour > maxHour || workhour < 0) {
			System.out.println("Enter valid workhour");
			workhour = scanner.nextInt();
			scanner.close();
		}
		int salary = workhour * rate;
		System.out.println("Total salary is" + salary);
	}
}
