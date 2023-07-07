package practiceJava;

import java.util.Scanner;

public class ifElse {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		scanner.close();
		if (i >= 10) {
			System.out.println("Congratulation for sales");
		} else {
			int b = 10 - i;
			System.out.println("you are short of" + b + "sales");
		}
	}
}
