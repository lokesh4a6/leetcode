package java8Features;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateChanges {
	
	public static void main(String[] args) {
		
		// using zonedDateTime
		
		ZonedDateTime zonedDatetimee = ZonedDateTime.now(ZoneId.of("Asia/Calcutta"));
		ZonedDateTime zonedDatetimee1 = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("Asia/Tokyo"));
		zonedDatetimee1.getDayOfMonth();
		zonedDatetimee1.getDayOfWeek();
		zonedDatetimee1.getDayOfYear();
		
		var backDate = LocalDateTime.now().minusDays(10);
		System.out.println(backDate);
		
		var datecompare = (LocalDateTime.now().minusDays(20)).compareTo(LocalDateTime.now().minusDays(10));
		System.out.println(datecompare);
		
		
		
		
	}

}
