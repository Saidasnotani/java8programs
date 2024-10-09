package java8programspractice;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.time.DayOfWeek;

public class java8testTemporalAdjusters {

	
	   public static void main(String args[]) {
	
	 
	      //Get the current date
	      LocalDate date1 = LocalDate.now();
	      System.out.println("Current date: " + date1);
			
	      //get the next tuesday
	      LocalDate nextTuesday = date1.with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
	      System.out.println("Next Tuesday on : " + nextTuesday);
			
	      //get the second saturday of next month
	      LocalDate firstInYear = LocalDate.of(date1.getYear(),date1.getMonth(), 1);
	      LocalDate secondSaturday = firstInYear.with(TemporalAdjusters.nextOrSame(
	         DayOfWeek.SATURDAY)).with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
	      System.out.println("firstInYear : "+firstInYear);
	      System.out.println("first sat:"+firstInYear.with(TemporalAdjusters.nextOrSame(DayOfWeek.SATURDAY)));
	      System.out.println("Second Saturday on : " + secondSaturday);
	      System.out.println("fourth saturday :"+ secondSaturday.plusWeeks(2)); // saidas created
	      System.out.println("last saturday : "+firstInYear.with(TemporalAdjusters.lastInMonth(DayOfWeek.SATURDAY)));
	      System.out.println("last thursday : "+firstInYear.with(TemporalAdjusters.lastInMonth(DayOfWeek.THURSDAY)));
	   }
	}
