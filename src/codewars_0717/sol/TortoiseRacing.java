package codewars_0717.sol;

public class TortoiseRacing {
	public static int[] race(int v1, int v2, int g) {
		if(v1 >= v2) {
			return null;
		}
		int time = g * 3600 / (v2-v1);
		int hour = time / 3600;
		int minute = (time%3600) / 60;
		int second = time % 60;
		return new int[] {hour, minute, second};
	}
}
