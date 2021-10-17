package calculator;

import java.util.StringTokenizer;

class StringCalculator {

    public int add(String input) {
    	
    	//If input is empty then return 0
    	if(input.isEmpty()) {
    		return 0;
    	}else if(input.length() == 1) {
    		
    		//If input is single digit 
    		// return that digit
    		return Integer.parseInt(input);
    	}else if(input.contains(",")) {
    		
    		//If input contains , 
    		//separate no by 
    		
    		StringTokenizer token = new StringTokenizer(input, ",\n");
    		int sum = 0;
    		
    		while(token.hasMoreElements()) {
    			String t = token.nextToken();
    			sum  = sum + Integer.parseInt(t);
    			
    		}
    		
    		return sum;
    	}else {
    		return -1;
    	}
    }

}