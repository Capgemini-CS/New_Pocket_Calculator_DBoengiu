package com.capgemini.calculator.validation;

import java.util.Objects;

public interface DataValidation {
    void checkLength(String[] fileAttributes);
    void checkIfNull(String[] fileAttributes);
}
