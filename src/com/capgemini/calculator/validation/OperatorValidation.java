package com.capgemini.calculator.validation;

import java.util.List;

public interface OperatorValidation {
     void checkAllowedOperand(String[] fileAttributes, List<String> allowedOperands);
}
