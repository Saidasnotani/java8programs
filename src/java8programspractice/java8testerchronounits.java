package java8programspractice;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class java8testerchronounits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		LocalDate today = LocalDate.now();
	      System.out.println("Current date: " + today);
			
	      //add 1 week to the current date
	      LocalDate nextWeek = today.plus(1, ChronoUnit.WEEKS);
	      System.out.println("Next week: " + nextWeek);
	      
	      System.out.println("Four days later : "+today.plusDays(4)); 
	      
	      	      
	      System.out.println("two days later:"+today.plus(2,ChronoUnit.DAYS));
	      
	      //add 1 month to the current date
	      LocalDate nextMonth = today.plus(1, ChronoUnit.MONTHS);
	      System.out.println("Next month: " + nextMonth);
			
	      System.out.println("2 months later:"+today.plusMonths(2));
	      
	      //add 1 year to the current date
	      LocalDate nextYear = today.plus(1, ChronoUnit.YEARS);
	      System.out.println("Next year: " + nextYear);
			
	      //add 10 years to the current date
	      LocalDate nextDecade = today.plus(1, ChronoUnit.DECADES);
	      System.out.println("Date after ten year: " + nextDecade);
	}

}
