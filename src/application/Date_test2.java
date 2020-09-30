package application;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Date_test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2020-06-25T15:42:07Z"));
		
		System.out.println(sdf.format(d));
		
		Calendar cal = Calendar.getInstance();
		
		cal.setTime(d);
		int minutes = cal.get(Calendar.MINUTE);
		int month = 1 + cal.get(Calendar.MONTH);  // primeiro mês é 0 então tem que somar +1
		
		System.out.println("Minutos: " + minutes);
		System.out.println("Mês: " + month);
	}

}
