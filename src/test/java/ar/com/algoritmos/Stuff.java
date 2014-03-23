package ar.com.algoritmos;

public class Stuff {

    public static int getCountOfOnes(int n) {
        /*
         Please implement this method to
         return the number of '1's in the binary representation of n
         for any integer n, where n > 0

         Example: for n=6 the binary representation is '110' and the number of '1's in that 
         representation is 2

        */
    	
    	int count = 0;
    	String value = Integer.toBinaryString(n);
    	for (int i = 0; i < value.length() ; i++) {
    		if (value.charAt(i) == '1') 
    			count++;
    	}
    	
    	return count;
    }
}
