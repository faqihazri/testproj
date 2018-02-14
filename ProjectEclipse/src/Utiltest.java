import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java .util.Calendar;
import java .util.Date;
public class Utiltest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Date dt = new Date();
		String currentDate = String.valueOf(dt.getDay());
		System.out.println("Current Date is :" + currentDate);
		System.out.println("Current Time is :" + dt.getTime());
		
		Calendar cal = Calendar.getInstance();
		
		   
		String currentCalDate = cal.get(Calendar.DATE) + "/" +  cal.get(Calendar.MONTH) + "/" +  cal.get(Calendar.YEAR) + " " +  cal.get(Calendar.HOUR) + ":" +  cal.get(Calendar.MINUTE) + ":" +  cal.get(Calendar.SECOND) + " "+  cal.getTimeZone().getDisplayName (); 
		System.out.println("Current Date is :" + currentCalDate);
		
		//cal.set(year, month, date, hourOfDay, minute, second);
		int year = Integer.parseInt(args [0]);
		int month = Integer.parseInt(args [1]);
		int date = Integer.parseInt(args [2]);
		int hourOfDay = Integer.parseInt(args [3]);
		int minute = Integer.parseInt(args [4]);
		int second = Integer.parseInt(args [5]);
		
		cal.set(year, (month -1), date, hourOfDay, minute, second);
		
		   
		String yourDate = cal.get(Calendar.DATE) + "/" +  cal.get(Calendar.MONTH + 1) + "/" +  cal.get(Calendar.YEAR) + " " +  cal.get(Calendar.HOUR) + ":" +  cal.get(Calendar.MINUTE) + ":" +  cal.get(Calendar.SECOND) + " "+  cal.getTimeZone().getDisplayName (); 
		*/
		LocalDate localDate = LocalDate.now(); 
		System.out.println("Current Date is :" + localDate);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss a");
		LocalDate parseDate = LocalDate.parse(args[0], formatter);
		
		
		
		System.out.println("your parsed Date is :" + parsedDate.format (formatter));
		
	}

}
