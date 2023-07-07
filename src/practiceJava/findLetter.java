package practiceJava;

import java.util.Scanner;

public class findLetter {

	public static void main(String[] args) {
		boolean letterfound = false;
		System.out.println("Enter a text:");
		Scanner scanner = new Scanner(System.in);
		String text = scanner.next();
		for (int i = 0; i < text.length(); i++) {
			char currentletter = text.charAt(i);
			if (currentletter == 'A' || currentletter == 'a') {
				letterfound = true;
				break;
			}
		}
		scanner.close();
		if (letterfound) {
			System.out.println("The text contain the letter");
		} else {
			System.out.println("text does not contain letter");
		}
	}

}
