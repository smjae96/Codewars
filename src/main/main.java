package main;

import codewars_0221.sol.Kata;
import codewars_0222.sol.Solution;
import codewars_0223.sol.Vowels;
import codewars_0224.sol.Kata2;
import codewars_0225.sol.Troll;
import codewars_0226.sol.Kata3;
import codewars_0227.sol.Kata4;
import codewars_0228.sol.Solution2;
import codewars_0229.sol.SquareDigit;
import codewars_0301.sol.YesOrNO;
import codewars_0302.sol.Solution3;

public class main {

	public static void main(String[] args) {
		Kata.evenOrOdd(0);	// 0221
		Solution sol = new Solution();	//0222
		System.out.println(sol.Solution(10));
		System.out.println(Vowels.getCount("abcoudefg "));	//0223
		System.out.println(Kata2.numberToString(123));
		System.out.println(Troll.disemvowel("This website is for losers LOL!"));
		System.out.println(Kata3.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
		System.out.println(Kata4.opposite(-10));
		System.out.println(Solution2.whoLikesIt("Peter, Sim"));
		System.out.println(SquareDigit.squareDigits(9119));
		System.out.println(YesOrNO.boolToWord(false));
		System.out.println(Solution3.repeatStr(20, "ABC"));
	}

}
