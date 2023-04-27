package DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate myDate=LocalDate.now();
		System.err.println(myDate);
		//current time
		LocalTime myTime=LocalTime.now();
		System.out.println(myTime);
		//current date and time
		LocalDateTime myDateTime=LocalDateTime.now();
		System.out.println("Before format: "+ myDateTime);
		//DateTimeFormatter myDateFormat= DateTimeFormatter.ofPattern("dd-MM-yyy HH:mm:ss");
		//DateTimeFormatter myDateFormat= DateTimeFormatter.ofPattern("MMM-dd-yyy HH:mm:ss");
		DateTimeFormatter myDateFormat= DateTimeFormatter.ofPattern("dd-yyy-MMM");
		String moddateTime=myDateTime.format(myDateFormat);
		System.out.println("After format: " +moddateTime);
		String dateStr="01/01/2023";
		;
		LocalDate date=LocalDate.parse(dateStr,format);
		System.out.println(date);
		
		
		
	}

}
