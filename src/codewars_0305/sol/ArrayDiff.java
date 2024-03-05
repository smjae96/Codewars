package codewars_0305.sol;

import java.util.ArrayList;

public class ArrayDiff {
	public static int[] arrayDiff(int[] a, int[] b) {
		
//		int[] result;
//	    int size = a.length;
//	    if(a.length == 0 || b.length == 0) {
//	    	return a;
//	    } else {
//	    	for(int i=0; i<a.length; i++) {
//	    		for(int j=0; j<b.length; j++) {
//	    			if(a[i] == b[j]) {
//	    				size--;
//	    				break;	// 배열의 길이는 a[i] 하나 당 한 번만 줄어들 수 있음.
//	    			}
//	    		}
//	    	}
//	    	result = new int[size];
//	    	int index = 0;
//	    	int count = 0;
//	    	for(int i=0; i<a.length; i++) {
//	    		count = 0;
//	    		for(int j=0; j<b.length; j++) {
//	    			if(a[i]==b[j]) {
//	    				count++;
//	    				break;
//	    			}
//	    		}
//	    		if(count==0) {
//	    			result[index] = a[i];
//	    			index++;
//	    		}
//	    	}
//	    }
//	    return result;
	    
	    /////////////////////////////////////////////////////////////////////////
	    
		// *참고 답안
	    ArrayList<Integer> output = new ArrayList<>();
	    for(int i=0; i<a.length; i++) {
	    	boolean flag = false;
	    	for(int j=0; j<b.length; j++) {
	    		if(a[i]==b[j]) {
	    			flag = true;
	    			break;
	    		}	
	    	}
	    	if(flag == false) {
	    		output.add(a[i]);
	    	}
	    }
	    int[] result = new int[output.size()];
	    for(int i=0; i<result.length; i++) {
	    	result[i] = output.get(i);
	    }
	    return result;
	    
	    
	    
	    
	}
}
