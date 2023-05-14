package com.example.testingadvancedzdjavapol131.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    void whenAddTwoNumbersThenReturnSumOfTheNumbers(){
        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.add(2,3);

        //then
        Assertions.assertEquals(5, result);
        Assertions.assertNotEquals(4, result);

    }
}
