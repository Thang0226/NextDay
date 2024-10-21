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
					nextMonth = month + 1;
				} else {
					nextDay = day + 1;
				}
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				if (day == 30) {
					nextDay = 1;
					nextMonth = month + 1;
				} else {
					nextDay = day + 1;
				}
				break;
			case 2:
				if (day == 28) {
					nextDay = 1;
					nextMonth = month + 1;
				} else {
					nextDay = day + 1;
				}
				break;
		}

		return nextDay + CONCAT_STR + nextMonth + CONCAT_STR + nextYear;
	}
}
