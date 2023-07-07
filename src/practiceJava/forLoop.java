package practiceJava;

import java.util.Scanner;

public class forLoop {
	public static void main(String[] args) {
		System.out.println("Enter the nuuber of item u want to scan");
		Scanner scanner = new Scanner(System.in);
		double itemnumber = scanner.nextDouble();
		double total = 0;
		for (int i = 0; i < itemnumber; i++) {
			System.out.println("Enter price of item:");
			double price = scanner.nextDouble();
			total = total + price;
		}
		scanner.close();
		System.out.println("total price is" + total);
	}
}
