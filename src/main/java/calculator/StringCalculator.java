package calculator;

import java.util.StringTokenizer;

class StringCalculator {

    public int add(String input) {
    	
    	//If input is empty then return 0
		//then execute this condition
    	
    	if(input.isEmpty()) {
    		return 0;
    	}
    	
    	//If input is single digit
		//then execute this condition
    	
    	else if(input.length() == 1) {
    		// return that digit
    		
    		return Integer.parseInt(input);
    	}
    	
    	//IF input contains , 
    	//then execute this condition
    	
    	else if(input.contains(",")) {
    		
    		//If input contains , 
    		//in between numbers 
    		//OR
    		// '\n' in between numbers
    		//then return sum of all numbers the input contains
    		
    		StringTokenizer token = new StringTokenizer(input, ",\n");
    		int sum = 0;
    		while(token.hasMoreElements()) {
    			String t = token.nextToken();
    			sum  = sum + Integer.parseInt(t);
    		}
    		return sum;
    	}
    	
    	//IF input contains '//' 
    	//then execute this condition
    	
    	else if(input.contains("//")) {
    		
    		//Get the new delimiter first
    		char delim =  input.charAt(2);
    		
    		//get the substring of after '\n'
    		String s = input.substring(input.indexOf("\n") + 1);

    		StringTokenizer token = new StringTokenizer(s, String.valueOf(delim));
    		int sum = 0;
    		while(token.hasMoreElements()) {
    			String t = token.nextToken();
    			sum  = sum + Integer.parseInt(t);
    		}
    		return sum;
    	}
    	else {
    		return -1;
    	}
    }

}