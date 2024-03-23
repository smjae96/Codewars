package codewars_0323.sol;

public class DnaStrand {
	public static String makeComplement(String dna) {
		String[] arr = dna.split("");
		for(int i=0; i<arr.length; i++) {
			if(arr[i].equals("A")) {
				arr[i] = "T";
			} else if(arr[i].equals("T")) {
				arr[i] = "A";
			} else if(arr[i].equals("C")) {
				arr[i] = "G";
			} else if(arr[i].equals("G")) {
				arr[i] = "C";
			}
		}
		
		return String.join("", arr);
	
	}
}
