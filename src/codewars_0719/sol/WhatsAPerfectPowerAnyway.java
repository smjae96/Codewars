package codewars_0719.sol;

public class WhatsAPerfectPowerAnyway {
	public static int[] isPerfectPower(int n) {
		if (n < 2) {
            return null;
        }
        for (int i = 2; i * i <= n; i++) {
            int j = 2;
            while (true) {
                int result = (int) Math.pow(i, j);
                if (result == n) {
                    return new int[]{i, j};
                } else if (result > n) {
                    break;
                }
                j++;
            }
        }
        return null;
	}
}
