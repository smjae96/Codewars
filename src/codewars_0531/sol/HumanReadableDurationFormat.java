package codewars_0531.sol;

public class HumanReadableDurationFormat {
	public static String formatDuration(int seconds) {
		if(seconds == 0) {
			return "now";
		}
		int year = 60*60*24*365;
		int day = 60*60*24;
		int hour = 3600;
		int minute = 60;
		int resultYear = 0;
		int resultDay = 0;
		int resultHour = 0;
		int resultMinute = 0;
        if(seconds>= year) {
        	resultYear = seconds / year;
        	seconds = seconds - year * resultYear;
        }
        if(seconds>= day) {
        	resultDay = seconds / day;
        	seconds = seconds - day * resultDay;
        } 
        if(seconds>= hour) {
        	resultHour = seconds / hour;
        	seconds = seconds - hour * resultHour;
        }
        if(seconds>= minute) {
        	resultMinute = seconds / minute;
        	seconds = seconds - minute * resultMinute;
        }
        String y = "";
        String d = "";
        String h = "";
        String m = "";
        String s = "";
        
        if(resultYear == 1) {
        	y = "year";
        } else if(resultYear >0 || resultYear != 1) {
        	y = "years";
        }
        if(resultDay == 1) {
        	d = "day";
        } else if(resultDay >0 || resultDay != 1) {
        	d = "days";
        }
        if(resultHour == 1) {
        	h = "hour";
        } else if(resultHour >0 || resultHour != 1) {
        	h = "hours";
        }
        
        if(resultMinute == 1) {
        	m = "minute";
        } else if(resultMinute >0 || resultMinute != 1) {
        	m = "minutes";
        }
        
        if(seconds == 1) {
        	s = "second";
        } else if(seconds >0 || seconds != 1) {
        	s = "seconds";
        }
        
        int nonZeroCnt = 0;
        if(resultYear != 0) nonZeroCnt++;
        if(resultDay != 0) nonZeroCnt++;
        if(resultHour != 0) nonZeroCnt++;
        if(resultMinute != 0) nonZeroCnt++;
        if(seconds != 0) nonZeroCnt++;
        
        String result = "";
        if(nonZeroCnt >=1) {
        	if(resultYear > 0) {
        		result = resultYear + " "+ y;
        		nonZeroCnt--;
        	}
        	if(resultDay > 0) {
        		if(nonZeroCnt>= 2) {
        			if(resultYear == 0) {
        				result += resultDay + " " + d;
        				nonZeroCnt --;
        				
        			} else {
        				result += ", " + resultDay + " " + d;
            			nonZeroCnt --;
        			}     			
        		} else if(nonZeroCnt == 1 && resultYear == 0){
        			result = resultDay + " " + d;
        			nonZeroCnt --;
        		} else {
        			result += " and " + resultDay + " "+ d;
        			nonZeroCnt --;
        		}
        	}
        	if(resultHour > 0) {
        		if(nonZeroCnt>= 2) {
        			if(resultYear == 0 && resultDay == 0) {
        				result += resultHour + " " + h;
        				nonZeroCnt --;
        				
        			} else {
        				result += ", " + resultHour + " " + h;
            			nonZeroCnt --;
        			}
        		} else if(nonZeroCnt == 1 && resultYear == 0 && resultDay == 0) {
        			result = resultHour + " " + h;
        			nonZeroCnt --;
        		}
        		else {
        			result += " and " + resultHour + " "+ h;
        			nonZeroCnt --;
        		}
        	}
        	if(resultMinute >0) {
        		if(nonZeroCnt>= 2) {
        			if(resultYear == 0 && resultDay == 0 && resultHour == 0) {
        				result += resultMinute + " " + m;
        				nonZeroCnt --;
        			} else {
        				result += ", " + resultHour + " " + m;
            			nonZeroCnt --;
        			}
        		} else if(nonZeroCnt == 1 && resultYear == 0 && resultDay == 0 && resultHour == 0) {
        			result = resultMinute + " " + m;
        			nonZeroCnt --;
        		}
        		else {
        			result += " and " + resultMinute + " "+ m;
        			nonZeroCnt --;
        		}
        	}
        	if(seconds > 0) {
        		if(nonZeroCnt>= 2) {
        			if(resultYear == 0 && resultDay == 0 && resultHour == 0 && resultMinute == 0) {
        				result += seconds + " " + s;
        			} else {
        				result += ", " + seconds + " " + s;
            			nonZeroCnt --;
        			}
        		} else if(nonZeroCnt == 1 && resultYear == 0 && resultDay == 0 && resultHour == 0 && resultMinute == 0) {
        			result = seconds + " " + s;
        			nonZeroCnt --;
        		}
        		else {
        			result += " and " + seconds + " "+ s;
        			nonZeroCnt --;
        		}
        	}
        	
        }
        
        return result;
    }
}
