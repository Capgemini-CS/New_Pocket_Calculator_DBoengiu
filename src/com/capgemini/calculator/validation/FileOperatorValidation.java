package com.capgemini.calculator.validation;

import java.util.ArrayList;
import java.util.List;
import org.tinylog.Logger;

public class FileOperatorValidation implements OperatorValidation{
    @Override
    public void checkAllowedOperand(String[] fileAttributes) {
        List<String> allowedOperands = new ArrayList<>(List.of("+", "-", "*", "/"));

        if (!allowedOperands.contains(fileAttributes[2])) {
            Logger.error("You should enter one of these operands {+, -, *, /}");
            System.exit(0);
        }
    }
}
