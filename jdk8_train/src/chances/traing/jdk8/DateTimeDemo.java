package chances.traing.jdk8;

import java.sql.Date;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {
	public void instantDemo() {
		Instant start = Instant.now();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Instant end = Instant.now();

		Duration time = Duration.between(start, end);
	}

	public void localDate() {
		LocalDate today = LocalDate.now();
		LocalDate birthDay = LocalDate.of(2006, 11, 3);

		today.plusDays(10);
		today.getMonth();
		String formatted = DateTimeFormatter.ISO_DATE_TIME.format(birthDay);
		DateTimeFormatter.ofPattern("YYYY-MM-dd").format(birthDay);

	}
	
	public void oldDate() {
		LocalDate today = LocalDate.now();
		Date.valueOf(today);
	}

}
