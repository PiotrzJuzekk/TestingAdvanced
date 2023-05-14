package com.example.testingadvancedzdjavapol131.exception;

import com.example.testingadvancedzdjavapol131.Exceptions.DividingByZeroException;
import com.example.testingadvancedzdjavapol131.Exceptions.TooLargeNumberException;
import com.example.testingadvancedzdjavapol131.tdd.Calculator;
import org.assertj.core.api.Assertions;
import org.assertj.core.data.Percentage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorExceptionTest {
    @Test
    void whenTryToDivideByZeroThenDividingByZeroExceptionIsThrown(){
        //given
        Calculator calculator = new Calculator();
        //when
        // +
        //then
        assertThrows(DividingByZeroException.class, () -> calculator.divide(3, 0));
    }

    @Test
    void whenSecondNumberIsTooLargeExceptionIsThrow(){
        // given
        Calculator calculator = new Calculator();
        // when
        // +
        // then
        assertThrows(TooLargeNumberException.class, () -> calculator.multiplication(5, 120));
    }
}
