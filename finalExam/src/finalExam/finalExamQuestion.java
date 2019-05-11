
package finalExam;

import java.util.Arrays; 

public class finalExamQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k=4;
		
	    int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        if(containsWithin(a, k)){
        	
        	a[0] =k;
        	
        	for (int l=0;l<a.length;l++) {
        		
        		 System.out.println(a[l]);       		
        		
        	}
        	    	
           
        }

    }

    public static boolean containsWithin(final int[] array, final int b) {

        boolean result = false;

        for(int i : array){
            if(i == b){
                result = true;
                break;
            	}
        	}

        	return result;
    	}

}



