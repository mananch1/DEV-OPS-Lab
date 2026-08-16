package com.vit.demo;

import org.junit.jupiter.api.Test; 
import static org.junit.jupiter.api.Assertions.assertEquals; 

public class CalculatorTest{
    @Test
    public void testAddition(){
        Calculator calc = new Calculator();
        int result = calc.add(10,20);
        
        assertEquals(30,result);
    }
}