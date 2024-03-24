package codewars_0324.sol;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class HumanReadableTime {
	public static String makeReadable(int seconds) {
		String hourSet2 = null;
		String minuteSet2 = null;
		String secondSet2 = null;
		int hourSet = seconds / (60*60);
		if(hourSet < 10) {
			hourSet2 = "0"+hourSet;
		} else {
			hourSet2 = String.valueOf(hourSet);
		}
		
		int minuteSet = (seconds / 60) % 60;
		if(minuteSet < 10) {
			minuteSet2 = "0"+minuteSet;
		} else {
			minuteSet2 = String.valueOf(minuteSet);
		}
		int secondSet = seconds % 60;
		if(secondSet < 10) {
			secondSet2 = "0"+secondSet;
		} else {
			secondSet2 = String.valueOf(secondSet);
		}
		
		return hourSet2 + ":"+minuteSet2+":"+secondSet2;
		
	}
}
