package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorShould {
	
	//Empty String test case
    @Test
    void empty_string_should_return_0() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(0, stringCalculator.add(""));
    }
    
    //String with single numbers test case
    @Test
    void string_with_single_number_should_return_number_as_int() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(1, stringCalculator.add("1"));
    }
    
    //String with two numbers test case
    @Test
    void string_with_two_number_should_return_sum_of_two_number() {
    	 StringCalculator stringCalculator = new StringCalculator();
    	 assertEquals(15, stringCalculator.add("13,2"));
    }
    
    
}
