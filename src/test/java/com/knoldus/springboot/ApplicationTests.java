package com.knoldus.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ApplicationTests {
	Application application = new Application();
	Date dateObj = new Date();
	@Test
	void statusWithTimeTestPass() {
		String result = application.statusWithTime();
		DateFormat timeFormat = new SimpleDateFormat("hh:mm:ss");
		String localTime = timeFormat.format(dateObj);
		assertEquals(result, "Running ".concat(localTime));
	}
	@Test
	void statusWithTimeTestFail() {
		String result = application.statusWithTime();
		String timeFormat = String.valueOf(LocalTime.now());
		assertNotEquals(result,("Running ".concat(timeFormat)));
	}
}


