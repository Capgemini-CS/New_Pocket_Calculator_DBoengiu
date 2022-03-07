package com.capgemini.calculator.output;

import org.tinylog.Logger;

public class CalculatorOutput implements Output{
    @Override
    public void showResult(double result) {
        Logger.info(result);
    }
}
