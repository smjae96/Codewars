package codewars_0222.sol;

public class Solution {

	public int Solution(int number) {
		int num = 0;
		int sum = 0;
		while(num<number) {
			if(num%3==0 || num%5==0) {
				sum += num;
				num++;
			} else {
				num++;
				
			}
		}
		return sum;
	}
}
