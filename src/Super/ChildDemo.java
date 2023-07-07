package Super;

public class ChildDemo extends parentClass {

	public ChildDemo() {
		int a = 5;
		System.out.println(a);
		System.out.println(super.a);
	}

	public void snama() {
		super.snama();
		System.out.println("I am in child class");
	}

	public void parent() {
		super.parent();
		System.out.println("I am hulk");
	}

	public static void main(String[] args) {
		ChildDemo s = new ChildDemo();
		s.snama();
		s.parent();

	}
}
