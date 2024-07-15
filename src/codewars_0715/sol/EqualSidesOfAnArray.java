package codewars_0715.sol;

public class EqualSidesOfAnArray {
	public static int findEvenIndex(int[] arr) {
		int totalSum = 0;
        int leftSum = 0;
        
        for (int num : arr) {
            totalSum += num;
        }
        
        for (int i = 0; i < arr.length; i++) {
            totalSum -= arr[i];
            
            if (leftSum == totalSum) {
                return i;
            }
            
            leftSum += arr[i];
        }
        
        return -1;
	}
}
