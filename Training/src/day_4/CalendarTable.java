package day_4;
import java.util.Calendar;

public class CalendarTable {
    public static void main(String[] args) {
        // Get an instance of Calendar
        Calendar calendar = Calendar.getInstance();

        // Retrieve and display the current date and time
        int year = calendar.get(Calendar.YEAR	);
        int month = calendar.get(Calendar.MONTH) + 1; // Months are 0-based
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);

        System.out.println("Current Date and Time: " + day + "/" + month + "/" + year + " " + hour + ":" + minute + ":" + second);
    }

	public static Calendar getInstance() {
		// TODO Auto-generated method stub
		return null;
	}
}

