package com.example.testingadvancedzdjavapol131.tdd;

import com.example.testingadvancedzdjavapol131.Exceptions.DividingByZeroException;

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
}
