package codewars_0302.sol;

public class Solution3 {
	public static String repeatStr(final int repeat, final String string) {
//		String result = string;
//		if(repeat == 0) {
//			return "";
//		} else {
//			for(int i=1; i<repeat; i++) {
//				result += string;
//			}
//        
//			return result;
//		}
		
		// String 클래스의 repeat 메소드 쓰면 매개변수로 받은 int타입 변수의 값만큼 반복가능!
		return string.repeat(repeat);
    }
}
