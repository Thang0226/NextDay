public class NextDay {
	public String getNextDay(int day, int month, int year) {
		final String CONCAT_STR = "/";
		int nextDay = day;
		int nextMonth = month;
		int nextYear = year;
		switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
				if (day == 31) {
					nextDay = 1;
					nextMonth++;
				} else {
					nextDay = day + 1;
				}
		}
		return nextDay + CONCAT_STR + nextMonth + CONCAT_STR + nextYear;
	}
}
