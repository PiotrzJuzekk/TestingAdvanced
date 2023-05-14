package com.example.testingadvancedzdjavapol131.parameterized;

import com.example.testingadvancedzdjavapol131.tdd.Calculator;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class CalculatorParamTest {
//    Calculator calculator = new Calculator();

//    CSV = comma separated value
//    1,5,6
//    4,8,12
//    15,15,30
//
//    Also CSV below
//    x,y,expected

    @ParameterizedTest
    @CsvFileSource(resources = "calculator-add-test.csv")
    void whenAddTwoNumbersThenReturnSumOfTheNumbersParameterized(int x, int y, int expected){
        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.add(x, y);

        //then
        Assertions.assertThat(result).isEqualTo(expected);

    }

    @ParameterizedTest
    @CsvFileSource(resources = "calculator-subtract-test.csv")
    void whenSubstractTwoNumbersThenReturnDifferenceOfTheNumbersParameterized(int x, int y, int expected){
        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.subtraction(x, y);

        //then
        Assertions.assertThat(result).isEqualTo(expected);

    }
}
