package com.capgemini.calculator.computation;

import com.capgemini.calculator.operations.*;

public class CalculatorCalculation implements Calculation{
    @Override
    public double doCalculation(int firstNumber, int secondNumber, String operator) {
        Operation addition = new Addition();
        Operation subtraction = new Subtraction();
        Operation multiplication = new Multiplication();
        Operation division = new Division();

        double result = 0;
        switch (operator) {
            case "+":
                result = addition.executeOperation(firstNumber, secondNumber);
                break;
            case "-":
                result = subtraction.executeOperation(firstNumber, secondNumber);
                break;
            case "*":
                result = multiplication.executeOperation(firstNumber, secondNumber);
                break;
            case "/":
                if (secondNumber == 0) {
                    throw new ArithmeticException();
                }
                result = division.executeOperation(firstNumber, secondNumber);
                break;
        }
        return result;
    }
}
