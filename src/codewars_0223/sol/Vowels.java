package codewars_0223.sol;

public class Vowels {

	public static int getCount(String str) {
		// 내가 쓴 코드
//		int num = 0;
//		for(int i=0; i<str.length(); i++) {
//			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || 
//					str.charAt(i) == 'o' || str.charAt(i) == 'u') {
//				
//				num++;
//			}
//		}
		
//		return num;
		
		// 정규식 이용한 코드
		
		return str.replaceAll("[^aeiou]", "").length();
		// [^] : ^ 뒤에 나오는 문자들이 아닐 때
		// a,e,i,o,u 가 아닌 문자를 없애는 방법. 
		
	}
}
