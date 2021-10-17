package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Order;

class StringCalculatorShould {
	
	//Empty String test case
    @Test
    @Order(1)
    void empty_string_should_return_0() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(0, stringCalculator.add(""));
    }
    
    //String with single numbers test case
    @Test
    @Order(2)
    void string_with_single_number_should_return_number_as_int() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(1, stringCalculator.add("1"));
    }
    
    //String with two numbers test case
    @Test
    @Order(3)
    void string_with_two_number_should_return_sum_of_two_number() {
    	 StringCalculator stringCalculator = new StringCalculator();
    	 assertEquals(3, stringCalculator.add("1,2"));
    }
    
  //String with any numbers test case
    @Test
    @Order(4)
    void string_with_any_number_should_return_sum_of_two_number() {
    	 StringCalculator stringCalculator = new StringCalculator();
    	 assertEquals(27, stringCalculator.add("13,2,5,7"));
    }
    
    //String with new line as delimiters
    //between number test case
    @Test
    @Order(5)
    void string_with_new_line_as_delimeter() {
    	 StringCalculator stringCalculator = new StringCalculator();
    	 assertEquals(6, stringCalculator.add("1\n2,3"));
    }
    
    //String with different delimiters
    //should return sum of two numbers
    //Separated by delimiter
    @Test
    @Order(6)
    void string_with_different_delimiter() {
    	 StringCalculator stringCalculator = new StringCalculator();
    	 assertEquals(3, stringCalculator.add("//;\n1;2"));
    }
    
    
    //String with a single negative number
    //should throw exception
    //negative number not allowed followed by numbers
    @Test
	  @Order(7)
    void string_with_single_negative_number() {
    	 StringCalculator stringCalculator = new StringCalculator();
    	 stringCalculator.add("-7");
    }
    
    //String with a multiple negative number
    //should throw exception
    //negative number not allowed followed by numbers
    @Test
	  @Order(8)
    void string_with_mutiple_negative_number() {
    	 StringCalculator stringCalculator = new StringCalculator();
    	 stringCalculator.add("-7,-3,-4");
    }
    
    
   //Test Case for Numbers bigger than 1000
   //Should be ignored
    @Test
    @Order(9)
    void string_with_number_greater_than_1000() {
    	StringCalculator stringCalculator = new StringCalculator();
   	 	assertEquals(2, stringCalculator.add("1001,2"));
    }
    
    
    //Test Case for no of times 
    //Add method is called
    @Test
    @AfterAll
    static void number_of_times_Add_method_called() {
    	 assertEquals(6, StringCalculator.GetCalledCount());
    }
}
