import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class NextDayTest {

	@Test
	@DisplayName("Case 1/1/2018")
	public void testNextDayOfD1M1Y2018() {
		// arrange
		NextDay nextDay = new NextDay();
		int day = 1;
		int month = 1;
		int year = 2018;
		String expected = "2/1/2018";
		// action
		String result = nextDay.getNextDay(day, month, year);
		// assert
		assertEquals(expected, result);
	}

	@Test
	@DisplayName("Case 31/1/2018")
	public void testNextDayOfD31M1Y2018() {
		// arrange
		NextDay nextDay = new NextDay();
		int day = 31;
		int month = 1;
		int year = 2018;
		String expected = "1/2/2018";
		// action
		String result = nextDay.getNextDay(day, month, year);
		// assert
		assertEquals(expected, result);
	}

	@Test
	@DisplayName("Case 30/4/2018")
	public void testNextDayOfD30M4Y2018() {
		// arrange
		NextDay nextDay = new NextDay();
		int day = 30;
		int month = 4;
		int year = 2018;
		String expected = "1/5/2018";
		// action
		String result = nextDay.getNextDay(day, month, year);
		// assert
		assertEquals(expected, result);
	}
}