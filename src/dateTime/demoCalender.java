package dateTime;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class demoCalender {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar san = Calendar.getInstance();
		SimpleDateFormat sd = new SimpleDateFormat("M/d/yyyy hh:mm:ss");
		System.out.println(sd.format(san.getTime()));
		System.out.println(san.get(Calendar.DAY_OF_MONTH));
		System.out.println(san.get(Calendar.AM));
	}
}
