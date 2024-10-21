public class NextDay {
	public String getNextDay(int day, int month, int year) {
		final String CONCAT_STR = "/";
		int nextDay;
		int nextMonth = month;
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
					break;
				}
			case 4:
			case 6:
			case 9:
			case 11:
				if (day == 30) {
					nextDay = 1;
					nextMonth = month + 1;
					break;
				}
			case 2:
				if (isLeapYear(year)) {
					if (day == 29) {
						nextDay = 1;
						nextMonth = month + 1;
						break;
					}
				} else {
					if (day == 28) {
						nextDay = 1;
						nextMonth = month + 1;
						break;
					}
				}
			default:
				nextDay = day + 1;
		}
		return nextDay + CONCAT_STR + nextMonth + CONCAT_STR + year;
	}

	private boolean isLeapYear(int year) {
		if (year % 400 == 0) {
			return true;
		} else if (year % 100 == 0) {
			return false;
		} else return year % 4 == 0;
	}
}
