package practiceJava;

public class star {
	public static void main(String[] args) {
		int k = 1;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4 - i; j++) {
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			System.out.println("");
		}

		int m = 1;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(m);
				System.out.print("\t");
				m++;
			}
			System.out.println("");
		}

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(j);
				System.out.print("\t");
				m++;
			}
			System.out.println("");
		}
		int s = 3;
		int count = 1;
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(count * s);
				System.out.print("\t");
				count++;
			}
			System.out.println("");
		}
	}
}