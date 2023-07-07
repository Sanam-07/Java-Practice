package practiceJava;

public class handalingString {

	public void setData() {
		System.out.println(" I am in second class method");
	}

	public void pamadrom() {
		String a = "madam";
		String t = "";
		for (int i = a.length() - 1; i >= 0; i--) {
			t = t + (a.charAt(i));
		}
		System.out.println(t);
		if (t.equals(a)) {
			System.out.println("it is palanodroma");
		} else {
			System.out.println("it is not");
		}
	}

	public static void main(String[] args) { // TODO Auto-generated method stub

		// String : it is one of the prebuilt class in java /* 1.String literal
		String a = "javatraining";
		System.out.println(a.charAt(2));
		System.out.println(a.indexOf("e"));
		System.out.println(a.substring(3, 6));
		System.out.println(a.substring(5));
		System.out.println(a.concat("Sanam"));
		System.out.println(a.trim());
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		String arr[] = a.split("t");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(a.replace("t", "s"));
		handalingString sanam = new handalingString();
		sanam.setData();
		sanam.pamadrom();

		// creating object of string*/ String a= " javatraining";//string
		// System.out.println(a.charAt(2)); System.out.println(a.indexOf("e"));
		// System.out.println(a.substring(3, 6)); System.out.println(a.substring(5));
		// System.out.println(a.concat("rahul teaches")); //a.length()
		// System.out.println(a.trim()); a.toUpperCase(); a.toLowerCase(); //split
		// String arr[]=a.split("t"); System.out.println(arr[0]);
		// System.out.println(arr[1]); System.out.println(a.replace("t", "s"));

	}

}
