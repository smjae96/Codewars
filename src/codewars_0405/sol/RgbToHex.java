package codewars_0405.sol;

public class RgbToHex {
	
	public static String rgb(int r, int g, int b) {
        if(r>255) r = 255;
        if(g>255) g=255;
        if(b>255) b=255;
        if(r<0) r= 0;
        if(g<0) g= 0;
        if(b<0) b= 0;
        
        String result1 = "";
        String result2 = "";
        String result3 = "";
        
        if(r<16) {
        	result1 = "0"+Integer.toHexString(r);
        } else {
        	result1 = Integer.toHexString(r);
        }
        if(g<16) {
        	result2 = "0"+Integer.toHexString(g);
        } else {
        	result2 = Integer.toHexString(g);
        }
        if(b<16) {
        	result3 = "0"+Integer.toHexString(b);
        } else {
        	result3 = Integer.toHexString(b);
        }
		return (result1 + result2 + result3).toUpperCase();
    }
}
