package codewars_0428.sol;

import java.util.ArrayList;

public class NumberOfPeopleInTheBus {
	public static int countPassengers(ArrayList<int[]> stops) {
		int on = 0;
		int off = 0;
		for(int i=0; i<stops.size(); i++) {
			on += stops.get(i)[0];
			off += stops.get(i)[1];
		}
		
		return on - off;
	
	}
}
