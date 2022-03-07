package com.capgemini.calculator.operations;

public class Division implements Operation{
    @Override
    public double executeOperation(int firstNumber, int secondNumber) {
        return (double) firstNumber / secondNumber;
    }
}
