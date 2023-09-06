package EY2808;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;

public class LocalDateTimeClassConcepts {

	public static void main(String[] args) {
		LocalDate today=LocalDate.now();
		System.out.println("Current system date is "+today);
		
		LocalDate indiadate=LocalDate.now(ZoneId.of("Asia/Kolkata"));
		System.out.println("Current system date is "+indiadate);
		
		LocalDate usdate=LocalDate.now(ZoneId.of("US/Central"));
		System.out.println("Current system date is "+usdate);
		
		LocalDate firstday2023=LocalDate.of(2023,Month.JANUARY,1);
		System.out.println("First day of 2023 is "+firstday2023);
		
		LocalDate feb28_2023=LocalDate.of(2023,Month.FEBRUARY,28);
		System.out.println("feb month last date is "+feb28_2023);
		
		LocalDate epochday=LocalDate.ofEpochDay(1000);
		System.out.println("1000th day from epoch day is "+epochday);
		
		LocalDate hunderdth_day_of_2020=LocalDate.ofYearDay(2020,100);
		System.out.println("100th day from epoch day is "+hunderdth_day_of_2020);
	}
}
