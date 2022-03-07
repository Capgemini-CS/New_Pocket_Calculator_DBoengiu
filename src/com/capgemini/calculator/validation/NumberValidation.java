package com.capgemini.calculator.validation;

public interface NumberValidation {
    static boolean isNotNumeric(String stringToNumber) {
        try {
            Integer.parseInt(stringToNumber);
        } catch (NumberFormatException e) {
            return true;
        }
        return false;
    }
}
