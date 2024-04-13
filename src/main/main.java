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
import codewars_0316.sol.BitCounting;
import codewars_0317.sol.DuplicateEncoder;
import codewars_0318.sol.Accumul;
import codewars_0319.sol.FindOutlier;
import codewars_0320.sol.TenMinWalk;
import codewars_0321.sol.StringToNumber;
import codewars_0322.sol.PigLatin;
import codewars_0323.sol.DnaStrand;
import codewars_0324.sol.HumanReadableTime;
import codewars_0325.sol.RemoveStringSpaces;
import codewars_0326.sol.ConvertStringToCamelCase;
import codewars_0327.sol.HighestScoringWord;
import codewars_0328.sol.DoubleInteger;
import codewars_0329.sol.MaximumSubarray;
import codewars_0330.sol.Maskify;
import codewars_0331.sol.TwoToOne;
import codewars_0401.sol.Sum;
import codewars_0402.sol.GrowthOfAPopulation;
import codewars_0403.sol.PangramChecker;
import codewars_0404.sol.BinaryAddition;
import codewars_0405.sol.RgbToHex;
import codewars_0406.sol.FindTheNextPerfectSquare;
import codewars_0407.sol.FindTheOddInt;
import codewars_0408.sol.StringSplit;
import codewars_0409.sol.CountingSheep;
import codewars_0410.sol.YoureASquare;
import codewars_0411.sol.NumberUnits;
import codewars_0412.sol.DirReduction;
import codewars_0413.sol.WhoLikesIt;


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
		System.out.println(DuplicateEncoder.encode("recede"));
		System.out.println(Accumul.accum("abcde"));
		System.out.println(FindOutlier.find(new int[]{-3, 0, 2, 4, 6}));
		System.out.println(TenMinWalk.isValid(new char[] {'w','e','w','e','w','e','w','e','w','e'}));
		System.out.println(StringToNumber.stringToNumber("150"));
		System.out.println(PigLatin.pigIt("Hello world !"));
		System.out.println(DnaStrand.makeComplement("ATTGC"));
		System.out.println(HumanReadableTime.makeReadable(359999));
		System.out.println(RemoveStringSpaces.noSpace("8 j 8   mBliB8g  imjB8B8  jl  B"));
		System.out.println(ConvertStringToCamelCase.toCamelCase("the-Stealth_Warrior"));
		System.out.println(HighestScoringWord.high("aa b"));
		System.out.println(DoubleInteger.doubleInteger(2));
		System.out.println(MaximumSubarray.sequence(new int[]{-2, 1, -3, 4, -1}));
		System.out.println(Maskify.maskify("Nananananananananananananananana Batman!"));	
		System.out.println(TwoToOne.longest("aretheyhere", "yestheyarehere"));
		System.out.println(Sum.GetSum(0, -1));
		System.out.println(GrowthOfAPopulation.nbYear(1500000, 0.25, 1000, 2000000));
		System.out.println(PangramChecker.check("The quick brown fox jumps over the lazy dog."));
		System.out.println(BinaryAddition.binaryAddition(1, 5));
		System.out.println(RgbToHex.rgb(255, 255, 300));
		System.out.println(FindTheNextPerfectSquare.findNextSquare(114));
		System.out.println(FindTheOddInt.findIt(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5}));
		System.out.println(StringSplit.solution("abcde"));
		System.out.println(CountingSheep.countSheeps(new Boolean[] {true,false,true,true,true}));
		System.out.println(YoureASquare.isSquare(26));
		System.out.println(NumberUnits.isNarcissistic(747729));
		System.out.println(DirReduction.dirReduc(new String[]{"EAST", "EAST", "WEST", "NORTH", "WEST", "EAST", "EAST", "SOUTH", "NORTH", "WEST"}));
		System.out.println(WhoLikesIt.whoLikesIt("Alex", "Jacob", "Mark", "Max"));
	}

}
