package practiceJava;

import java.util.Scanner;

public class AverageSum {

	public static void main(String[] args) {
		int numberofstudent = 24;
		int numberoftest = 4;

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < numberofstudent; i++) {
			double total = 0;
			for (int j = 0; j < numberoftest; j++) {
				System.out.println("Enter the score on Test" + (j + 1));
				double score = scanner.nextDouble();
				total = total + score;
			}
			double averagescore = total / numberoftest;
			System.out.println("The average test score of student" + (i + 1) + "is" + averagescore);
		}
		scanner.close();

	}

}
