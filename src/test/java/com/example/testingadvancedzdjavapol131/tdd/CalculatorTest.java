package com.example.testingadvancedzdjavapol131.tdd;

import org.assertj.core.api.Assertions;
import org.assertj.core.data.Percentage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    void initCalculator(){
        calculator = new Calculator();
    }
    @Test
    void whenAddTwoNumbersThenReturnSumOfTheNumbers(){
        //given
//        Calculator calculator = new Calculator();
//        Calculator initiated in @BeforeEach
        //when
        int result = calculator.add(2,3);

        //then
        assertEquals(5, result);
        assertNotEquals(4, result);
        Assertions.assertThat(result).isPositive();
        Assertions.assertThat(result).isGreaterThan(2);
        Assertions.assertThat(result).isNotZero();
        Assertions.assertThat(result).isCloseTo(4, Percentage.withPercentage(90));
    }

    @Test
    void whenSubtractTwoNumbersReturnDifferenceOfTheNumbers(){
        // given
//        Calculator calculator = new Calculator();
        //when
        int result = calculator.subtraction(8, 5);

        //then
        assertEquals(3, result);
        assertNotEquals(5, result);
        Assertions.assertThat(result).isPositive();
        Assertions.assertThat(result).isGreaterThan(2);
        Assertions.assertThat(result).isLessThan(4);

    }
}
