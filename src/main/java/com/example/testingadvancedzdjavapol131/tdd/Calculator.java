package com.example.testingadvancedzdjavapol131.tdd;

import com.example.testingadvancedzdjavapol131.Exceptions.DividingByZeroException;
import com.example.testingadvancedzdjavapol131.Exceptions.TooLargeNumberException;

public class Calculator {

    public int add(int x, int y) {
        int z = x + y;

        return z;
    }

    public int subtraction(int x, int y){
        int z = x - y;
        return z;
    }

    public int divide(int x, int y){
        if(y == 0){
            throw new DividingByZeroException("Dividing by 0 detected");
        } else {
            return x / y;
        }
    }

    public int multiplication(int x, int y){
        if(y > 111){
            throw new TooLargeNumberException("second number must be smaller than 111");
        } else {
            return x * y;
        }
    }
}
