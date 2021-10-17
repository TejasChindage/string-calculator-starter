package calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


class StringCalculator {
	
	//List of negative numbers
	List<Integer> list = new ArrayList<Integer>();	
	
	//count to check no of times add method is called
	static int count;
	
	
    public int add(String input) {
    	//Increment count 
    	//Every time add method is called
    	count++;
    	
    	
    	//If input is empty then return 0
		//then execute this condition
    	if(input.isEmpty()) {
    		return 0;
    	}
    	
    	//If input is single digit or a single negative number
		//then execute this condition
    	else if(input.length() == 1 || input.length() == 2) {
    		
    		// return that digit
    		//check for negative number exception
    		// If list length if greater than zero
    		//then throw exception
    		if(list.size() > 0) {
    			throw new RuntimeException("Negatives not allowed "+list.toString());
    		}
    		
    		return convertToInt(input);
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
    			sum  = sum + convertToInt(t);
    		}
    		
    		//check for negative number exception
    		// If list length if greater than zero
    		//then throw exception
    		
    		if(list.size() > 0) {
    			throw new RuntimeException("Negatives not allowed "+list.toString());
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
    			sum  = sum + convertToInt(t);
    		}
    		
    		//check for negative number exception
    		// If list length if greater than zero
    		//then throw exception
    		
    		if(list.size() > 0) {
    			throw new RuntimeException("Negatives not allowed "+list.toString());
    		}
    		
    		return sum;
    	}
    	else {
    		return -1;
    	}
    }
    
    //Method convert string to integer
    private int convertToInt(String input) {
    	int i = Integer.parseInt(input);
    	if(i < 0) {
    		// if a negative number is there
    		//then add to list
    		list.add(i);
    		return 0;
    	}else if(i > 1000) {
    		//if a number is grater than 1000
    		//the ignore it and return 0
    		return 0;
    	}else {
    		return i;
    	}
    }

	public static int GetCalledCount() {
		return count;
	}

}