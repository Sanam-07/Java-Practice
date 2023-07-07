package practiceJava;

public class nepalTraffic implements centralTraffic {
	public static void main(String[] args) {
		centralTraffic a = new nepalTraffic();
		a.greenGo();
		a.redStop();
		a.FlashYellow();
	}

	@Override
	public void greenGo() {
		System.out.println("Go");

	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("Stop");
	}

	@Override
	public void FlashYellow() {
		// TODO Auto-generated method stub
		System.out.println("Be in ready position");

	}

}
