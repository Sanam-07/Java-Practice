package practiceJava;

import java.util.Scanner;

public class qualifiedOrNot {
	static Scanner scanner = new Scanner(System.in);
	static int requiredcreditscore = 20;
	static double requiredsalary = 3000;

	public static void main(String[] args) {
		double salary = getsalary();
		int creditscore = getCreditScore();
		scanner.close();

		boolean qualified = isUserQualified(salary, creditscore);

		notifyUser(qualified);
	}

	public static double getsalary() {
		System.out.println("Enter your salary");
		double salary = scanner.nextDouble();
		return salary;
	}

	public static int getCreditScore() {
		System.out.println("Enter the creditscore");
		int creditScore = scanner.nextInt();
		return creditScore;
	}

	public static boolean isUserQualified(double salary, int creditscore) {
		if (creditscore >= requiredcreditscore && salary >= requiredsalary) {
			return true;
		} else {
			return false;
		}
	}

	public static void notifyUser(boolean isQualified) {
		if (isQualified) {
			System.out.println("Congrats you are qualified");
		} else {
			System.out.println("Sorry.not qualified");
		}

	}
}
