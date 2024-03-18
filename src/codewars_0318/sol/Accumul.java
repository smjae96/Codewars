package codewars_0318.sol;

public class Accumul {
	public static String accum(String s) {
//		if(s.length() == 0) {
//			return s;
//		}
//		StringBuilder sb = new StringBuilder();
//		sb.append(s.charAt(0));
//		for(int i=1; i<s.length(); i++) {
//			char ch = s.charAt(i);
//			sb.append('-');
//			sb.append(Character.toUpperCase(ch));
//			char lowCase = Character.toLowerCase(ch);
//			for (int j =0; j<i; j++) {
//				sb.append(lowCase);
//			}
//		}
//		return sb.toString();
		
		// String의 repeat() 메소드 이용해보기
		String[] arr = s.toUpperCase().split("");
		for(int i=0; i<arr.length; i++) {
			arr[i] += arr[i].toLowerCase().repeat(i);
		}
		
		return String.join("-", arr);
	}
}
