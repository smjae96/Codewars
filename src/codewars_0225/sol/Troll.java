package codewars_0225.sol;

public class Troll {

	public static String disemvowel(String str) {
		// (?i)를 앞에 붙이면 대소문자 구분 없는 정규식
        return str.replaceAll("(?i)[aeiou]", "");
        		
    }
}

