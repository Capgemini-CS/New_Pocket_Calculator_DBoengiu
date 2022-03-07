package com.capgemini.calculator.operations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdditionTest {

    Addition addition = new Addition();

    @Test
    void executeAddition() {
        assertEquals(3, addition.executeOperation(1,2));
    }
}