package main;

import java.util.Arrays;
import java.util.List;

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
import codewars_0303.sol.HighAndLow;
import codewars_0304.sol.RemoveChars;
import codewars_0305.sol.ArrayDiff;
import codewars_0306.sol.DescendingOrder;
import codewars_0307.sol.SquareSum;
import codewars_0308.sol.ListFiltering;
import codewars_0311.sol.HelloWorld;
import codewars_0312.sol.SpinWords;
import codewars_0313.sol.IsoGram;
import codewars_0314.sol.ToJadenCase;
import codewars_0315.sol.getXO;

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
		System.out.println(HighAndLow.highAndLow("150 99 100 10 -10 25"));
		System.out.println(RemoveChars.remove("eloquent"));
		System.out.println(Arrays.toString(ArrayDiff.arrayDiff(new int[] {1, 2, 2, 2, 3}, new int[] {2})));
		System.out.println(DescendingOrder.sortDesc(1456456));
		System.out.println(SquareSum.squareSum(new int[]{1,2,2}));
		int u = 1;
//		System.out.println(ListFiltering.filterList(List.of(1,2,"a", "b")));
		System.out.println(HelloWorld.greet());
		System.out.println(SpinWords.spinWords("abcde abc bcdea"));
		System.out.println(IsoGram.isIsogram(""));
		System.out.println(ToJadenCase.toJadenCase(null));
		System.out.println(getXO.getXO("ppxxxxxooodd"));
		System.out.println(BitCounting.countBits(1234));
	}

}
