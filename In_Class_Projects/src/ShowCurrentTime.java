
public class ShowCurrentTime {
	public static void main(String[] args) {
		long totalMillisecs= System.currentTimeMillis();
		
		//Obtain total seconds since January 1 1970
		long totalSeconds= totalMillisecs / 1000;
		
		//Obtain Current Seconds
		long currentSeconds= totalSeconds % 60;
		
		//Obtain total minutes since UNIX epoch
		long totalMinutes= totalSeconds / 60;
		
		//Current Minutes
		long currentMinutes= totalMinutes % 60;
		
		//Total Hours
		long totalHours = totalMinutes / 60;
		
		//Current Hour
		long currentHour= totalHours % 24;
		
		//Display Results
		System.out.println("Current time is "+ currentHour + ":" + currentMinutes + ":" 
		+ currentSeconds + "GMT");
		
		}

}
