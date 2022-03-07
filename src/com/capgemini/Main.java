package com.capgemini;


import com.capgemini.calculator.computation.CalculatorCalculation;
import com.capgemini.calculator.input.FileInput;
import com.capgemini.calculator.output.CalculatorOutput;
import com.capgemini.calculator.validation.FileDataValidation;
import com.capgemini.calculator.validation.FileNumberValidation;
import com.capgemini.calculator.validation.FileOperatorValidation;
import org.tinylog.Logger;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int firstNumber;
        int secondNumber;
        String operator;


        FileInput input = new FileInput();

        String fileLine = input.getFileLine();
        String[] fileAttributes = fileLine.split(",");

        FileDataValidation fileDataValidation = new FileDataValidation();
        FileOperatorValidation fileOperatorValidation = new FileOperatorValidation();
        FileNumberValidation fileNumberValidation = new FileNumberValidation();

        fileDataValidation.checkLength(fileAttributes);
        fileDataValidation.checkIfNull(fileAttributes);
        fileOperatorValidation.checkAllowedOperand(fileAttributes);
        if (fileNumberValidation.isNotNumeric(fileAttributes[0]) || fileNumberValidation.isNotNumeric(fileAttributes[1])) {
            Logger.error("You should have introduced numbers");
            System.exit(0);
        }

        firstNumber = input.getFirstNumber();
        secondNumber = input.getSecondNumber();
        operator = input.getOperator();

        double result = 0;

        CalculatorCalculation calculation = new CalculatorCalculation();
        try {
            result = calculation.doCalculation(firstNumber, secondNumber, operator);
        } catch (ArithmeticException e) {
            Logger.error("You have tried to divide by zero");
        }


        CalculatorOutput output = new CalculatorOutput();
        output.showResult(result);

    }
}
