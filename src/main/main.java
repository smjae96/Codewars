package main;

import codewars_0221.sol.Kata;
import codewars_0222.sol.Solution;
import codewars_0223.sol.Vowels;
import codewars_0224.sol.Kata2;
import codewars_0225.sol.Troll;

public class main {

	public static void main(String[] args) {
		Kata.evenOrOdd(0);	// 0221
		Solution sol = new Solution();	//0222
		System.out.println(sol.Solution(10));
		System.out.println(Vowels.getCount("abcoudefg "));	//0223
		System.out.println(Kata2.numberToString(123));
		System.out.println(Troll.disemvowel("This website is for losers LOL!"));
	}

}
