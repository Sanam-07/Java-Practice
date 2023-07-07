package practiceJava;

import java.util.Scanner;

public class simpleJava {

	public static void main(String[] args) {
		// Get number
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of worked hour:");
		int hour = scanner.nextInt();
		scanner.close();
		// Get hour paid
		System.out.println("Enter the rate:");
		double rate = scanner.nextDouble();
		// Multiply rate and hour
		double sanam = hour * rate;
		// Display
		System.out.println("paid amount:" + sanam);

	}

}
