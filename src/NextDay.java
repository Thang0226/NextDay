public class NextDay {
	public String getNextDay(int day, int month, int year) {
		final String CONCAT_STR = "/";
		int nextDay = day + 1;
		return nextDay + CONCAT_STR + month + CONCAT_STR + year;
	}
}
