package codewars_0716.sol;

import java.util.List;

public class CountTheSmileyFaces {
	public static int countSmileys(List<String> arr) {
		int count = 0;
        for (String face : arr) {
            
            if (face.length() == 2 || face.length() == 3) {
                char eyes = face.charAt(0);
                char mouth = face.charAt(face.length() - 1);
                char nose = face.length() == 3 ? face.charAt(1) : '\0'; 

                if ((eyes == ':' || eyes == ';') &&
                    (nose == '-' || nose == '~' || nose == '\0') &&
                    (mouth == ')' || mouth == 'D')) {
                    count++;
                }
            }
        }

        return count;
	}
}
