package com.capgemini.calculator.operations;

public class Division implements Operation{
    @Override
    public double executeOperation(int firstNumber, int secondNumber) {
        if (secondNumber ==0) {
            throw new ArithmeticException("You tried to divide by zero");
        }
        return (double) firstNumber / secondNumber;
    }
}
