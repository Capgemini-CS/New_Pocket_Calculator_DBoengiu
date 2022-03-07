package com.capgemini.calculator.operations;

public class Subtraction implements Operation{
    @Override
    public double executeOperation(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }
}
