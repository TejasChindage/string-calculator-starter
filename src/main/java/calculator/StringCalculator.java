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
    		
    		StringTokenizer token = new StringTokenizer(input, ",");
    		int sum = 0;
    		while(token.hasMoreElements()) {
    			sum  = sum + Integer.parseInt(token.nextToken());
    			
    		}
    		
    		return sum;
    	}else {
    		return -1;
    	}
    }

}